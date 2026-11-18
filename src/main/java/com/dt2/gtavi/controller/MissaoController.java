package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Carro;
import com.dt2.gtavi.entities.Missao;
import com.dt2.gtavi.repository.MissaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissaoController {

    private final MissaoRepository repository;

    public MissaoController(MissaoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarMissao(@RequestBody Missao missao){
        try {
            repository.save(missao);
            return "Calvo com sucesso!";
        }
        catch (Exception e){
            return "Dados incorretos!";
        }
    }

    @GetMapping
    public List<Missao> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "Excluído com sucesso!";
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id) {
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Missao m){
        Missao missao = repository.getReferenceById(id);
        missao.setNome(m.getNome());
        missao.setDescricao(m.getDescricao());
        missao.setDificuldade(m.getDificuldade());
        missao.setLocal(m.getLocal());
        missao.setImagem(m.getImagem());


        repository.save(missao);
    }
}
