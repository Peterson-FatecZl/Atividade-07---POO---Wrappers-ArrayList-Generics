package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;

public class ControleAtividade implements Avaliacoes<Atividade> {

	private List<Atividade> lista = new ArrayList<>();

	@Override
	public void adicionaAvaliacao(Atividade atividade) {
		System.out.println("Atividade Adicionada:");
		System.out.println(atividade.toString());
		this.lista.add(atividade);
	}

	@Override
	public Atividade consultarAvaliacao(int index) {
		if (lista.isEmpty()) {
			throw new NullPointerException("A Lista de Atividades está Vazia");
		}
		return lista.get(index);
	}

	@Override
	public void limparListasDeAtividades() {
		this.lista.clear();
	}

}
