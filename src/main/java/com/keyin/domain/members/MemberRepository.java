package com.keyin.domain.members;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    public Member findByName(String name);

    public List<Member> findByIsPremium(boolean isPremium);

    public List<Member> findByPhoneNumber(String phoneNumber);

    public Member findByEmail(String email);

    public List<Member> findByMembershipEndDate(Date membershipEndDate);

}

