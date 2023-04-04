package com.my.cocktail.member.repository;


import com.my.cocktail.member.domain.Member;
import com.my.cocktail.member.domain.vo.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(Email email);
}
