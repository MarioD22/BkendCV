/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoAP.ProyectoAP.controller;

import com.ProyectoAP.ProyectoAP.exception.resourceNotFoundException;
import com.ProyectoAP.ProyectoAP.model.persona;
import com.ProyectoAP.ProyectoAP.repository.personaRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pc
 */
@RestController
@RequestMapping("/api/v1/")


public class personaController {
    @Autowired
    private personaRepository perRepository;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/persona")
    public List<persona> buscarTodasLasPersonas(){
        return perRepository.findAll();
                                                }
    


@PostMapping("/new/persona")
public void crearPersona( @RequestBody persona per) {
        perRepository.save(per);
    
    
}

@PutMapping("/persona/{id}")
public ResponseEntity<persona> Actualizar(@PathVariable Long id, @RequestBody persona personaDetalle){

    persona perso =perRepository.findById(id)
            .orElseThrow(() -> new resourceNotFoundException("No existe persona con ese Id:" + id));
                  

    perso.setNombre(personaDetalle.getNombre());
    perso.setApellido(personaDetalle.getApellido());
    perso.setEdad(personaDetalle.getEdad());
    perso.setMail(personaDetalle.getMail());
    
    persona ActualizarPerfil = perRepository.save(perso);
    return ResponseEntity.ok(ActualizarPerfil);

}

@DeleteMapping("/persona/{id}")
public ResponseEntity<Map<String, Boolean>> eliminarPersonal(@PathVariable Long id){
 persona perso = perRepository.findById(id)
      .orElseThrow(() -> new resourceNotFoundException("No existe persona con ese Id:" + id));
	
		perRepository.delete(perso);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Perfil Eliminado", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}







}


