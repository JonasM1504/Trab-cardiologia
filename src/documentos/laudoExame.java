package documentos;

import java.util.Date;

public class laudoExame {

	private Date dataRealizacao;
	private Date horaRealiza�ao;
	private String imagemExame;
	private String descricaoLaudo; 
	private boolean situacao;
	
	public laudoExame() {
	}
	
	public laudoExame(Date dataRealizacao, Date horaRealiza�ao, String imagemExame, String descricaoLaudo,
			boolean situacao) {
		this.dataRealizacao = dataRealizacao;
		this.horaRealiza�ao = horaRealiza�ao;
		this.imagemExame = imagemExame;
		this.descricaoLaudo = descricaoLaudo;
		this.situacao = situacao;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public Date getHoraRealiza�ao() {
		return horaRealiza�ao;
	}

	public void setHoraRealiza�ao(Date horaRealiza�ao) {
		this.horaRealiza�ao = horaRealiza�ao;
	}

	public String getImagemExame() {
		return imagemExame;
	}

	public void setImagemExame(String imagemExame) {
		this.imagemExame = imagemExame;
	}

	public String getDescricaoLaudo() {
		return descricaoLaudo;
	}

	public void setDescricaoLaudo(String descricaoLaudo) {
		this.descricaoLaudo = descricaoLaudo;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public void emitirLaudo() {
		
	}
	public void revisarLaudo() {
		
	}
	public void consultarLaudo() {
		
	}
	public void selecionar() {
		
	}
	
}
