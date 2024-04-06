package com.SAKelvin.SAKelvin.service;

import com.SAKelvin.SAKelvin.entity.Tarefa;
import com.SAKelvin.SAKelvin.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository tarefa) {
        this.repository = tarefa;
    }
    public void atualizarTarefa(List<Tarefa> tarefas) {
     repository.saveAll(tarefas);
    }

}
