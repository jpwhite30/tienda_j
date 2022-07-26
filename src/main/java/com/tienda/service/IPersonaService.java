/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.personas;
import java.util.List;

/**
 *
 * @author Jason Perez
 */
public interface IPersonaService {
    public List<personas> getAllPersona();
    public personas getPersonaByID (long id);
    public void savePersona (personas persona);
    public void delete (long id);
    public personas findByNombre (String nombre);
}
