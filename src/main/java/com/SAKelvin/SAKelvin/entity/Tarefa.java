package com.SAKelvin.SAKelvin.entity;


import com.SAKelvin.SAKelvin.EStatusTarefa;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "tarefas")
public class Tarefa {

    @Column("id")
    private @Id Long idTarefa;
    private EStatusTarefa status;

    public Tarefa() {}

    public Tarefa(EStatusTarefa status) {
        this.status = status;
    }

    public EStatusTarefa getStatus() {
        return this.status;
    }
}
