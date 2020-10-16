package fr.eni.tddi.controllers;


import fr.eni.tddi.services.TreasureService;


public class TreasureRoomController {
	
	private TreasureService tresorService;
	
	public TreasureRoomController( TreasureService treasureService) {
		this.tresorService = treasureService;
	}
	
	public String fin() {
		return tresorService.ouvrir();
	}
}
