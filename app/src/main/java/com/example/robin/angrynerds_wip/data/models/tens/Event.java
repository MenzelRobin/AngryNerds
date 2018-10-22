package com.example.robin.angrynerds_wip.data.models.tens;

import com.example.robin.angrynerds_wip.data.models.utils.Adress;

import java.util.Date;

public class Event extends TEN {
    private Date time;
    private Date [] reminder;
    private Adress adress;
    private boolean yearly;

    //Constructor


    public Event(String title, Date time, Date[] reminder) {
        super(title);
        this.time = time;
        this.reminder = reminder;
        this.adress = null;
        this.yearly = false;
    }

    public Event(String title, Date time, Date[] reminder, Adress adress) {
        super(title);
        this.time = time;
        this.reminder = reminder;
        this.adress = adress;
        this.yearly = false;
    }

    public Event(String title, Date time, Date[] reminder, Adress adress, boolean yearly) {
        super(title);
        this.time = time;
        this.reminder = reminder;
        this.adress = adress;
        this.yearly = yearly;
    }

    public Event(String title, Date time, Date[] reminder, boolean yearly) {
        super(title);
        this.time = time;
        this.reminder = reminder;
        this.adress = null;
        this.yearly = yearly;
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

    public boolean isYearly() {
        return yearly;
    }

    public void setYearly(boolean yearly) {
        this.yearly = yearly;
    }
}
