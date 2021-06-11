package it.nttdata.concessionario.controller;

import it.nttdata.concessionario.repository.ConcessionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerIndex {
    private final ConcessionarioRepository concessionarioRepository;


    public ControllerIndex(ConcessionarioRepository concessionarioRepository) {
        this.concessionarioRepository = concessionarioRepository;
    }
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("numeroRegioni",concessionarioRepository.countRegion());
        return "index";
    }
}
