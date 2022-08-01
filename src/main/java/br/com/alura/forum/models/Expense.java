package br.com.alura.forum.models;

import java.time.LocalDateTime;

public class Expense {
    
    private Long id;
    private String report;
    private Double value;
    private LocalDateTime date = LocalDateTime.now();

}
