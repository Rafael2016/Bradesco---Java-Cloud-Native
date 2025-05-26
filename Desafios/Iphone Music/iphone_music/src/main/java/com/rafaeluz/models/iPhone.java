package com.rafaeluz.models;

import com.rafaeluz.repositories.IAparelhoTelefonico;
import com.rafaeluz.repositories.INavegadorInternet;
import com.rafaeluz.repositories.IReprodutorMusical;

public class iPhone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    private String marca;
    private String modelo;
    private String sistemaOperacional;

    public iPhone(String marca, String modelo, String sistemaOperacional) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Getters para os atributos (opcional, mas boa prática)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }

    // Implementação da interface IReprodutorMusical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando música.");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando música.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    // Implementação da interface IAparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }

    // Implementação da interface INavegadorInternet
    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Exibindo histórico de navegação...");
        // Lógica para exibir o histórico real, se implementado
    }

}
