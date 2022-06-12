package com.test.testing.testRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.testing.testEntity.testEntity;

public interface testRepo extends JpaRepository<testEntity, Integer> {

}
