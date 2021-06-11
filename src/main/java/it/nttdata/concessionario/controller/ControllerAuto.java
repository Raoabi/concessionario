package it.nttdata.concessionario.controller;

import it.nttdata.concessionario.repository.AutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerAuto {

    private final AutoRepository autoRepository;

    public ControllerAuto(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @GetMapping("/automobili")
    public String getAuto(Model model){
        model.addAttribute("automobili",autoRepository.findAll());

        return "auto";
    }
    @GetMapping("/listaauto")
    public String getAllAutomobili(Model model){
        model.addAttribute("listaauto",autoRepository.findAll());
        return "listaauto";
    }

}
