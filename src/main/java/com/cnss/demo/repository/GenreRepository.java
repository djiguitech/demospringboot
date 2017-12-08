package com.cnss.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cnss.demo.domain.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	public Genre findByCode(String code);
}
