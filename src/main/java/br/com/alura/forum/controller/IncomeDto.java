package br.com.alura.forum.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.models.Income;

public class IncomeDto {
 
    private Long id;
    private String report;
    private Double value;
    private LocalDateTime date;

    public IncomeDto(Income income) {

        this.id = income.getId();
        this.report = income.getReport();
        this.value = income.getValue();
        this.date = income.getDate();

    }

    public Long getId() {
        return id;
    }
    public String getReport() {
        return report;
    }
    public Double getValue() {
        return value;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public static List<IncomeDto> convert(List<Income> incomes) {
        return incomes.stream().map(IncomeDto::new).collect(Collectors.toList());
    }

}
