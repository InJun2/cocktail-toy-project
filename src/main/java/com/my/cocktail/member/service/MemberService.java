package com.my.cocktail.member.service;

import com.my.cocktail.member.domain.Member;
import com.my.cocktail.member.domain.vo.Email;
import com.my.cocktail.member.dto.request.CreateMemberRequest;
import com.my.cocktail.member.dto.request.UpdateMemberRequest;
import com.my.cocktail.member.dto.response.MemberResponse;
import com.my.cocktail.member.exception.BlankContentJoinException;
import com.my.cocktail.member.repository.MemberRepository;
import com.sun.jdi.request.DuplicateRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse joinMember(CreateMemberRequest request) {
        var member = request.toEntity();
        validateCreateRequest(member);
        duplicateCheckEmail(member.getEmail());
        var result = memberRepository.save(member);

        return result.toResponseDto();
    }

    private void validateCreateRequest(Member member) {
        if(member.getName().isBlank() || member.getPassword().isBlank()) {
            throw new BlankContentJoinException();
        }
    }

    @Transactional(readOnly = true)
    protected void duplicateCheckEmail(Email email) {
        var account = memberRepository.findByEmail(email);
        if(account.isPresent()) {
            throw new DuplicateRequestException();
        }
    }

    @Transactional(readOnly = true)
    public Member searchMember(Long id) {
        var searchMember = memberRepository.findById(id).get();

        return searchMember;
    }

    @Transactional
    public MemberResponse withdrawMember(Long id) {
        var withdrawMember = searchMember(id);
        withdrawMember.withdrawMember();
        memberRepository.save(withdrawMember);

        return withdrawMember.toResponseDto();
    }

    @Transactional
    public MemberResponse updateMember(Long id, UpdateMemberRequest request) {
        var updateMember = searchMember(id);
        updateMember.updateMember(request);

        return updateMember.toResponseDto();
    }
}
