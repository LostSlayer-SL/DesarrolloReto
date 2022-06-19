package com.project.datosPersona.controller;

import com.project.datosPersona.model.DatosModel;
import com.project.datosPersona.model.PaginaModel;
import com.project.datosPersona.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.datosPersona.service.implement.DatosServiceImplement;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class PersonaController {
    @Autowired
    DatosService datos;
   @PostMapping("/postRegistro")
   public List<String> nombre (){
        List<String> unificado = datos.registro();
        return unificado;
    }

}
