package desafioPOO;

import java.util.Objects;

public class PaginaInternet {
    private String url;

    private String nome;

    public PaginaInternet(final String url, final String nome) {
        this.url = url;
        this.nome = nome;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUrl());
    }

    @Override
    public String toString() {
        return "PaginaInternet{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}
