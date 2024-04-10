package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prova;

public class ControleProva implements Avaliacoes<Prova> {

	private List<Prova> lista = new ArrayList<>();

	@Override
	public void adicionaAvaliacao(Prova prova) {
		System.out.println("Prova Adicionada:");
		System.out.println(prova.toString());
		this.lista.add(prova);
	}

	@Override
	public Prova consultarAvaliacao(int index) {
		if (lista.isEmpty()) {
			throw new NullPointerException("A Lista de Provas está Vazia");
		}
		return lista.get(index);
	}

	@Override
	public void limparListasDeAtividades() {
		this.lista.clear();
	}

}
