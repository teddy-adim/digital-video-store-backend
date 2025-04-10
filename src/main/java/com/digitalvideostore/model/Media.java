package com.digitalvideostore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "media")
public class Media {
    @Id
    private String id;
    private String title;
    private String synopsis;
    private String type; 
    private double rentPrice;
    private double buyPrice;
    private boolean featured;
    private String smallPoster;
    private String largePoster;

    // ✅ Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getType() {
        return type;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public boolean isFeatured() {
        return featured;
    }

    public String getSmallPoster() {
        return smallPoster;
    }

    public String getLargePoster() {
        return largePoster;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public void setSmallPoster(String smallPoster) {
        this.smallPoster = smallPoster;
    }

    public void setLargePoster(String largePoster) {
        this.largePoster = largePoster;
    }
}
