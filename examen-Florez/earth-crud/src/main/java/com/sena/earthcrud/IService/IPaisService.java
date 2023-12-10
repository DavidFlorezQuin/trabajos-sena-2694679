package com.sena.earthcrud.IService;

import com.sena.earthcrud.Entity.Pais;

import java.util.List;
import java.util.Optional;

public interface IPaisService {

    /**
     * Método para consultar todo
     * **/
    public List<Pais> findAll();

    /**
     * Método para consultar por id
     * **/
    public Optional<Pais> findById(Long id);


    /**
     * Método para guardar
     * **/
    public Pais save(Pais pais);

    /**
     * Método para modificar
     * **/
    public void update(Pais pais, Long id);

    /**
     * Método para eliminar
     * **/
    public void delete(Long id);

    /**
     * Método para eliminar lógico
     * **/
    public void deletedAt(Long id);

}

