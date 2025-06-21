package com.postsmith.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.postsmith.login.entity.ThemeTagsEntity;
import com.postsmith.login.entity.ThemeTagsId;

@Repository
public interface ThemeTagsRepository extends JpaRepository<ThemeTagsEntity, ThemeTagsId> {
	@Query("""
			    SELECT tte.theme, tte.tag
			    FROM ThemeTagsEntity tte
			""")
	List<Object[]> findThemeTagsOrderByThemeCreatedAtDesc();
}
