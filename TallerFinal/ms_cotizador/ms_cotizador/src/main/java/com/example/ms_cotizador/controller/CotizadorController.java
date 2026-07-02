package com.example.ms_cotizador.controller;

import com.example.ms_cotizador.dto.CotizacionRequest;
import com.example.ms_cotizador.dto.CotizacionResponse;
import com.example.ms_cotizador.servicce.CotizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cotizar")
public class CotizadorController {

    @Autowired
    private CotizadorService cotizadorService;

    @PostMapping
    public CotizacionResponse cotizar(
            @RequestBody CotizacionRequest request) {

        Double costo =
                cotizadorService.calcularCosto(
                        request.getTipo(),
                        request.getDistancia());

        return new CotizacionResponse(costo);
    }
}
