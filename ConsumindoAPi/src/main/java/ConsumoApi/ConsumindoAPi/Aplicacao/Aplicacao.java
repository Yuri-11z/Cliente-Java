package ConsumoApi.ConsumindoAPi.Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import ConsumoApi.ConsumindoAPi.Cliente.Cliente;
import ConsumoApi.ConsumindoAPi.doMain.Livro;

public class Aplicacao {

    public static void main(String[] args) throws ParseException{
        
        Cliente cliente = new Cliente();
        //Criei uma instancia da classe Cliente

        List<Livro> listaLivros = cliente.listar();
        //Criei uma lista da classe Livro e recebe o metodo listar de cliente.


        for(Livro livro : listaLivros)
        {
            
            System.out.println("Livro: " + livro.getNome());
            System.out.println(livro.getEditora());
        } 
        //Interage mostrando apenas o nome, mas posso colocar mais informações.

        Livro livro = new Livro();

        livro.setNome("yuri");
        livro.setEditora("bernardinho");

        SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
        livro.setPublicacao(publicacao.parse("01/10/2024"));

        String localizacao = cliente.salvar(livro);

        Livro livroBuscado = cliente.buscar(localizacao);

        System.out.println(livroBuscado.getNome());
      }



}
