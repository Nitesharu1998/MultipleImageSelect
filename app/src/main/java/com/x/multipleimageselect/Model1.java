package com.x.multipleimageselect;

import android.net.Uri;

import java.net.URI;

public class Model1 {

    Uri images;

    public  Model1(Uri images){
        this.images=images;
    }

    public Uri getImages() {
        return images;
    }

    public void setImages(Uri images) {
        this.images = images;
    }
}
