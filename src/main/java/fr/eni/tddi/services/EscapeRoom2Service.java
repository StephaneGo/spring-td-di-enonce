package fr.eni.tddi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("passage2")

public class EscapeRoom2Service {
	
	public String entreeSalle(){
		return "Bravo, vous avez trouvé la deuxième salle !";
	}

}
