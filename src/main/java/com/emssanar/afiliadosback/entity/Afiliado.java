package com.emssanar.afiliadosback.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Afiliado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "nacimiento", nullable = false, length = 10)
    private String nacimiento;

    @Column(name = "direccion", nullable = false, length = 250)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "ips", nullable = false, length = 250)
    private String ips;

    @Column(name = "genero", nullable = false, length = 1)
    private String genero;

    public Afiliado() {
    }

    public Afiliado(Integer id, String nombre, String nacimiento, String direccion, String telefono, String ips, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ips = ips;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
