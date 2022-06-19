package com.project.datosPersona.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatosModel {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("email")
     String email;
    @JsonProperty("first_name")
     String firstName;
    @JsonProperty("last_name")
     String lastName;
    @JsonProperty("avatar")
     String avatar;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAvatar() {
        return avatar;
    }
 }

