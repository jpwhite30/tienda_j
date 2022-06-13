/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.repository.Persona;
import java.util.List;

/**
 *
 * @author Jason Perez
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaByID (long id);
    public void savePersona (Persona persona);
    public void delete (long id);
}
