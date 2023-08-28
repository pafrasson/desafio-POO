package desafioPOO;

import java.util.HashSet;
import java.util.Set;

public class AparelhoTelefonico {
    private Set<Contato> contatoSet;

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public Set<Contato> ligarParaContato(int telefone) {
        Set<Contato> contatosPorTelefone = new HashSet<>();
        String telefoneStr = Integer.toString(telefone);

        for (Contato c : contatoSet) {
            String contatoTelefoneStr = Integer.toString(c.getTelefone());
            if (contatoTelefoneStr.startsWith(telefoneStr)) {
                contatosPorTelefone.add(c);
            }
        }

        System.out.println("Ligando para: " + contatosPorTelefone);
        return contatosPorTelefone;
    }

    public void atenderContato(Contato contato){

    }
}
