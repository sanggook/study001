package com.study.jpa.domain.repository;

import com.study.jpa.domain.entity.MemberTEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberTRepository extends JpaRepository<MemberTEntity, Long>{

    MemberTEntity findBymId(String mId);
}
