import java.util.Collections;
import java.util.Scanner;

public class Main {
    //Método de entrada de dados
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Digite o limite do cartão: ");
        double limite = entrada.nextDouble();
        Cartao cartao = new Cartao(limite);


        int opcao = 1;

        //Este loop permite que o usuário faça várias compras até que ele decida encerrar a aplicação.
        while (opcao != 0){
            System.out.println("<---------------------->");
            System.out.println("Digite a descrição da compra: ");
            String descricao = entrada.next();
            System.out.println("Digite o valor do produto: ");
            double valor = entrada.nextDouble();
            System.out.println("<---------------------->");

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.comprar(compra);

            if (compraRealizada) {
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("Digite 1 para continuar ou 0 para encerrar a aplicação: ");
                opcao = entrada.nextInt();
            }else{
                System.out.println("Compra não efetuada, saldo insuficiente! ");
                opcao = 0;
            }

            System.out.println("Compras Realizadas:\n");
            Collections.sort(cartao.getCompras());
            for (Compra c : cartao.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }

            System.out.println("Saldo restante: " + cartao.getSaldo());

        }



    }
}