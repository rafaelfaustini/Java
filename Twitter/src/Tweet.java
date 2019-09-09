import java.util.Date;
import java.util.Scanner;

public class Tweet {
	private String texto;
	private Date horario;
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public void  Tweetar() {
		Date date = new Date(); 
		this.horario = date;
		
		Scanner dados = new Scanner(System.in);
		System.out.print("Digite o tweet: ");
		String tweet = dados.nextLine();
		
		if(tweet.length() >= 140)
		{
			System.out.println("~ Ultrapassou o limite de caracteres! ~");
		}
		else
		{
			this.texto = tweet;
			System.out.println("~ Tweet postado! ~");
			
		}
		
		
	}
	
	
}
