/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine1.C;

import Service.Ipelicula;
import Service.Isala;
import entity.Pelicula;
import entity.Sala;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controller_ {

    @Autowired
    private Isala salaService;

    @Autowired
    private Ipelicula peliculaService;

    @GetMapping("/Sala")
    public String index(Model model) {
        List<Sala> listaSala = salaService.getAllSal();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("conciertos", listaSala);
        return "conciertos";
    }

    @GetMapping("/conciertoN")
    public String crearPelicula(Model model) {
        List<Pelicula> listaArtistas = peliculaService.listPelicula();
        model.addAttribute("concierto", new Sala());
        model.addAttribute("artistas", listaArtistas);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPelicual(@ModelAttribute Sala sala) {
        salaService.saveSal(sala);
        return "redirect:/concierto";
    }

    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idSala, Model model) {
        Sala sala = salaService.getsalById(idSala);
        List<Pelicula> listaPelicula = peliculaService.listPelicula();
        model.addAttribute("Salas", sala);
        model.addAttribute("Peliculas", listaPelicula);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto) {
        salaService.delete(idConcierto);
        return "redirect:/concierto";
    }
}
