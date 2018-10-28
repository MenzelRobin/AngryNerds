package com.example.robin.angrynerds_wip.data.services;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.TEN;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

public class setterService {

    public static void saveTEN(TEN newTEN) {
        int id = newTEN.getID();
        TEN oldTEN = getterService.getByID(id);
        if (oldTEN.getClass() == Todo.class) {
            setTodo(oldTEN, newTEN);
        } else if (oldTEN.getClass() == Event.class) {
            setEvent(oldTEN, newTEN);
        } else if (oldTEN.getClass() == Note.class) {
            setNote(oldTEN, newTEN);
        } else { //TODO throw exception or log msg
            System.out.println("Something went wrong at saveTEN");
        }
    }

    private static void setTodo(TEN oldTodo, TEN newTodo) {

        //TODO einzelne attribute ändern
        //oldTodo.setX(newTodo.getX);
    }

    private static void setEvent(TEN oldEvent, TEN newEvent) {
        oldEvent.setColor(newEvent.getColor());
        oldEvent.setTitle(newEvent.getTitle());
    }

    private static void setNote(TEN oldNote, TEN newNote) {

        //TODO einzelne setter aufrufen
        //oldNote.setX(newEvent.getX);
    }


}
