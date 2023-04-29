import java.util.ArrayList;
import java.time.LocalDateTime;

public class Postagem {
	private Usuario author;
	private LocalDateTime date;
	private String content; // Acho que isso aqui vai ter que ser outro tipo...?
	private String title;
	private ArrayList<Comentario> postComments = new ArrayList<Comentario>();
	
	public Postagem(){}

	
}
