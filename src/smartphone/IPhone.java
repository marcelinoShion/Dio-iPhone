package smartphone;

import funcionalidades.aparelhoTelefonico;
import funcionalidades.navegadorDeInternet;
import funcionalidades.reprodutorMusical;

public class IPhone implements aparelhoTelefonico , navegadorDeInternet , reprodutorMusical {
    public void ligar() {
        System.out.println("Ligando ...");
    }

    public void atender() {
        System.out.println("Atendendo ...");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz ...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina ...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina ...");
    }

    public void tocar() {
        System.out.println("Tocando musica ...");
    }

    public void pausar() {
        System.out.println("Pausando musica ...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica ...");
    }
}
