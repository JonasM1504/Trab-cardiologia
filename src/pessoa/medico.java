package pessoa;

import pessoa.residente;
import pessoa.docente;

public class medico {

	private String nome;
	private String CRM;
	
	
	public medico() {
		
	}
	public medico(String nome, String CRM) {
		this.nome = nome;
		this.CRM = CRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	
	
	
}
