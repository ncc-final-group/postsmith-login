package com.postsmith.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postsmith.login.entity.BlogPluginsEntity;
import com.postsmith.login.entity.BlogPluginsId;

@Repository
public interface BlogPluginsRepository extends JpaRepository<BlogPluginsEntity, BlogPluginsId> {
}
