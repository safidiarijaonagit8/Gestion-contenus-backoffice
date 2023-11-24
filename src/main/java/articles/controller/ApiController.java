package articles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import articles.entity.Articles;
import articles.service.ArticlesService;
import articles.service.EvenementsService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class ApiController {
	
	 @Autowired
	    private ArticlesService articleService;
	 
	 @Autowired
	    private EvenementsService evenementService;
	 
	 @GetMapping("/articles")
	 public List<Articles> loginpage() throws Exception{
	      
		  
		  List<Articles> listeArticles = articleService.getListArticles();
	       
	        return listeArticles;
	    }
	 

}
