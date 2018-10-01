package com.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.music.model.dao.ArtistDao;
import com.music.model.dao.StylesDao;
import com.music.model.repository.ArtistRepository;
import com.music.model.repository.StylesRepository;

@RestController
public class GestionController {

	ModelAndView modelAndView = new ModelAndView();
	@Autowired
	private StylesRepository styleRepository;
	@Autowired
	private ArtistRepository artistReposity;
	
	
	@RequestMapping(value="/gestion/newArtist", method = RequestMethod.GET)
	public ModelAndView cargaFormNewArtist() {
		modelAndView.addObject("estilos", styleRepository.findAll());
		modelAndView.setViewName("newArtist");
		return modelAndView;
	}
	
	@RequestMapping(value = "/gestion/newArtist/Add", method = RequestMethod.POST)
    public ModelAndView newArtist(@RequestParam(value = "nameArtist", required=true) String nameArtist, 
    							  @RequestParam(value = "yearArtist", required=true) String yearArtist, 
    							  @RequestParam(value = "nameStyle", required=true) String nameStyle) {

				
		
		modelAndView.addObject("mensaje", "Insertado correctamente");
		modelAndView.setViewName("correcto");
		return modelAndView;	
	}
	
	
}
