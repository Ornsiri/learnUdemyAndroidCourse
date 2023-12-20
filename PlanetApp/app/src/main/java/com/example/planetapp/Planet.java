package com.example.planetapp;

public class Planet {

//    Attributes
    private String planetName, moonCount;
    private int planetImg;

//    Constructor
    public Planet(String planetName, String moonCount, int planetImg) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImg = planetImg;
    }

//    Getter and Setter

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImg() {
        return planetImg;
    }

    public void setPlanetImg(int planetImg) {
        this.planetImg = planetImg;
    }


}
