package com.generic.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Datamvn
//@NoArgsConstructor
//@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    public int id;

}
