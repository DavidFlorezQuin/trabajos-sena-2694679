package com.sena.earthcrud.Service;

import com.sena.earthcrud.Entity.Departamento;
import com.sena.earthcrud.Entity.Pais;
import com.sena.earthcrud.IRepository.IDepartamentoRepository;
import com.sena.earthcrud.IService.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {

    @Autowired
    private IDepartamentoRepository repository;
    @Override
    public List<Departamento> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Departamento> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Departamento save(Departamento departamento) {
        return repository.save(departamento);
    }

    @Override
    public void update(Departamento departamento, Long id) {

        Optional<Departamento> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe.");
        }else {
            Departamento updateDepartamento = op.get();
            updateDepartamento.setNombre(departamento.getNombre());
            updateDepartamento.setCodigo(departamento.getCodigo());
            updateDepartamento.setEstado(departamento.getEstado());
            updateDepartamento.setFechaModificacion(LocalDateTime.now());

            repository.save(updateDepartamento);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void deletedAt(Long id) {
        Optional<Departamento> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.print("Registro no existe para eliminar.");
        }else {
            Departamento updateDepartamento = op.get();
            updateDepartamento.setFechaEliminacion(LocalDateTime.now());
            repository.save(updateDepartamento);
        }
    }
    }

