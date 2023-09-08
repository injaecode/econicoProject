package com.project.echoeco.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.echoeco.activity.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
