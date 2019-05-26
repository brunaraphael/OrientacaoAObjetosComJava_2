import java.util.HashMap;

public class Pizza {


    private HashMap<String, Integer> mapIngredientes = new HashMap<>();
    static protected HashMap<String, Integer> totalIngredientes = new HashMap<>();

    public void adicionaIngrediente(String ingrediente){
        atualizaIngrediente(ingrediente, mapIngredientes);
        contabilizaIngrediente(ingrediente);
    }

    private void atualizaIngrediente(String ingrediente, HashMap<String, Integer> meuHashmap) {

        boolean jaExiste = false;

        for (String key : meuHashmap.keySet()) {
            if(key.equals(ingrediente)){
                Integer value = meuHashmap.get(key);
                value ++;
                meuHashmap.replace(ingrediente,value);
                jaExiste = true;
                break;
            }
        }
        if (!jaExiste){
            meuHashmap.put(ingrediente,1);
        }
    }

    private void contabilizaIngrediente(String ingrediente) {
        atualizaIngrediente(ingrediente, totalIngredientes);
    }

    public Integer getPreco(){
        int soma = 0;
        int preco = 0;

        for (String key : mapIngredientes.keySet()) {
            soma += mapIngredientes.get(key);
        }

        if(soma <= 2){ preco = 15;}
        if(soma > 2 && soma <= 5){ preco = 20;}
        if(soma > 5){ preco = 23;}

        return preco;
    }

    public HashMap<String, Integer> getMapIngredientes() {
        return mapIngredientes;
    }

}
