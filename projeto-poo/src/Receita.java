import java.util.ArrayList;
import java.time.LocalDateTime;

public class Receita extends Postagem {
	private String title;
	private ArrayList<Comentario> postComments = new ArrayList<Comentario>();
	

	public Receita(){}
	public Receita(String title, String conteudo, Usuario user, LocalDateTime dateTime, ArrayList<Comentario> postComments){
		super.setConteudo(conteudo);
		super.setDataDePublicacao(dateTime);
		super.setUser(user);
		this.postComments = postComments;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Comentario> getPostComments() {
		return postComments;
	}
	public void setPostComments(ArrayList<Comentario> postComments) {
		this.postComments = postComments;
	}

	
}
