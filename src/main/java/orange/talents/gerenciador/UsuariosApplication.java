package orange.talents.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("orange.talents")
public class UsuariosApplication {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main (String[] args) {SpringApplication.run(GerenciadorViagensMontanhaApplication.class, args); }

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setCPF("028.516.780-43");
			usuario.setEmail("nefaw11597@d4wan.com");
			usuario.setNome("Maria");
			usuario.setDataNascimento("01/09/1983");
			this.usuarioRepository.save(usuario);

			Usuario usuario = new Usuario();
			usuario.setCPF("325.295.200-97");
			usuario.setEmail("nefaw10495@d4wan.com");
			usuario.setNome("Isabel");
			usuario.setDataNascimento("07/05/1996");
			this.usuarioRepository.save(usuario);

		};
	}


}
