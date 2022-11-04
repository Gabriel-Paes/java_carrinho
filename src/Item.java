public class Item {
    private Produto produtoComprado = new Produto();
    private int qntComprada;
    private double valorTotItem;

    public Item() {
        produtoComprado.setNome("");
        produtoComprado.setCodigo(0);
        produtoComprado.setPreco(0.0);
        qntComprada = 0;
        valorTotItem = qntComprada * produtoComprado.getPreco();
    }

    public Item(Produto produtoComprado, int qntComprada, double valorTotItem) {
        this.produtoComprado = produtoComprado;
        this.qntComprada = qntComprada;
        this.valorTotItem = valorTotItem;
    }

    public Produto getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(Produto produtoComprado) {
        this.produtoComprado = produtoComprado;
    }

    public int getQntComprada() {
        return qntComprada;
    }

    public void setQntComprada(int qntComprada) {
        this.qntComprada = qntComprada;
    }

    public double getValorTotItem() {
        return valorTotItem;
    }

    public void setValorTotItem(double valorTotItem) {
        this.valorTotItem = valorTotItem;
    }
}
