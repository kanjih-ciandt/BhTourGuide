package com.kanjih.bhtourguide.to;


import java.io.Serializable;

/**
 * Created by kneto on 1/24/17.
 */

public class Place  implements Serializable {

    private int name;
    private int descriptionStringId = -1;
    private int smallDescription;
    private int imageResourseId = -1;
    private int imageScreenResource = -1;
    //@// TODO: 1/24/17 include map position

    public Place(int name, int descriptionStringId, int smallDescription, int imageResourseId, int imageScreenResource) {
        this.name = name;
        this.descriptionStringId = descriptionStringId;
        this.smallDescription = smallDescription;
        this.imageResourseId = imageResourseId;
        this.imageScreenResource = imageScreenResource;
    }

    public int getName() {
        return name;
    }

    public int getDescriptionStringId() {
        return descriptionStringId;
    }

    public int getSmallDescription() {
        return smallDescription;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    public int getImageScreenResource() {
        return imageScreenResource;
    }
}
