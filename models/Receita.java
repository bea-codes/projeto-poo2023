import java.time.LocalDateTime;
import java.util.ArrayList;

public class Receita{
	private UserAbstract autor;
	private String titulo;
	private String descricao;
	private String instrucoesPreparoPasso1;
	private String instrucosPreparoPasso2;
	private String tempoDePreparo;
	private String infoAdicional;
	private LocalDateTime dataDePostagem;
	private ArrayList<String> ingredientes = new ArrayList<String>();
	private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
	
	
	public Receita() {}
	public Receita(UserAbstract autor, String titulo, String descricao, String instrucoesPreparoPasso1,
			String instrucosPreparoPasso2, String tempoDePreparo, String infoAdicional, LocalDateTime dataDePostagem,
			ArrayList<String> ingredientes, ArrayList<Comentario> comentarios) {
		this.autor = autor;
		this.titulo = titulo;
		this.descricao = descricao;
		this.instrucoesPreparoPasso1 = instrucoesPreparoPasso1;
		this.instrucosPreparoPasso2 = instrucosPreparoPasso2;
		this.tempoDePreparo = tempoDePreparo;
		this.infoAdicional = infoAdicional;
		this.dataDePostagem = dataDePostagem;
		this.ingredientes = ingredientes;
		this.comentarios = comentarios;
	}

	public UserAbstract getAutor() {
		return autor;
	}


	public void setAutor(UserAbstract autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getInstrucoesPreparoPasso1() {
		return instrucoesPreparoPasso1;
	}


	public void setInstrucoesPreparoPasso1(String instrucoesPreparoPasso1) {
		this.instrucoesPreparoPasso1 = instrucoesPreparoPasso1;
	}


	public String getInstrucosPreparoPasso2() {
		return instrucosPreparoPasso2;
	}


	public void setInstrucosPreparoPasso2(String instrucosPreparoPasso2) {
		this.instrucosPreparoPasso2 = instrucosPreparoPasso2;
	}


	public String getTempoDePreparo() {
		return tempoDePreparo;
	}


	public void setTempoDePreparo(String tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}


	public String getInfoAdicional() {
		return infoAdicional;
	}


	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}


	public LocalDateTime getDataDePostagem() {
		return dataDePostagem;
	}


	public void setDataDePostagem(LocalDateTime dataDePostagem) {
		this.dataDePostagem = dataDePostagem;
	}


	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}


	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}


	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

}
