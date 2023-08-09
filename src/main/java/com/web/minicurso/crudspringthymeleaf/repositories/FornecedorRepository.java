package com.web.minicurso.crudspringthymeleaf.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.minicurso.crudspringthymeleaf.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    
    // @Query("select p from Fornecedor as p order by LOWER(p.nome)")
    List<Fornecedor> findAllByOrderByNomeAsc();


    List<Fornecedor> findByNomeStartingWithIgnoreCase(String namesearch);    

}
