package fr.eni.tddi.controllers;

import org.springframework.stereotype.Controller;

import fr.eni.tddi.services.TreasureService;

@Controller("salleTresor")
public class TreasureRoomController {
	
	private TreasureService tresorService;
	
	public TreasureRoomController( TreasureService treasureService) {
		this.tresorService = treasureService;
	}
	
	public String fin() {
		return tresorService.ouvrir();
	}
}
