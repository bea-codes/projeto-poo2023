import java.util.Date;
import java.util.ArrayList;


public abstract class UserAbstract {
	private String nome;
	private String email;
	private Date dataNascimento;
	private ArrayList<Receita> receitasFavoritas = new ArrayList<Receita>();
	

	public abstract void enviarPostagem();
	public abstract void excluirPostagem();
	public abstract void enviarComentario();
	public abstract void excluirComentario();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<Receita> getReceitasFavoritas() {
		return receitasFavoritas;
	}
	public void setReceitasFavoritas(ArrayList<Receita> receitasFavoritas) {
		this.receitasFavoritas = receitasFavoritas;
	}

	

}
