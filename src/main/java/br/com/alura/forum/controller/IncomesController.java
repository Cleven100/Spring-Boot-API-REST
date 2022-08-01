package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.models.Income;

@RestController
public class IncomesController {
    
    @RequestMapping("/Incomes")
    @ResponseBody
   public List<Income> CheckList() {
    
     Income income = new Income("I get 10000.00 USD Everyday", 10000.0);

     return Arrays.asList(income, income, income);

   }
    

}
