
public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	
	public Time()
	{
		qtdVitorias = 0;
		qtdEmpates  = 0;
		qtdDerrotas = 0;
		qtdPontos  = 0;
	}
	
	public Time(String nome) {
		this.nome = nome;
	}
	
	public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	
	public void listar()
	{
		System.out.println(" ");
		System.out.printf("Time : %s", nome);
		System.out.printf("Vitorias: %d", qtdVitorias);
		System.out.printf("Empates: %d", qtdEmpates);
		System.out.printf("Derrotas: %d", qtdDerrotas);
		System.out.printf("Pontos: %d", qtdPontos);
	}
	
}
