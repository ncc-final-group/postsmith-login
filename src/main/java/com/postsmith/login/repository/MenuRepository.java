package com.postsmith.login.repository;

import com.postsmith.login.entity.BlogsEntity;
import com.postsmith.login.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
	List<MenuEntity> findAllByBlog(BlogsEntity blog);

	void deleteAllByBlog(BlogsEntity blog);
}
