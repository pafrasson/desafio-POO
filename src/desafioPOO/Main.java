package desafioPOO;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.adicionarMusica("Música 1", "Artista 1", "3:45");
        reprodutor.adicionarMusica("Música 2", "Artista 2", "4:20");
        reprodutor.adicionarMusica("Música 3", "Artista 3", "2:55");

        System.out.println("Lista de músicas:");
        reprodutor.exibirMusicas();

        System.out.println("\nPesquisar por nome 'Música 2':");
        Set<Musica> resultadosPesquisa = reprodutor.pesquisarPorNome("Música 2");
        for (Musica musica : resultadosPesquisa) {
            System.out.println(musica);
        }

        System.out.println("\nTocar a primeira música:");
        Musica primeiraMusica = reprodutor.pesquisarPorNome("Música 1").iterator().next();
        reprodutor.tocarMusica(primeiraMusica);

        System.out.println("\nParar a primeira música:");
        reprodutor.pararMusica(primeiraMusica);

        System.out.println("\nRemover a segunda música:");
        reprodutor.removerMusicaPorNome("Música 2");

        System.out.println("\nLista de músicas após a remoção:");
        reprodutor.exibirMusicas();

    }
}
