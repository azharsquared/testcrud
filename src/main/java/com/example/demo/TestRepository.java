package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestEntity,Long> {
    @Query("select user from TestEntity user where user.REMITTER_NAME like :name")
    List<TestEntity> findAll(@Param("name") String name);
}
