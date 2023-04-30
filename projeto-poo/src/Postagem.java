import java.time.LocalDateTime;

public abstract class Postagem {
	private Usuario user;
	private String conteudo;
	private LocalDateTime dataDePublicacao;
	
	
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDateTime getDataDePublicacao() {
		return dataDePublicacao;
	}
	public void setDataDePublicacao(LocalDateTime dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}

}
