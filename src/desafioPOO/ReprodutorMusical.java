package desafioPOO;

import java.util.HashSet;
import java.util.Set;

public class ReprodutorMusical {
    private final Set<Musica> musicaSet;

    public ReprodutorMusical() {
        this.musicaSet = new HashSet<>();
    }

    public void adicionarMusica(String nome, String artista, String duracao) {
        musicaSet.add(new Musica(nome, artista, duracao));
    }
    public void removerMusicaPorNome(String nome) {
        Musica musicaParaRemover = null;

        for(Musica c : musicaSet){
            if(c.getNome() == nome){
                musicaParaRemover = c;
                break;
            }
        }
        musicaSet.remove(musicaParaRemover);
    }

    public void exibirMusicas(){
        System.out.println(musicaSet);
    }
}