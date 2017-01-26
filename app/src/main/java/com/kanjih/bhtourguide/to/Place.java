package com.kanjih.bhtourguide.to;



/**
 * Created by kneto on 1/24/17.
 */

public class Place {

    private String name;
    private String description;
    private String smallDescription;
    private int imageResourseId;
    //@// TODO: 1/24/17 include map position


    public Place(String name, String smallDescription) {
        this.name = name;
        this.smallDescription = smallDescription;
    }

    public Place(String name, String smallDescription, int imageResourseId) {
        this.name = name;
        this.smallDescription = smallDescription;
        this.imageResourseId = imageResourseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    public void setImageResourseId(int imageResourseId) {
        this.imageResourseId = imageResourseId;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }
}
