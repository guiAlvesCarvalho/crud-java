package br.com.agenda.aplicacao;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ContatoDAO contatoDao = new ContatoDAO();

        Contato contato = new Contato();
        contato.setNome("Wolverine");
        contato.setIdade(55);
        contato.setDataCadastro(new Date());

        contatoDao.save(contato);

//        Contato c1 = new Contato();
//        c1.setNome("Hugh Jackman");
//        c1.setIdade(56);
//        c1.setDataCadastro(new Date());
//        c1.setId(1);
//
//        contatoDao.update(c1);

        contatoDao.deleteById(1);

        for (Contato c : contatoDao.getContatos()) {
            System.out.println("Contato: " + c.getNome());
        }


    }
}
