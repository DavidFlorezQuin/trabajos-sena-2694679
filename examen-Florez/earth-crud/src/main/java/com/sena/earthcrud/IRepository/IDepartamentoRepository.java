package com.sena.earthcrud.IRepository;

import com.sena.earthcrud.Entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDepartamentoRepository extends JpaRepository<Departamento, Long> {
}
