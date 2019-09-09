
public class TestTweet {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("Jose");
		usuario.setUsuario("@josebolado");
		
		//usuario.Login();
		
		Tweet t1 = new Tweet();
		Tweet t2 = new Tweet();
		t1.Tweetar();
		t2.Tweetar();
		usuario.adicionarTweet(t1);
		usuario.adicionarTweet(t2);
		System.out.println("\r\n");
		usuario.imprimirTweet();
		usuario.Logout();
		
	}

}
