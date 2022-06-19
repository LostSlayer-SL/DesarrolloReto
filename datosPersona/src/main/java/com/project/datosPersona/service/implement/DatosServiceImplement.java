package com.project.datosPersona.service.implement;

import com.project.datosPersona.model.DatosModel;
import com.project.datosPersona.model.PaginaModel;
import com.project.datosPersona.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
@Service
public class DatosServiceImplement implements DatosService {
    @Value("${config.spring.ruta}")
    private String url;

    private final RestTemplate restTemplate;

    @Autowired
    public DatosServiceImplement(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<String> registro() {
        List<String> b;
        PaginaModel pagina = restTemplate.getForObject(url,PaginaModel.class);
        b=registrados(pagina.getDatosModel());
        return b ;
    }

    @Override
    public List<String> registrados(List<DatosModel> dataList) {
        ArrayList<String> resultado = new ArrayList<>();
        for (DatosModel datos : dataList) {
            Integer id = datos.getId();
            String nombre = datos.getFirstName();
            String apellido = datos.getLastName();
            String correo = datos.getEmail();
            String avatar = datos.getAvatar();

            String concat = id + "|" + nombre + "|" + apellido + "|" + correo + "|" + avatar;
            resultado.add(concat);
        }
        return resultado;
    }



}
