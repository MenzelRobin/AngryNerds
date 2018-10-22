package com.example.robin.angrynerds_wip.data.models.tens;

public class TEN {
    private String title;
    private int ID;
    private int color;

    private static int nextID = 0;

    //Constructor
    public TEN(String title, int ID, int color) {
        this.title = title;
        this.ID = ID;
        this.color = color;
    }

    public TEN(String title) {
        this.color = (int) Math.random() * 255 * 255 * 255;
        this.ID = TEN.nextID;
        TEN.nextID++;
        this.title=title;
    }


    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
