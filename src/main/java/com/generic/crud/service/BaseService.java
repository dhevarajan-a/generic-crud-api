package com.generic.crud.service;

import com.generic.crud.entity.BaseEntity;
import com.generic.crud.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    @Autowired
    BaseRepository baseRepository;

    public Object getAll() {
        return baseRepository.findAll();
    }

    public Object getById(Integer id) {
        return baseRepository.findById(id);
    }

    public Object create(BaseEntity entity) {
        return baseRepository.save(entity);
    }

    public Object update(BaseEntity entity) {
        return baseRepository.save(entity);
    }

    public void deleteById(Integer id) {
        baseRepository.deleteById(id);
    }
}
