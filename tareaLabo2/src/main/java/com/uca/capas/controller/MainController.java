package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.uca.capas.domain.Usuario;

@Controller
public class MainController{
	
	String usuarioC = "Corona";
	String passC = "Virus";
	
	@GetMapping("/Login")
	public String enviarForm(Usuario usuario){
		
		return "Login";
	}
	
	@PostMapping("/Validacion")
	public String procesarForm(Usuario usuario){
		
		String usuarioForm = usuario.getNombre(); 
		String passForm = usuario.getPass();
		
		
		if(usuarioC.equals(usuarioForm) && passC.equals(passForm) ) {
		return "mostrarMensajeV";
		}
		else {
			return "mostrarMensajeF";
			}
	}

}
