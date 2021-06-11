package it.nttdata.concessionario.controller;

import it.nttdata.concessionario.repository.DipendenteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerDipendente {
    private final DipendenteRepository dipendenteRepository;


    public ControllerDipendente(DipendenteRepository dipendenteRepository) {
        this.dipendenteRepository = dipendenteRepository;
    }

    @GetMapping("/dipendenti")
    public String getDipendenti(Model model){
        model.addAttribute("dipendenti",dipendenteRepository.findAll());
        return "dipendente";
    }
}
