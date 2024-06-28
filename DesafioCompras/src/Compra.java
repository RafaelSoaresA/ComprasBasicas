public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    //Método construtor
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


    //Getters

    public String getDescricao() {
        return descricao;
    }


    public double getValor() {
        return valor;
    }

    //Método toString
    @Override
    public String toString() {
        return "Descrição: " + descricao + " Valor: " + valor;
    }

    //Método compareTo
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
