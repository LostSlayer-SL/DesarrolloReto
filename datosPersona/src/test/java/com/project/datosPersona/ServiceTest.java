package com.project.datosPersona;

import com.project.datosPersona.service.DatosService;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
    @Mock
    DatosService servicio;

    @Test
   public void testing(){
        List<String>  lista = new ArrayList<>();
        lista.add("Id");
        lista.add("Nombre");
        lista.add("Apellido");
        lista.add("Email");
        Mockito.when(servicio.registro()).thenReturn(lista);
        List<String> listab = servicio.registro();
        System.out.println(listab);
    }

}
