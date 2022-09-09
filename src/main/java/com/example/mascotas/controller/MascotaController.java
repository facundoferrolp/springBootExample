package com.example.mascotas.controller;


import com.example.mascotas.model.Mascota;
import com.example.mascotas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MascotaController {

    @Autowired
    public MascotaService mascotaService;


    @PostMapping("/mascotas")
    public void create(@RequestBody Mascota mascota){
        mascotaService.save(mascota);
    }

    @GetMapping("/mascotas/{id}")
    public Mascota findBy(@PathVariable Long id){
        return mascotaService.findById(id);
    }

    @GetMapping("/mascotas")
    public Iterable<Mascota> findAll(@RequestParam(required = false) String nombre){
        if (nombre==null)
            return mascotaService.findAll();
        else
            return mascotaService.findAll(nombre);
    }

}
