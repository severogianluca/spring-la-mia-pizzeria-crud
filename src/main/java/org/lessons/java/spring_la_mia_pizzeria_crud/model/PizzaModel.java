package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "pizzas")
public class PizzaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    @NotBlank
    private String nome;

    @Column(name = "descrizione")
    @NotBlank
    private String descriscione;

    @Column(name = "foto_url")
    @NotBlank
    private String fotoUrl;

    @Column(name = "prezzo")
    private BigDecimal prezzo;



    public PizzaModel() {
    }

    public PizzaModel(Integer id, @NotBlank String nome, @NotBlank String descriscione, @NotBlank String fotoUrl,
            BigDecimal prezzo) {
        this.id = id;
        this.nome = nome;
        this.descriscione = descriscione;
        this.fotoUrl = fotoUrl;
        this.prezzo = prezzo;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriscione() {
        return descriscione;
    }

    public void setDescriscione(String descriscione) {
        this.descriscione = descriscione;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    @Min(value = 0)
    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

}
