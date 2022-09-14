package com.example.mascotas.client;

import com.example.mascotas.exception.MascotaException;
import com.example.mascotas.model.Age;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class AgeClient {
    @Value("${age.uri}")
    public String ageUri;
    public Age getAgeFromName(String name) throws MascotaException{
        RestTemplate restTemplate = new RestTemplate();
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(ageUri).queryParam("name",name).encode().toUriString();
        ResponseEntity<Age> response = restTemplate.exchange(
                urlTemplate, HttpMethod.GET, null,
                new ParameterizedTypeReference<Age>(){});
        if (response.getStatusCode().equals(HttpStatus.OK))
            return response.getBody();
        else
            throw new MascotaException("Error recuperando la edad");

    }


}
