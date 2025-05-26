package com.rafaeluz;

import com.rafaeluz.models.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("Apple", "iPhone 15 Pro", "iOS 17");

        meuiPhone.exibirInformacoes();

        System.out.println("\n--- Testando Reprodutor Musical ---");
        meuiPhone.tocarMusica("Minha Música Favorita");
        meuiPhone.pausarMusica();
        meuiPhone.avancarMusica();
        meuiPhone.pararMusica();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuiPhone.ligar("11987654321");
        meuiPhone.atender();
        meuiPhone.enviarSMS("11912345678", "Olá, tudo bem?");
        meuiPhone.encerrarChamada();

        System.out.println("\n--- Testando Navegador de Internet ---");
        meuiPhone.navegar("https://www.google.com");
        meuiPhone.adicionarFavorito("https://www.apple.com");
        meuiPhone.exibirHistorico();
    }
}