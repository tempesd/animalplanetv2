package com.animalplanet.animalplanet.sevice.impl;
import com.animalplanet.animalplanet.model.Citas;
import com.animalplanet.animalplanet.sevice.serviceCita;

import jakarta.transaction.Transactional;

import java.util.List;
import com.animalplanet.animalplanet.repository.repositorioCitas;
import com.animalplanet.animalplanet.response.GenericApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicioImplCitas implements serviceCita {

	@Autowired
	repositorioCitas repositorioCitas;

	@Transactional
	@Override
	public GenericApiResponse createCitaDetail(Citas obj) throws Exception {
		GenericApiResponse api = new GenericApiResponse();
		api.setData(repositorioCitas.save(obj));
		return api;
	}

	@Transactional
	@Override
	public GenericApiResponse updateCitaDetail(Citas obj) throws Exception {
		GenericApiResponse api = new GenericApiResponse();
		api.setData(repositorioCitas.save(obj));
		return api;
	}

	@Override
	public GenericApiResponse deleteCitaDetail(Integer id) throws Exception {
		GenericApiResponse api = new GenericApiResponse();
		Citas obj = repositorioCitas.findById(id).orElse(null);

		if (obj != null) {
			repositorioCitas.deleteById(id);
			api.setData(obj);
		} else {
			api.setMsj("No se encontró información de la cita con el id " + id + ".");
			api.setStatus(404);
		}
		return api;
	}

	@Override
	public Citas getCitasDetails(Integer CitaId) {
		return repositorioCitas.findById(CitaId).get();
	}

	@Override
	public List<Citas> getAllCitasDetail() {
		return repositorioCitas.findAll();
	}
}
