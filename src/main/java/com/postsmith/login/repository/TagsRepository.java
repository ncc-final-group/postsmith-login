package com.postsmith.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postsmith.login.entity.TagsEntity;

@Repository
public interface TagsRepository extends JpaRepository<TagsEntity, Integer> {
}
