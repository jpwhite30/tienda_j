/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.pais;
import com.tienda.entity.personas;
import com.tienda.service.IPaisService;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jason Perez
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService PersonaService;

    @Autowired
    private IPaisService PaisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<personas> listaPersona = PersonaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<pais> listaPaises = PaisService.listCountry();
        model.addAttribute("persona", new personas());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute personas persona) {
        PersonaService.savePersona(persona);
        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        personas persona = (personas) PersonaService.getPersonaByID(idPersona);
        List<pais> listaPaises = PaisService.listCountry();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    @GetMapping("/delete/{id}") //eliminar elemento
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
        PersonaService.delete(idPersona);
        return "redirect:/persona";
    }

}
