package com.generic.crud.controller;

import com.generic.crud.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
