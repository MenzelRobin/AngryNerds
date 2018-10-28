package com.example.robin.angrynerds_wip.data.models.mockdata;

import com.example.robin.angrynerds_wip.data.models.tens.Event;
import com.example.robin.angrynerds_wip.data.models.tens.Note;
import com.example.robin.angrynerds_wip.data.models.tens.TEN;
import com.example.robin.angrynerds_wip.data.models.tens.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mockTEN {
    private static ArrayList<TEN> mockTENs = new ArrayList<>();


    public static void initMockdata() {

        //mockdata
        Todo t1 = new Todo("Todo 1");
        mockTENs.add(0, t1);

        Note n1 = new Note("Notiz 1");
        mockTENs.add(1, n1);

        Date dateEvent = new Date(2018 / 10 / 28);
        Date[] datesEvent = new Date[2018];
        Event e1 = new Event("Event 1", dateEvent, datesEvent);
        mockTENs.add(2, e1);

    }

    //print Array
    public static void printMockTENs() {
        for (TEN ten : mockTENs
                ) {
            System.out.println(ten.getTitle());
        }
    }


}
