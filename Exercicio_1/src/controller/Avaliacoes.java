package controller;

public interface Avaliacoes<T> {

	public void adicionaAvaliacao(T Avaliacao);
	public T consultarAvaliacao(int index);
	public void limparListasDeAtividades();

}
