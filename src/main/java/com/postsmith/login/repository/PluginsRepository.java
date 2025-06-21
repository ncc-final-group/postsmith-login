package com.postsmith.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postsmith.login.entity.PluginsEntity;

@Repository
public interface PluginsRepository extends JpaRepository<PluginsEntity, Integer> {
}
