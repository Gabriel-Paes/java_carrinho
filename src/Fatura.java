import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> listaDeItems = new ArrayList<Item>();
    private Item itemComprado = new Item();
    private Double valorFatura;

    public Fatura() {
        valorFatura = itemComprado.getValorTotItem();
    }

    public Fatura(Item itemComprado) {
        this.listaDeItems.add(itemComprado);
        this.valorFatura = valorFatura + itemComprado.getValorTotItem();
    }

    public ArrayList<Item> getListaDeItems() {
        return listaDeItems;
    }

    public void setListaDeItems(ArrayList<Item> listaDeItems) {
        this.listaDeItems = listaDeItems;
    }

    public Double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(Double valorFatura) {
        this.valorFatura = valorFatura;
    }

    public void addItemNaLista(Item itemComprado){
        listaDeItems.add(itemComprado);
        valorFatura = valorFatura + itemComprado.getValorTotItem();
    }

    public void exibirFatura() {
        for (Item i : listaDeItems){
            System.out.println("\nNome: " + i.getProdutoComprado().getNome());
            System.out.println("Código: " + i.getProdutoComprado().getCodigo());
            System.out.println("Preço: " + i.getProdutoComprado().getPreco());
            System.out.println("Quantidade adquirida do item: " + i.getQntComprada());
            System.out.println("Valor total do item: " + i.getValorTotItem() + "\n");
        }   
        System.out.println("Valor Total da Fatura: "+ valorFatura +" Reais");
    }
}
