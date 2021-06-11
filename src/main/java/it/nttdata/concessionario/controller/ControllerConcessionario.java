package it.nttdata.concessionario.controller;

import it.nttdata.concessionario.repository.ConcessionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerConcessionario {
    private final ConcessionarioRepository concessionarioRepository;

    public ControllerConcessionario(ConcessionarioRepository concessionarioRepository) {
        this.concessionarioRepository = concessionarioRepository;
    }

    @GetMapping("/concessionari")
    public String getConcessionario(Model model){
        model.addAttribute("concessionari", concessionarioRepository.findAll());
        return "concessionario";
    }
}
