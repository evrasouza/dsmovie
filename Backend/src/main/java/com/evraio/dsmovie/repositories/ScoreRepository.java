package com.evraio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evraio.dsmovie.entities.Score;

public interface ScoreRepository  extends JpaRepository<Score, Long>{
	
	

}
