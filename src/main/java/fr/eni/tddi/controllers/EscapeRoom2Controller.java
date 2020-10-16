package fr.eni.tddi.controllers;


import fr.eni.tddi.services.RoomService;


public class EscapeRoom2Controller {

	private RoomService roomService;
	
	public void entreeSalle2() {
		System.out.println(roomService.entreeSalle());
	}
	
}
