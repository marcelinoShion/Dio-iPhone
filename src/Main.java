import smartphone.IPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPhone smartphone = new IPhone();
        smartphone.ligar();
        smartphone.atender();
        smartphone.iniciarCorreioDeVoz();
        smartphone.exibirPagina();
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
        smartphone.tocar();
        smartphone.pausar();
        smartphone.selecionarMusica();
    }
}