package com.example.robin.angrynerds_wip.data.services;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

public class setterService {
    /*

     */
/* Ruthild Gilles (16.11.2018)
     Methode "saveTEN" kann für jede Art von TEN aufgerufen werden.
     Werden weitere Attribute in den jeweiligen TEN Klassen hinzugefügt oder geändert,
     müssen auch hier die Methoden angepasst werden.
    *//*


    public static void saveTEN(Todo newTodo) {
        int id = newTodo.getID();
        Todo oldTodo = getterService.getTodoByID(id);
        oldTodo.setTitle(newTodo.getTitle());
        oldTodo.setColor(newTodo.getColor());
        oldTodo.setNote(newTodo.getNote());
        oldTodo.setTasks(newTodo.getTasks());
    }

    public static void saveTEN(Event newEvent) {
        int id = newEvent.getID();
        Event oldEvent = getterService.getEventByID(id);
        oldEvent.setTitle(newEvent.getTitle());
        oldEvent.setColor(newEvent.getColor());
        oldEvent.setAddress(newEvent.getAddress());
        oldEvent.setRecurringType(newEvent.getRecurringType());
        oldEvent.setReminder(newEvent.getReminder());
        oldEvent.setTime(newEvent.getTime());
    }

    public static void saveTEN(Note newNote) {
        int id = newNote.getID();
        Note oldNote = getterService.getNoteByID(id);
        oldNote.setTitle(newNote.getTitle());
        oldNote.setColor(newNote.getColor());
        oldNote.setDescription(newNote.getDescription());
    }
*/

}
