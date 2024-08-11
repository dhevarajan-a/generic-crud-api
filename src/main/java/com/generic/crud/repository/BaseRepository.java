package com.generic.crud.repository;

import com.generic.crud.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
//@Transactional
@Component
public interface BaseRepository extends JpaRepository<BaseEntity, Integer> {

}
