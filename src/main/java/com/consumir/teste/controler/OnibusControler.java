package com.consumir.teste.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumir.teste.model.Onibus;
import com.consumir.teste.service.OnibusService;

@RestController
public class OnibusControler {
	@Autowired
	private OnibusService onibusService;
	
	@ResponseBody
	@GetMapping (value = "/consulta" )
	
	public void getPlanetByName(){
	
		   String url = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";
		   RestTemplate restTemplate = new RestTemplate();
		   Onibus onibus = restTemplate.getForObject(url, Onibus.class);
		   Object object = restTemplate.getForObject(url, Object.class);
		   
			


		   // I don't know how to get the array of results
		   System.out.print(onibus);
		}
	
	@ResponseBody
	@GetMapping (value = "/cons" )
	public Object getByName(){
		
		   String url = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";
		   Object var = new RestTemplate().getForEntity(url, Object.class).getBody();
		 
		 System.out.print(var);
		 return var;
			}
	

	
	
}
