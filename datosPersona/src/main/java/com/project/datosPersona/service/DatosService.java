package com.project.datosPersona.service;

import com.project.datosPersona.model.DatosModel;

import java.util.List;

public interface DatosService {
    List<String> registro();
    List<String> registrados(List<DatosModel> dataList);
}
