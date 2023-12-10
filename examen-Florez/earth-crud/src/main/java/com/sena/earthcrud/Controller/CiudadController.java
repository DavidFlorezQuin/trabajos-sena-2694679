package com.sena.earthcrud.Controller;

import com.sena.earthcrud.Entity.Ciudad;
import com.sena.earthcrud.Entity.Departamento;
import com.sena.earthcrud.IService.ICiudadService;
import com.sena.earthcrud.IService.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")

@RestController
@RequestMapping("v1/api/ciudad")
public class CiudadController {

    @Autowired
    private ICiudadService service;

    @GetMapping
    public List<Ciudad> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Ciudad> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Ciudad save(@RequestBody Ciudad ciudad) {
        return service.save(ciudad);
    }

    @PutMapping("{id}")
    public void save(@RequestBody Ciudad ciudad, @PathVariable  Long id) {
        service.update(ciudad, id);
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
