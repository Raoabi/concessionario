package it.nttdata.concessionario.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Dipendente {
    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String nome;
    @NonNull
    private String cognome;
    @NonNull
    private Double stipendio;
    @NonNull
    @Min(16)
    private Integer eta;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Concessionario concessionario;

    public Dipendente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public void setStipendio(Double stipendio) {
        this.stipendio = stipendio;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Concessionario getConcessionario() {
        return concessionario;
    }

    public void setConcessionario(Concessionario concessionario) {
        this.concessionario = concessionario;
    }
}
