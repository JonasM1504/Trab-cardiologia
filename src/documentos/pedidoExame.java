package documentos;

import java.util.Date;

public class pedidoExame {

	private Date dataExame;
	private int CID;
	private String situacao;
	
	public pedidoExame() {
		
	}
	public pedidoExame(Date dataExame, int cID, String situacao) {
		this.dataExame = dataExame;
		CID = cID;
		this.situacao = situacao;
	}
	public Date getDataExame() {
		return dataExame;
	}
	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public void emitirPedidoExame() {
		
	}
	public void imprimirPedido() {
		
	}
	public void consultarPedido() {
		
	}
	public void cancelarPedido() {
		
	}
	
}
