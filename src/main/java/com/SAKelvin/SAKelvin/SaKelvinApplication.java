package com.SAKelvin.SAKelvin;

import com.SAKelvin.SAKelvin.entity.Tarefa;
import com.SAKelvin.SAKelvin.service.TarefaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SaKelvinApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SaKelvinApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TarefaService tarefaService;
		Scanner teclado = new Scanner(System.in);

//		Tarefa tarefa01 = new Tarefa(EStatusTarefa.EM_ANDAMENTO);
//		Tarefa tarefa02 = new Tarefa(EStatusTarefa.EM_ANDAMENTO);
//		Tarefa tarefa03 = new Tarefa(EStatusTarefa.EM_ANDAMENTO);
//		List<Tarefa> tarefas = List.of(tarefa01, tarefa02, tarefa03);
//
//		tarefaService.atualizarTarefa(tarefas);


	}
}
