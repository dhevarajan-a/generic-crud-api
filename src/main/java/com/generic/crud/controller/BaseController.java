package com.generic.crud.controller;

import com.generic.crud.entity.BaseEntity;
import com.generic.crud.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base")
public class BaseController {

    @Autowired
    BaseService baseService;

    @GetMapping
    public ResponseEntity<Object> getAll() {
        Object obj = baseService.getAll();
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAll(@PathVariable Integer id) {
        Object obj = baseService.getById(id);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody BaseEntity entity) {
        Object obj = baseService.create(entity);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody BaseEntity entity, @PathVariable Integer id) {
        Object obj = baseService.update(entity);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Integer id) {
        baseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
