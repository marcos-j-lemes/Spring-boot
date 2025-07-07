package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/estudo")
public class HelloController {


    // estrutura de uma rota de Api com spring
    @GetMapping("/hello")
    public String hello(){
        return new String("olá, Seja muito bem-vindo!!");
    }


    // PathVariable muito parecido com requestparam, mas mudam pouca coisa entre um e outro.

    //permite que use regex no url para requisições.

    //  Rota que recebe um param do usuário, e devolve outra resposta.
    @GetMapping("/hello/{name}")
    public String helloNome(@PathVariable String name){
        return new String("Seja bem-vindo, "+name+"!");
    }

    // path com regex.
    @GetMapping("/docs/{filename:.+\\.pdf}")
    public String baixarPdf(@PathVariable String filename) {
        return "Download do arquivo: " + filename;
    }


   // Estrutura para fazer requisições query

   // duas variáveis, sendo a e b
    @GetMapping("/somar")
    public String somar(@RequestParam int a, @RequestParam int b){
        int resultado = a +b;
        return "Resultado: " + resultado;
    }

    // define uma palavra para usar na URL
    @GetMapping("/buscar")
    public String buscar(@RequestParam(name = "search") String palavraChave){
        return "Buscando por: " + palavraChave;
    }

    // possui um valor padrão, caso não seja inserido nenhum valor
    @GetMapping("/saudar")
    public String saudar (@RequestParam(defaultValue = "Mundo") String name){
        return "olá, "+ name;
    }

    // faz com que o query não seja obrigatorio.
    @GetMapping("/saudarr")
    public String sudarr(@RequestParam(required = false) String nome){
        if (nome == null){
            return new String("Olá, visitante!!");
        }else{
            return new String("Olá, "+ nome);
        }
    }

    // ele pega um query com múltiplos parâmetros e armazena em uma lista
    @GetMapping("/filter")
    public String filter(@RequestParam List<String> tag){
        return "tags: "+ tag+ "\n";
    }



}