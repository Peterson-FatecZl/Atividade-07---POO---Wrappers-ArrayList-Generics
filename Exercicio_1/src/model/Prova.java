package model;

public class Prova {

	private int numeroDeQuestoes;
	private float mediaNotas;
	private float peso;

	public Prova() {
		super();
	}

	public Prova(int numeroDeQuestoes, float mediaNotas, float pesoProva) {
		super();
		this.numeroDeQuestoes = numeroDeQuestoes;
		this.mediaNotas = mediaNotas;
		this.peso = pesoProva;
	}

	public int getNumeroDeQuestoes() {
		return numeroDeQuestoes;
	}

	public void setNumeroDeQuestoes(int numeroDeQuestoes) {
		this.numeroDeQuestoes = numeroDeQuestoes;
	}

	public float getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Prova [numeroDeQuestoes=" + numeroDeQuestoes + ", mediaNotas=" + mediaNotas + ", peso=" + peso + "]";
	}

}
