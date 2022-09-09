package com.example.mascotas.repository;

import com.example.mascotas.model.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MascotaRepository extends CrudRepository<Mascota,Long> {

    @Override
    List<Mascota> findAll();

    List<Mascota> findAllByNombre(String nombre);

}
