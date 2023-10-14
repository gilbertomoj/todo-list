package br.com.gilbertomoj.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpClient;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public RedirectView message(){

        return new RedirectView("http://localhost:8080/swagger-ui/index.html");
    }
}
