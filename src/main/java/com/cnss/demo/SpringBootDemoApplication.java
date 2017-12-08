package com.cnss.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cnss.demo.service.GenreServiceHelper;

@ComponentScan
@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	@Autowired
	GenreServiceHelper genreServiceHelper;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		//genreServiceHelper.saveDefaultGenre();
	}
   
   
}

