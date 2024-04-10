package model;

public class Atividade {
	private String assunto;
	private int quantidadePaginas;

	public Atividade() {
		super();
	}

	public Atividade(String assunto, int quantidadePaginas) {
		super();
		this.assunto = assunto;
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	@Override
	public String toString() {
		return "Atividade [assunto=" + assunto + ", quantidadePaginas=" + quantidadePaginas + "]";
	}

}
