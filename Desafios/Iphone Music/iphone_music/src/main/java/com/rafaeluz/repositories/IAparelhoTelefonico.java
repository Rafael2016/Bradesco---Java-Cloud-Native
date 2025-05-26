package com.rafaeluz.repositories;

public interface IAparelhoTelefonico {

    void ligar(String numero);

    void atender();

    void encerrarChamada();

    void enviarSMS(String numero, String mensagem);

}
