package com.example.amine_000.test_application;

/**
 * Created by aman on 6/13/15.
 */
public class Guide {
    public int picture;
    public String name;
    public String rating;
    public String descrip;
    public Guide(){
        super();
    }

    public Guide(int icon, String title, String rating, String descrip) {
        super();
        this.picture = icon;
        this.name = title;
        this.rating = rating;
        this.descrip = descrip;
    }
}