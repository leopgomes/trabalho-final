package com.example;

/**
 * Created by Leandro on 07/09/2015.
 */
public class Citation {

    private String author;
    private String citation;


    public Citation(String author, String citation) {
        this.author = author;
        this.citation = citation;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }
}
