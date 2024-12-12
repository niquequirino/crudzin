package com.example.tiktok.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tiktok.user.model.UsuarioModel; //importações de annotations

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> { // extende a interface



}


