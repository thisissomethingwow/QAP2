package com.keyin.domain.members;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberRepository, Long> {

}
