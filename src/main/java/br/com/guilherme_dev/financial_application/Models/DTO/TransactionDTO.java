package br.com.guilherme_dev.financial_application.Models.DTO;

import br.com.guilherme_dev.financial_application.Models.Transaction;

public class TransactionDTO {

    private Long id;
    private String name;
    private String description;

    /* mudar para enum depois */
    private String type;
    private Double amount;

    public TransactionDTO(){}

    public TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.name = transaction.getName();
        this.description = transaction.getDescription();
        this.type = transaction.getType();
        this.amount = transaction.getAmount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
