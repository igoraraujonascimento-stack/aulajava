package com.example.cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
    @GetMapping("/")
    public String cadastro(
        @RequestParam String nome,
        @RequestParam String curso
    ) {
        return ""
                + "<h1>Cadastro</h1>"
                + "<p>Nome: " + nome + "</p>"
                + "<p>Curso: " + curso + "</p>";
    }
}