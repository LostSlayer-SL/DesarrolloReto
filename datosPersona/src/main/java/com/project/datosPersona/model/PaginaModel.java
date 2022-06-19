package com.project.datosPersona.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PaginaModel {
    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("total")
    int total;
    @JsonProperty("total_pages")
    Integer totalPages;
    @JsonProperty("data")
    List<DatosModel> datosModel;

    public List<DatosModel> getDatosModel() {
        return datosModel;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
