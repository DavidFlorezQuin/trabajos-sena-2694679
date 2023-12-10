package com.sena.earthcrud.IRepository;

import com.sena.earthcrud.Entity.Ciudad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICiudadRepository extends JpaRepository<Ciudad, Long>{
}
