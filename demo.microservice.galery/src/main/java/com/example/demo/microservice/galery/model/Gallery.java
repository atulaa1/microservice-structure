package com.example.demo.microservice.galery.model;

import java.util.List;

/**
 * Created by dungpx on 12/14/2018.
 */
public class Gallery {

    private Integer id;
    private List<Object> images;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
