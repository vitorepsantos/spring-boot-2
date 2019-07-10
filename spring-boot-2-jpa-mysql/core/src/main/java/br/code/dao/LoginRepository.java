package br.code.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginRepository extends CrudRepository<Login, Integer> {

    List<Login> findByUsername(String username);

}
