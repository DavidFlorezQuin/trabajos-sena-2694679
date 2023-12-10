package com.sena.earthcrud.Service;

import com.sena.earthcrud.Entity.Ciudad;
import com.sena.earthcrud.Entity.Departamento;
import com.sena.earthcrud.IRepository.ICiudadRepository;
import com.sena.earthcrud.IService.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements ICiudadService {

    @Autowired
    private ICiudadRepository repository;
    @Override
    public List<Ciudad> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Ciudad> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return repository.save(ciudad);
    }

    @Override
    public void update(Ciudad ciudad, Long id) {

        Optional<Ciudad> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe.");
        }else {
            Ciudad updateCiudad = op.get();
            updateCiudad.setNombre(ciudad.getNombre());
            updateCiudad.setCodigo(ciudad.getCodigo());
            updateCiudad.setEstado(ciudad.getEstado());
            updateCiudad.setFechaModificacion(LocalDateTime.now());

            repository.save(updateCiudad);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void deletedAt(Long id) {
        Optional<Ciudad> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe para eliminar.");
        }else {
            Ciudad updateCiudad = op.get();
            updateCiudad.setFechaEliminacion(LocalDateTime.now());
            repository.save(updateCiudad);
        }

    }
}
