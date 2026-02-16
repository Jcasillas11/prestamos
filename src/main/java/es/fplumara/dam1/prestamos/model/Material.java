package es.fplumara.dam1.prestamos.model;

import java.util.Set;

public abstract class Material {

    private EstadoMaterial estado;
    private String id;
    private String nombre;
    private Set<String> etiquetas;

    public Material (EstadoMaterial estado, String id, String nombre, Set<String>etiquetas) {
        this.estado = estado;
        this.id = id;
        this.nombre = nombre;
        this.etiquetas = etiquetas;

    }

    public void setEstado(EstadoMaterial estado) {
        this.estado = estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEtiquetas(Set<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public EstadoMaterial getEstado() {
        return estado;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getEtiquetas() {
        return etiquetas;
    }
}
