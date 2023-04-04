package com.my.cocktail.member.controller;


import com.my.cocktail.common.dto.ResponseDto;
import com.my.cocktail.member.dto.request.CreateMemberRequest;
import com.my.cocktail.member.dto.request.UpdateMemberRequest;
import com.my.cocktail.member.dto.response.MemberResponse;
import com.my.cocktail.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/mvp1/member")
public class MemberController {
    private final MemberService memberService;


    @PostMapping
    public ResponseEntity<MemberResponse> joinMember(@Valid @RequestBody CreateMemberRequest request) {
        var response = memberService.joinMember(request);

        return ResponseDto.created(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponse> searchMember(@PathVariable Long id) {
        var response = memberService.searchMember(id).toResponseDto();

        return ResponseDto.ok(response);
    }

    @PatchMapping("/withdraw/{id}")
    public ResponseEntity<Void> withdrawMember(@PathVariable Long id) {
        memberService.withdrawMember(id);

        return ResponseDto.noContent();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<MemberResponse> updateMember(@PathVariable Long id, @Valid @RequestBody UpdateMemberRequest request) {
        var response = memberService.updateMember(id, request);

        return ResponseDto.ok(response);
    }
}
