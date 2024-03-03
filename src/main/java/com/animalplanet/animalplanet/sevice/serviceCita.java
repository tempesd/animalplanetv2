package com.animalplanet.animalplanet.sevice;

import com.animalplanet.animalplanet.model.Citas;
import com.animalplanet.animalplanet.response.GenericApiResponse;

import java.util.List;

public interface serviceCita {
    public GenericApiResponse createCitaDetail(Citas Citas) throws Exception;
    public GenericApiResponse updateCitaDetail(Citas Citas) throws Exception;
    public GenericApiResponse deleteCitaDetail(Integer CitaId) throws Exception;
    public Citas getCitasDetails(Integer CitaId);
    public List<Citas> getAllCitasDetail();
}
