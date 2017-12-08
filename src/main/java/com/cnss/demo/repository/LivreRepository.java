package com.cnss.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.demo.domain.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
