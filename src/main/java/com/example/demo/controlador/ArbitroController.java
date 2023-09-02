package com.example.demo.controlador;

import com.example.demo.entidad.Arbitro;
import com.example.demo.repositorio.ArbitroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/arbitro")
public class ArbitroController {

    final ArbitroRepository arbitroRepository;

    public ArbitroController(ArbitroRepository arbitroRepository) {
        this.arbitroRepository = arbitroRepository;
    }

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("list", arbitroRepository.findAll());
        return "arbitro/list";
    }


    @GetMapping("/new")
    public String crear() {
        return "arbitro/newForm";
    }

    @PostMapping("/guardar")
    public String guardar(Arbitro arbitro) {
        arbitroRepository.save(arbitro);
        return "redirect:/arbitro/listar";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Arbitro> optional = arbitroRepository.findById(id);

        if (optional.isPresent()) {
            arbitroRepository.deleteById(id);
        }

        return "redirect:/abrbitro/listar";
    }
}
