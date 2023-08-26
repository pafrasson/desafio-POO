package desafioPOO;

import java.util.HashSet;
import java.util.Set;

public class ReprodutorMusical {
    private Set<Musica> musicaSet;

    public ReprodutorMusical() {
        this.musicaSet = new HashSet<>();
    }

    public void adicionarMusica(String nome, String artista, String duracao) {
        musicaSet.add(new Musica(nome, artista, duracao));
    }
}
