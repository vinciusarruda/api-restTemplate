package com.consumir.teste.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumir.teste.model.Onibus;

@Service
public class OnibusService {

	public ResponseEntity<Onibus> consultaOnibus() {
		return new RestTemplate().getForEntity("https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544",
				Onibus.class);
	}
}