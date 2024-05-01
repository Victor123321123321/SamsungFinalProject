package com.example.samsungfinalproject;

public class Theorem {
    private int id;
    private String title;
    private String content;
    private String imagePath;

    public Theorem() {
    }

    public Theorem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
