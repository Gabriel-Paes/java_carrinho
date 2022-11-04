import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> listaDeItems;
    private Double valorFatura;

    public Fatura(ArrayList<Item> listaDeItems, Double valorFatura) {
        this.listaDeItems = listaDeItems;
        this.valorFatura = valorFatura;
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
}
