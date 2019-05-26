public class Principal{


    /*
    * Crie uma classe Principal com o método main() que faz o seguinte:

Cria 3 pizzas com ingredientes diferentes
Adiciona essas Pizzas em um CarrinhoDeCompra
Imprime o total do CarrinhoDeCompra
Imprime a quantidade utilizada de cada ingrediente*/

    public static void main(String argumentos[]){

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();
        Pizza pizzaInvalida = new Pizza();

        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("azeitona");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("molho");

        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("oregano");
        pizza3.adicionaIngrediente("lombo");
        pizza3.adicionaIngrediente("molho");
        pizza3.adicionaIngrediente("azeitona");
        pizza3.adicionaIngrediente("pimenta");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarNoCarrinho(pizza1);
        carrinhoDeCompras.adicionarNoCarrinho(pizza2);
        carrinhoDeCompras.adicionarNoCarrinho(pizza3);
        carrinhoDeCompras.adicionarNoCarrinho(pizzaInvalida);

        System.out.println("Total do carrinho de compras R$ " + carrinhoDeCompras.valorTotal());
        System.out.println("Total de ingredientes utilizados: " + Pizza.totalIngredientes);

    }
}