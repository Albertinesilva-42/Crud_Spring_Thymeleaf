package com.web.minicurso.crudspringthymeleaf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.minicurso.crudspringthymeleaf.entities.Fornecedor;

import com.web.minicurso.crudspringthymeleaf.repositories.FornecedorRepository;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/fornecedores/")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping("cadastrar")
    public String cadastrar(Fornecedor Fornecedor) {
        return "fornecedores/cadastro";
    }

    @GetMapping("listar")
    public String listar(Model model) {
        model.addAttribute("fornecedores", fornecedorRepository.findAllByOrderByNomeAsc());
        return "fornecedores/lista";
    }

    @PostMapping("salvar")
    public String salvar(@Valid Fornecedor fornecedor, BindingResult result) {
        if (result.hasErrors()) {
            return "fornecedores/cadastro";
        }

        fornecedorRepository.save(fornecedor);
        return "redirect:/fornecedores/listar";
    }



    
}
