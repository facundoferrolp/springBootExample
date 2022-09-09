package com.example.mascotas.service;

import com.example.mascotas.model.Mascota;
import com.example.mascotas.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    public MascotaRepository mascotaRepository;

    public void save(Mascota mascota){
        mascotaRepository.save(mascota);
    }

    public Mascota findById(long id){
        return mascotaRepository.findById(id).get();
    }

    public List<Mascota> findAll(){
        return mascotaRepository.findAll();
    }
    public List<Mascota> findAll(String nombre){
        return mascotaRepository.findAllByNombre(nombre);
    }
}
