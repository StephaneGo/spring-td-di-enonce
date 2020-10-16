package fr.eni.tddi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("passage1")
@Service("roomService")
public class EscapeTrapService implements RoomService{

	
	public String entreeSalle() {
		return "Perdu, vous etes dans la mauvaise salle !";
	}

}
