package com.ForoAlura.Foro.Alura.Controller;

import com.ForoAlura.Foro.Alura.Repository.TopicoRepository;
import com.ForoAlura.Foro.Alura.model.Topico;
import com.ForoAlura.Foro.Alura.topico.DatosRegistroTopico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    TopicoRepository topicoRepository;
    @PostMapping
    public void registroTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public List<Topico> listadoTopico(){
        return topicoRepository.findAll();
    }
}
