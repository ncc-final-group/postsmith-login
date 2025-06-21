package com.postsmith.login.repository;

import com.postsmith.login.entity.ThemesEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemesRepository extends JpaRepository<ThemesEntity, Integer> {
	@Query("""
			    SELECT tte.theme, tte.tag
				FROM ThemeTagsEntity tte
				JOIN tte.theme th
				JOIN tte.tag ta
			""")
	List<Object[]> findThemes();
}
