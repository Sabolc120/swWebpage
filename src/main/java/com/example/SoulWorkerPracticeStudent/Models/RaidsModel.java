package com.example.SoulWorkerPracticeStudent.Models;

import javax.persistence.*;

@Entity
public class RaidsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String raidTitle;

    private String bannerUrl;

    private String imageUrl;

    private String secondImageUrl;

    @Lob
    private String raidDescription;

    private String raidGear;

    private String suggestionsTitleOne;

    private String suggestionOne;

    private String suggestionsTitleTwo;

    private String suggestionTwo;

    private String suggestionsTitleThree;

    private String suggestionThree;

    public RaidsModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaidTitle() {
        return raidTitle;
    }

    public void setRaidTitle(String raidTitle) {
        this.raidTitle = raidTitle;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSecondImageUrl() {
        return secondImageUrl;
    }

    public void setSecondImageUrl(String secondImageUrl) {
        this.secondImageUrl = secondImageUrl;
    }

    public String getRaidDescription() {
        return raidDescription;
    }

    public void setRaidDescription(String raidDescription) {
        this.raidDescription = raidDescription;
    }

    public String getRaidGear() {
        return raidGear;
    }

    public void setRaidGear(String raidGear) {
        this.raidGear = raidGear;
    }

    public String getSuggestionsTitleOne() {
        return suggestionsTitleOne;
    }

    public void setSuggestionsTitleOne(String suggestionsTitleOne) {
        this.suggestionsTitleOne = suggestionsTitleOne;
    }

    public String getSuggestionOne() {
        return suggestionOne;
    }

    public void setSuggestionOne(String suggestionOne) {
        this.suggestionOne = suggestionOne;
    }

    public String getSuggestionsTitleTwo() {
        return suggestionsTitleTwo;
    }

    public void setSuggestionsTitleTwo(String suggestionsTitleTwo) {
        this.suggestionsTitleTwo = suggestionsTitleTwo;
    }

    public String getSuggestionTwo() {
        return suggestionTwo;
    }

    public void setSuggestionTwo(String suggestionTwo) {
        this.suggestionTwo = suggestionTwo;
    }

    public String getSuggestionsTitleThree() {
        return suggestionsTitleThree;
    }

    public void setSuggestionsTitleThree(String suggestionsTitleThree) {
        this.suggestionsTitleThree = suggestionsTitleThree;
    }

    public String getSuggestionThree() {
        return suggestionThree;
    }

    public void setSuggestionThree(String suggestionThree) {
        this.suggestionThree = suggestionThree;
    }

    @Override
    public String toString() {
        return "RaidsModel{" +
                "id=" + id +
                ", raidTitle='" + raidTitle + '\'' +
                ", bannerUrl='" + bannerUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", secondImageUrl='" + secondImageUrl + '\'' +
                ", raidDescription='" + raidDescription + '\'' +
                ", raidGear='" + raidGear + '\'' +
                ", suggestionsTitleOne='" + suggestionsTitleOne + '\'' +
                ", suggestionOne='" + suggestionOne + '\'' +
                ", suggestionsTitleTwo='" + suggestionsTitleTwo + '\'' +
                ", suggestionTwo='" + suggestionTwo + '\'' +
                ", suggestionsTitleThree='" + suggestionsTitleThree + '\'' +
                ", suggestionThree='" + suggestionThree + '\'' +
                '}';
    }
}
