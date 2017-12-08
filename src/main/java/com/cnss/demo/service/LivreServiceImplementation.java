package com.cnss.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnss.demo.domain.Genre;
import com.cnss.demo.domain.Livre;
import com.cnss.demo.repository.LivreRepository;

@Service
public class LivreServiceImplementation implements LivreServiceInterface {
	
	@Autowired
	protected LivreRepository livreRepository;
	
	@Autowired
	protected GenreServiceHelper genreServiceHelper;

	@Override
	public Livre saveLivre(Livre livre) {
		
		return livreRepository.save(livre);
	}

	@Override
	public Boolean deleteLivre(Long livreId) {
		Livre livre =livreRepository.findOne(livreId);
		if(livre !=null){
			livreRepository.delete(livre);
			 return true;
		}
		return false;
	}

	@Override
	public Livre editLivre(Livre livre) {
		return livreRepository.save(livre);
	}

	@Override
	public Livre findLivre(Long livreId) {
	
		return livreRepository.findOne(livreId);
	}

	@Override
	public List<Livre> getAllLivres() {
	
		return  livreRepository.findAll();
		
	}

	@Override
	public List<Genre> getAllGenres() {
		
		return genreServiceHelper.findAll();
	}

}
