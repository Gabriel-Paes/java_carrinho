import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Fatura fatura = new Fatura();
        Produto produto1 = new Produto("256Gb SSD",01,225);
        Produto produto2 = new Produto("500Gb HD", 02, 300);
        Produto produto3 = new Produto("8Gb RAM", 03, 190);

        int flag = 0;

        Scanner sc = new Scanner(System.in);

        do {
            Menu();

            flag = sc.nextInt();

            if (flag == 1){
                produto1.exibirProduto();
                produto2.exibirProduto();
                produto3.exibirProduto();

                System.out.print("Informe o código do produto desejado: ");
                int codigoProduto = sc.nextInt();
                System.out.print("Informe a quantidade desejada: ");
                int qntProduto = sc.nextInt();

                if (produto1.getCodigo() == codigoProduto) {
                    Item itemComprado = new Item(produto1, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                } else if(produto2.getCodigo() == codigoProduto) {
                    Item itemComprado = new Item(produto2, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                } else if (produto3.getCodigo() == codigoProduto){
                    Item itemComprado = new Item(produto3, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                }

            } else if (flag == 2){
                fatura.exibirFatura();
            }
        } while (flag != 3);

        sc.close();
    }

    public static void Menu() {
        System.out.println("\n|----- Menu -----|");
        System.out.println("|1 - Comprar     |");
        System.out.println("|2 - Ver Fatura  |");
        System.out.println("|3 - Encerrar    |");
        System.out.println("|----------------|\n");
    }
}
