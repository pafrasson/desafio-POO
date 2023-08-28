package desafioPOO;

import java.util.HashSet;
import java.util.Set;

public class NavegadorInternet {

    public Set<PaginaInternet> paginaSet;

    public NavegadorInternet() {
        this.paginaSet = new HashSet<>();
    }

    public void adicionarPagina(String nome, String url) {
        paginaSet.add(new PaginaInternet(nome, url));
    }

    public void exibirPaginas() {
        System.out.println(paginaSet);
    }

    public PaginaInternet atualizarPaginaUrl(String nome, String novaUrl){
        PaginaInternet urlAtualizada = null;
        for(PaginaInternet c : paginaSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setUrl(novaUrl);
                urlAtualizada = c;
                break;
            }
        }
        return urlAtualizada;
    }
}
