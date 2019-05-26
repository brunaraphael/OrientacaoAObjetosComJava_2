import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    ArrayList<Pizza> carrinho = new ArrayList<>();
    private int totalCarrinho = 0;

    public void adicionarNoCarrinho(Pizza p){
        if (p.getMapIngredientes().size()> 0){
            System.out.println("Pizza adicionada no carrinho: " + p.getMapIngredientes() + "; valor unitário: " + p.getPreco());
            totalCarrinho += p.getPreco();
            carrinho.add(p);
        }

        if (p.getMapIngredientes().size()== 0){
            System.out.println("É necessário montar a pizza antes de incluir ela ao carrinho!");
        }
    }

    public int valorTotal(){
        return totalCarrinho;
    }

}
