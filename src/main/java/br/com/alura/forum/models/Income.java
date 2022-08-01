package br.com.alura.forum.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Income {
    
    private Long id;
    private String report;
    private Double value;
    private  LocalDateTime date = LocalDateTime.now();;

    public Income(String report, Double value) {
		this.report = report;
		this.value = value;
		this.date = date;
	}




    public String getReport() {
        return report;
    }
    public void setReport(String report) {
        this.report = report;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
     


    
}
