package it.nttdata.concessionario.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Concessionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Size(min = 1)
    private String nome;

    @NonNull
    @Size(min = 1)
    private String via;

    @NonNull
    private Regione regione;

    @NonNull
    @Size(min = 1)
    private String citta;
    @OneToMany(mappedBy = "concessionario")
    private Set<Auto> listaAuto= new HashSet<>();

    @OneToMany(mappedBy = "concessionario")
    private Set<Dipendente> listaDipendenti= new HashSet<>();


    public Set<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(Set<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }


    public Set<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public void setListaDipendenti(Set<Dipendente> listaDipendenti) {
        this.listaDipendenti = listaDipendenti;
    }

    public Concessionario() {
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

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public Regione getRegione() {
        return regione;
    }

    public void setRegione(Regione regione) {
        this.regione = regione;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }




}
