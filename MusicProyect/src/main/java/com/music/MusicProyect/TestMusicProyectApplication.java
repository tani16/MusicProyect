package com.music.MusicProyect;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.music.model.dao.StylesDao;
import com.music.model.repository.StylesRepository;

@SpringBootApplication
@ComponentScan(basePackages= {"com.music.*"})
@EnableJpaRepositories("com.music.model.repository")
public class TestMusicProyectApplication {
	
	@Autowired
	private static StylesRepository stylesRepository;
	
	public static void main(String[] args) {
				
		Iterable<StylesDao> estilos;
		Optional<StylesDao> estilos1;
		
		estilos1 = stylesRepository.findById((long) 1);
		
		estilos = stylesRepository.findAll();
		
		
		
	}
}
