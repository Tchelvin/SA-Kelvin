package com.SAKelvin.SAKelvin;

public enum EStatusTarefa {
    EM_ANDAMENTO("Em andamento"), CONCLUIDA("Concluida"), ATRADASA("Atrasada");

    EStatusTarefa(String situacao) {
        this.situacao = situacao;
    }
    private String situacao;
}
