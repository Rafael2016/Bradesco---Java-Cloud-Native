package com.rafaeluz.repositories;

public interface INavegadorInternet {

    void navegar(String url);

    void adicionarFavorito(String url);

    void exibirHistorico();

}
