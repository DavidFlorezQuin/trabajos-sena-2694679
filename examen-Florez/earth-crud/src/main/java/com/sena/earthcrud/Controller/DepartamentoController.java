package com.sena.earthcrud.Controller;

import com.sena.earthcrud.Entity.Departamento;
import com.sena.earthcrud.Entity.Pais;
import com.sena.earthcrud.IService.IDepartamentoService;
import com.sena.earthcrud.IService.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")

@RestController
@RequestMapping("v1/api/departamento")
public class DepartamentoController {

    @Autowired
    private IDepartamentoService service;

    @GetMapping
    public List<Departamento> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Departamento> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Departamento save(@RequestBody Departamento departamento) {
        return service.save(departamento);
    }

    @PutMapping("{id}")
    public void save(@RequestBody Departamento departamento, @PathVariable  Long id) {
        service.update(departamento, id);
    }

    @PutMapping("deleted-at/{id}")
    public void deletedAt(@PathVariable  Long id) {
        service.deletedAt(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable  Long id) {
        service.delete(id);
    }


}
