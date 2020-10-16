package fr.eni.tddi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.eni.tddi.services.RoomService;

@Controller("room2")
public class EscapeRoom2Controller {

	@Autowired
	private RoomService roomService;
	
	public void entreeSalle2() {
		System.out.println(roomService.entreeSalle());
	}
	
}
