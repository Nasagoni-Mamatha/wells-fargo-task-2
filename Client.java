package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    private String name;
    private String address;

    // Constructors
    public Client() {
    }

    public Client(FinancialAdvisor financialAdvisor, String name, String address) {
        this.financialAdvisor = financialAdvisor;
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
