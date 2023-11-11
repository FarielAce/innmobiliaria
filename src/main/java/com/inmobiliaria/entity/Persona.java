/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected long cuil;
    @Column(table = "domicilios")
    protected Domicilio domicilio;
    protected int telefono;
    @Column(unique = true)
    protected String email;
    protected boolean estado;
}
