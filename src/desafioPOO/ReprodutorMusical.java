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

        for (Musica c : musicaSet) {
            if (c.getNome() == nome) {
                musicaParaRemover = c;
                break;
            }
        }
        musicaSet.remove(musicaParaRemover);
    }

    public Set<Musica> pesquisarPorNome(String nome) {
        Set<Musica> musicaPorNome = new HashSet<>();
        for (Musica m : musicaSet) {
            if (m.getNome().startsWith(nome)) {
                musicaPorNome.add(m);
            }
        }
        return musicaPorNome;
    }

    public void exibirMusicas() {
        System.out.println(musicaSet);
    }

    public void tocarMusica(Musica musica) {
        musica.setMusicaTocando(true);
        System.out.println("Tocando música.");
    }

    public void pararMusica(Musica musica) {
        musica.setMusicaTocando(false);
        System.out.println("Música parada.");
    }
}