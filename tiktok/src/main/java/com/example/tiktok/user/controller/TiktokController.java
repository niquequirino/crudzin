package com.example.tiktok.user.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tiktok.user.repository.UsuarioRepository;
import com.exemple.tiktok.user.dto.UsuarioDTO;
import com.tiktok.user.model.UsuarioModel; //importações das annotations que usei no codígo


	@RestController
	@RequestMapping("api") //define o caminho para as classe
	public class TiktokController {
		
		@Autowired
		UsuarioRepository repository;
		
		@GetMapping("/pegar")//esse serve para "pegar" o seu tiktok
		public List<UsuarioModel> listar(){ //armazena a lista de usuários.
			return repository.findAll();
		}
		
		@PostMapping("/tiktok")
		 public ResponseEntity<String> salvarUsuario(@RequestBody UsuarioDTO user) {
			  UsuarioModel usuario = new UsuarioModel(user);
			  repository.save(usuario); 
			return ResponseEntity.ok("this is your tiktok video, butterfly"); // usei para retornar respostas HTTP.
	
		}
		
		@PutMapping("/atualizar/{id}") //atualiza as infos
		public List<UsuarioModel> atualizar(@PathVariable Long id, @RequestBody UsuarioModel user) {
		    repository.findById(id);
		    user.setId(id);
		    repository.save(user);
		    return repository.findAll();
		}
		
		@DeleteMapping("/deletar/{id}") //esse serve para deletar o tiktok 
		public void deletar(@PathVariable Long id) {
			repository.deleteById(id);
		}
		
		
	}



