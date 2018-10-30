package com.example.robin.angrynerds_wip.data.models.tens;

import com.example.robin.angrynerds_wip.data.models.utils.Adress;
import com.example.robin.angrynerds_wip.data.models.utils.RecurringType;

import java.util.Date;

public class Event extends TEN {
    private Date time;
    private Date [] reminder;
    private Adress adress;
    private RecurringType recurringType;

    //Constructor
    public Event(String title, int[] bgColors, Date time, Date[] reminder) {
        super(title, bgColors);
        this.time = time;
        this.reminder = reminder;
        this.adress = null;
        this.recurringType = RecurringType.NONE;
    }

    public Event(String title, int[] bgColors, Date time, Date[] reminder, Adress adress) {
        super(title, bgColors);
        this.time = time;
        this.reminder = reminder;
        this.adress = adress;
        this.recurringType = RecurringType.NONE;
    }

    public Event(String title, int[] bgColors, Date time, Date[] reminder, Adress adress, RecurringType recurringType) {
        super(title, bgColors);
        this.time = time;
        this.reminder = reminder;
        this.adress = adress;
        this.recurringType = recurringType;
    }

    public Event(String title, int[] bgColors, Date time, Date[] reminder, RecurringType recurringType) {
        super(title, bgColors);
        this.time = time;
        this.reminder = reminder;
        this.adress = null;
        this.recurringType = recurringType;
    }

    public Event(String title, int color, Date time, Date[] reminder, Adress adress, RecurringType recurringType) {
        super(title, color);
        this.time = time;
        this.reminder = reminder;
        this.adress = adress;
        this.recurringType = recurringType;
    }

    //Getter and Setter
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date[] getReminder() {
        return reminder;
    }

    public void setReminder(Date[] reminder) {
        this.reminder = reminder;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public RecurringType getRecurringType() {
        return recurringType;
    }

    public void setRecurringType(RecurringType recurringType) {
        this.recurringType = recurringType;
    }
}
