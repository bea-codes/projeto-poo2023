public class Comentario {
	private UserAbstract autor;
	private String conteudo;
	
	public Comentario() {
	}

	public Comentario(UserAbstract autor, String conteudo) {
		this.autor = autor;
		this.conteudo = conteudo;
	}

	public UserAbstract getAutor() {
		return autor;
	}

	public void setAutor(UserAbstract autor) {
		this.autor = autor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	

}
