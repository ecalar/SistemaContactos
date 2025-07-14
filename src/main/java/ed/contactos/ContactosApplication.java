package ed.contactos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ContactosApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactosApplication.class, args);
	}
}