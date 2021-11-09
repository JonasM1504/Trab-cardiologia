package pessoa;

import pessoa.corPessoa;

public class paciente {
	
	private String nome;
	private int idade;
	private String sexo;
	private corPessoa  cor; 
	
	public paciente(String nome2, int idade2, String sexo2, String cor2) {
		
	}
	public paciente() {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public corPessoa getCor() {
		return cor;
	}
	public void setCor(corPessoa cor) {
		this.cor = cor;
	}
	public String toString() {
		return "Paciente: nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", cor: " + cor;
	}
	

}
