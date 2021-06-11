package it.nttdata.concessionario.boostrap;

import it.nttdata.concessionario.model.Auto;
import it.nttdata.concessionario.model.Concessionario;
import it.nttdata.concessionario.model.Dipendente;
import it.nttdata.concessionario.model.Regione;
import it.nttdata.concessionario.repository.AutoRepository;
import it.nttdata.concessionario.repository.ConcessionarioRepository;
import it.nttdata.concessionario.repository.DipendenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AutoRepository autoRepository;
    private final ConcessionarioRepository concessionarioRepository;
    private final DipendenteRepository dipendenteRepository;


    public BootstrapData(AutoRepository autoRepository, ConcessionarioRepository concessionarioRepository, DipendenteRepository dipendenteRepository) {
        this.autoRepository = autoRepository;
        this.concessionarioRepository = concessionarioRepository;
        this.dipendenteRepository = dipendenteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Concessionario c1= new Concessionario();
        c1.setNome("Outlet");
        c1.setCitta("Roma");
        c1.setVia("Via degli ulivi");
        c1.setRegione(Regione.LAZIO);

        Concessionario c2= new Concessionario();
        c2.setNome("Motori");
        c2.setCitta("Torino");
        c2.setVia("Via Bologna");
        c2.setRegione(Regione.PIEMONTE);

        Auto a1=new Auto();
        a1.setModello("Panda");
        a1.setPrezzo(5000.00);
        a1.setConcessionario(c1);

        Auto a2=new Auto();
        a2.setModello("Polo");
        a2.setPrezzo(13000.00);
        a2.setConcessionario(c2);

        Dipendente d1= new Dipendente();
        d1.setNome("Alessio");
        d1.setCognome("Bianchi");
        d1.setEta(26);
        d1.setStipendio(1600.00);
        d1.setConcessionario(c1);

        Dipendente d2= new Dipendente();
        d2.setNome("Marco");
        d2.setCognome("Rossi");
        d2.setEta(34);
        d2.setStipendio(1600.00);
        d2.setConcessionario(c2);



        c1.getListaDipendenti().add(d1);
        c2.getListaDipendenti().add(d2);

        c1.getListaAuto().add(a1);
        c2.getListaAuto().add(a2);

        concessionarioRepository.save(c1);
        concessionarioRepository.save(c2);
        autoRepository.save(a1);
        autoRepository.save(a2);
        dipendenteRepository.save(d1);
        dipendenteRepository.save(d2);






    }
}
