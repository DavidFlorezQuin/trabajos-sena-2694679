package com.sena.earthcrud.Service;

import com.sena.earthcrud.Entity.Continente;
import com.sena.earthcrud.IRepository.IContinenteRepository;
import com.sena.earthcrud.IService.IContinenteService;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContinenteService implements IContinenteService {



    @Autowired
    private IContinenteRepository repository;


    @Override
    public List<Continente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Continente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Continente save(Continente continente) {
        continente.setFechaCreacion(LocalDateTime.now());
        return repository.save(continente);
    }

    @Override
    public void update(Continente continente, Long id) {
        //Consultar si existe el registro
        Optional<Continente> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe.");
        }else {
            Continente updateContinente = op.get();
            updateContinente.setNombre(continente.getNombre());
            updateContinente.setCodigo(continente.getCodigo());
            updateContinente.setEstado(continente.getEstado());
            updateContinente.setFechaModificacion(LocalDateTime.now());

            repository.save(updateContinente);
        }

    }

    @Override
    public void delete(Long id) {

        //Consultar si existe el registro
        Optional<Continente> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe para eliminar.");
        }else {
            Continente updateContinente = op.get();
            updateContinente.setFechaEliminacion(LocalDateTime.now());
            repository.save(updateContinente);
        }


    }
    @Override
    public void deletedAt(Long id) {
        repository.deleteById(id);

    }
}
