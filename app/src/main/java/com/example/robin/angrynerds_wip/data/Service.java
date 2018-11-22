package com.example.robin.angrynerds_wip.data;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.TEN;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

import java.util.ArrayList;


/*
    Ruthild Gilles
    Methods for activities to get and save TEN objects
 */
public class Service {

    /*
        Methods for saving one TEN object
     */
    public static void saveTEN(TEN newTEN) {
        TEN oldTEN = Queries.getByID(newTEN.getID());
        if (oldTEN == null) { //new TEN (not in database)
            Queries.insertTEN(newTEN);
        } else { //existing TEN (in database)
            Queries.updateTEN(newTEN.getID(), newTEN);
        }
    }

    /*
        Method to get all TEN objects in an arraylist
     */
    public static ArrayList<TEN> getAllTENs() {
        //TODO Ruthild: Sortieren
        ArrayList<TEN> allTEN = new ArrayList<TEN>();
        Todo[] allTodos = Queries.getAllTodods();
        Event[] allEvents = Queries.getAllEvents();
        Note[] allNotes = Queries.getAllNotes();
        for (Todo t : allTodos
                ) {
            allTEN.add(t);
        }
        for (Event e : allEvents
                ) {
            allTEN.add(e);
        }
        for (Note n : allNotes
                ) {
            allTEN.add(n);
        }
        return allTEN;
    }
}
