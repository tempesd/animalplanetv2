package com.animalplanet.animalplanet.controller;

import com.animalplanet.animalplanet.model.Citas;
import com.animalplanet.animalplanet.response.GenericApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.animalplanet.animalplanet.sevice.serviceCita;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/Citas")
@CrossOrigin
public class controladorCitasServer {
    private static final Logger logger = LoggerFactory.getLogger(controladorCitasServer.class);

	@Autowired
	private serviceCita serviceCita;

	@GetMapping("{id_Cita}")
	public Citas getCitasDetails(@PathVariable("id_Cita") Integer id_Cita) {
		return serviceCita.getCitasDetails(id_Cita);
	}

	@GetMapping
	public List<Citas> getAllCitasDetails() {
		return serviceCita.getAllCitasDetail();
	}

	@PostMapping
	public ResponseEntity<?> createCitaDetail(@RequestBody Citas obj){
		GenericApiResponse api;
		try {
			obj.setId_Cita(null);
			logger.info(obj.toString());
			api = serviceCita.createCitaDetail(obj);
			
			return new ResponseEntity<>(api, HttpStatus.CREATED);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
 
	@PutMapping
	public ResponseEntity<?> updateCitaDetail(@RequestBody Citas obj){
		GenericApiResponse api;
		try {
			logger.info(obj.toString());
			api = serviceCita.updateCitaDetail(obj);
			
			return new ResponseEntity<>(api, HttpStatus.CREATED);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("{id_Cita}")
	public ResponseEntity<?> Eliminar(@PathVariable("id_Cita") Integer id_Cita) throws Exception {
		GenericApiResponse api;
		try {
			api = serviceCita.deleteCitaDetail(id_Cita);
			return ResponseEntity.ok(api);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}

}
