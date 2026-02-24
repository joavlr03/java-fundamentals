package br.com.fiap.meu_projeto_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public String ping() {
        return "pong"; // Resposta padrão
    }

    @GetMapping("/rota1")
    public String rota1() {
        return "rota1";
    }

    @GetMapping("/rota2")
    public String rota2() {
        return "rota2";
    }
}