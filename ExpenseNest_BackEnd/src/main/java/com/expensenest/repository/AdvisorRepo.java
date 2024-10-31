package com.expensenest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensenest.model.Advisor;

@Repository
public interface AdvisorRepo extends JpaRepository<Advisor, Long>{
	
}