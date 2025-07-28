package org.lessons.java.spring_la_mia_pizzeria_crud.controller;

import java.util.List;

import org.lessons.java.spring_la_mia_pizzeria_crud.model.PizzaModel;
import org.lessons.java.spring_la_mia_pizzeria_crud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/home")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepo;

    @GetMapping
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/pizzas")
    public String getMethodName(Model model) {
        List<PizzaModel> pizzas = pizzaRepo.findAll();

        model.addAttribute("pizzas", pizzas);
        return "pizzas/index";
    }
    

}
