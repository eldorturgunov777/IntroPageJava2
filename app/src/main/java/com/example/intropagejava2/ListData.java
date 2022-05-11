package com.example.intropagejava2;

/**
 * Created by Eldor Turgunov on 11.05.2022.
 * Intro Page Java2
 * eldorturgunov777@gmail.com
 */
public class ListData {
    String Title, Description;
    int ScreenImg;

    public ListData(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
