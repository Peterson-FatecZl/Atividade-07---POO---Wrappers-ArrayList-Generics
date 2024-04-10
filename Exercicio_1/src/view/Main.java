package view;

import controller.ControleAtividade;
import controller.ControleProva;
import model.Atividade;
import model.Prova;

public class Main {

	public static void main(String[] args) {
		ControleProva controleProva = new ControleProva();
		ControleAtividade controleAtividade = new ControleAtividade();
		
		Prova p1 = new Prova(5, 8.9f, 10f);
		Prova p2 = new Prova(10, 9.8f, 8.0f);
		
		Atividade A1 = new Atividade("Estrutura de Arvore", 25);
		Atividade A2 = new Atividade("Estrutura de Pilha", 45);
		
		//testes
		controleProva.adicionaAvaliacao(p1);
		controleProva.adicionaAvaliacao(p2);
		
		System.out.println(controleProva.consultarAvaliacao(1));
		
		controleProva.limparListasDeAtividades();
//		controleProva.consultarAvaliacao(0);
		
		controleAtividade.adicionaAvaliacao(A1);
		controleAtividade.adicionaAvaliacao(A2);
		
		System.out.println(controleAtividade.consultarAvaliacao(0));
		
		controleAtividade.limparListasDeAtividades();
//		controleAtividade.consultarAvaliacao(1);
		
	}

}
