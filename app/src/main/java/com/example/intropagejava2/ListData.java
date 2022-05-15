package com.example.intropagejava2;

/**
 * Created by Eldor Turgunov on 15.05.2022.
 * Intro Page Java2
 * eldorturgunov777@gmail.com
 */
public class ListData {
    int Img;
    String Title;
    String Desc;

    public ListData(int img, String title, String desc) {
        Img = img;
        Title = title;
        Desc = desc;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
