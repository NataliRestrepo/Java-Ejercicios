package com.example.ms_flota.client;

import com.example.ms_flota.dto.CotizacionRequest;
import com.example.ms_flota.dto.CotizacionResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotizadorClient {

    private final RestTemplate restTemplate =
            new RestTemplate();

    public CotizacionResponse cotizar(
            CotizacionRequest request) {

        String url =
                "http://localhost:8082/cotizar";

        return restTemplate.postForObject(
                url,
                request,
                CotizacionResponse.class);
    }
}
