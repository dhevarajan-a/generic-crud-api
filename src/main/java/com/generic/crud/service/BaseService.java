package com.generic.crud.service;

import com.generic.crud.entity.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseService {
    public Object getAll() {
        BaseEntity baseEntity = new BaseEntity(1);
        List<BaseEntity> responseList = new ArrayList<>();
        responseList.add(baseEntity);
        return responseList;
    }
}
