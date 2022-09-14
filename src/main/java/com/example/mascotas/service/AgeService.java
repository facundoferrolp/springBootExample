package com.example.mascotas.service;

import com.example.mascotas.client.AgeClient;
import com.example.mascotas.exception.MascotaException;
import com.example.mascotas.model.Age;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgeService {

    @Autowired
    public AgeClient ageClient;

    public Age getAgeFromName(String name)throws MascotaException {
        return ageClient.getAgeFromName(name);
    }
}
