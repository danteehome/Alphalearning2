package com.example.dante.alphalearning;

public class Alphainfo {
    private String name;
    private int sounds;
    private String description;
    private int photo;
    private int gif;
    private String examples;
    private String speech;


    public Alphainfo(String name, int sounds,String description, String examples, int photo, int gif,String speech) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.gif=gif;
        this.name=name;
        this.photo=photo;
        this.speech=speech;

    }
    public Alphainfo(String name, int sounds,String description, String examples, int photo, int gif) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.gif=gif;
        this.name=name;
        this.photo=photo;

    }
    public Alphainfo(String name, int sounds,String description, String examples, int gif, String speech) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.gif=gif;
        this.name=name;
        this.speech=speech;
    }
    public Alphainfo(String name, int sounds,String description, String examples,String speechint,int photo) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.photo=photo;
        this.name=name;
        this.speech=speech;


    }
    public Alphainfo(String name, int sounds,String description, String examples, int gif, String speech,int photo
    ) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.gif=gif;
        this.name=name;
        this.speech=speech;
        this.photo=photo;



    }
    public Alphainfo(String name, int sounds,String description, String examples, int photo) {
        this.description = description;
        this.examples = examples;
        this.sounds = sounds;
        this.name=name;
        this.photo=photo;

    }

    public String getDescription() {
        return description;
    }

    public int getGif() {
        return gif;
    }

    public int getPhoto() {
        return photo;
    }

    public String getSpeech() {
        return speech;
    }

    public String getExamples() {
        return examples;
    }

    public String getName() {
        return name;
    }

    public int getSounds() {
        return sounds;
    }
    @Override
    public String toString(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public void setGif(int gif) {
        this.gif = gif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setSounds(int sounds) {
        this.sounds = sounds;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

}
