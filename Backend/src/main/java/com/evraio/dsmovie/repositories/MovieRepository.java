package com.evraio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evraio.dsmovie.entities.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long>{
	
	

}
