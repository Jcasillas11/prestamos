package es.fplumara.dam1.prestamos.model;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo implements Identificable {

    private String id;
    private String idMaterial;
    private String profesor;
    private LocalDate fecha;

    public Prestamo (String id, String idMaterial, String profesor, LocalDate fecha ) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.profesor = profesor;
        this.fecha = fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getIdMaterial() {
        return idMaterial;
    }

    public String getId() {
        return id;
    }
}
