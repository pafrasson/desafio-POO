package desafioPOO;

public class Musica {
    private String nome;
    private String artista;

    private String duracao;

    private boolean musicaTocando = false;

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musica musica)) return false;
        return getNome() == musica.getNome();
    }

    public Musica(final String nome, final String artista, final String duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(final String artista) {
        this.artista = artista;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(final String duracao) {
        this.duracao = duracao;
    }

    public boolean isMusicaTocando() {
        return musicaTocando;
    }

    public void setMusicaTocando(final boolean musicaTocando) {
        this.musicaTocando = musicaTocando;
    }
}