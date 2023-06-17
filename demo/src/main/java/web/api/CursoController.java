/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.api;


import java.util.List;
import model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CursoRepository;

@RestController
@RequestMapping("/api/cursos")

public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    @PostMapping
    Curso create(@RequestBody Curso curso) {

        return cursoRepository.save(curso);

    }
}
