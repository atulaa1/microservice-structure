package com.example.demo.microservice.image.model;

/**
 * Created by dungpx on 12/14/2018.
 */
public class Image {

    public Image(Integer id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    private Integer id;
    private String title;
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
