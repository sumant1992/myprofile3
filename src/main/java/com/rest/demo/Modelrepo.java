package com.rest.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.model.Model;

public interface Modelrepo extends JpaRepository<Model, Integer>{

}
