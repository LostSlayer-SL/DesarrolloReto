package com.project.datosPersona;

import com.project.datosPersona.controller.PersonaController;

import org.junit.Assert;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatosPersonaApplication.class)
public class DatosPersonaApplicationTests {

	@Autowired
	PersonaController persona;
	@Test
	public void contextLoads() {
		List<String> datoNombre = persona.nombre();
		Assert.assertNotNull(datoNombre);
		System.out.println(datoNombre);
		}

}
