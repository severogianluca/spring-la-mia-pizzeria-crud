package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;

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
    private String descrizione;

    @Column(name = "foto_url")
    @NotBlank
    private String fotoUrl;

    @Column(name = "prezzo")
    private BigDecimal prezzo;

    public PizzaModel() {
    }

    public PizzaModel(Integer id, @NotBlank String nome, @NotBlank String descrizione, @NotBlank String fotoUrl,
            BigDecimal prezzo) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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

    public String toString() {
        return String.format("%s %s %s€", nome, descrizione, prezzo);
    }

}
