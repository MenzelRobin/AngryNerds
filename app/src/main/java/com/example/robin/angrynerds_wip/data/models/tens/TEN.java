package com.example.robin.angrynerds_wip.data.models.tens;

import java.util.Random;

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

    //Constructor for random color. Color array from colors.xml has to be handed over from activity.
    //use this: int[] bgColors = getResources().getIntArray(R.array.bgColors);
    //TODO Color Array hand over from corresponding Activity
    public TEN(String title, int[] bgColors) {
        this.color = bgColors[new Random().nextInt(bgColors.length)];
        this.ID = TEN.nextID++;
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
