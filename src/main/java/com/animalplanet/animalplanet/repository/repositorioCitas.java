package com.animalplanet.animalplanet.repository;

import com.animalplanet.animalplanet.model.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioCitas extends JpaRepository<Citas, Integer> {

}
