public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 20.5;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("npvp saldo: " + saldo);
        } else {
            System.out.println("saldo insuficiente");
        }
    }
}