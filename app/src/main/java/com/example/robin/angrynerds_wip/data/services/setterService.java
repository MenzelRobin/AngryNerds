package com.example.robin.angrynerds_wip.data.services;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.TEN;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

public class setterService {

    public static void setTodo(Todo newTodo){
        int id = newTodo.getID();
        //TODO polymorphie problem  beheben
        TEN oldTEN = getterService.getByID(id);
		//Todo oldTodo = getterService.getByID(id);
		//TODO einzelne attribute ändern
		//oldTodo.setX(newTodo.getX);
    }
	
	public static void setEvent(Event newEvent){
        int id = newEvent.getID();
		//Event oldEvent = getterService.getByID(id);
		//oldEvent.setX(newEvent.getX);
    }
	
	public static void setNote(Note newNote){
        int id = newNote.getID();
		//Note oldNote = getterService.getByID(id);
		//oldNote.setX(newEvent.getX);
    }

    
}
