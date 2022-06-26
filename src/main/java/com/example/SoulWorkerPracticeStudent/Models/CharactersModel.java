package com.example.SoulWorkerPracticeStudent.Models;

import javax.persistence.*;

@Entity
public class CharactersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String characterName;

    private String characterSkillRating;

    private String characterPower;

    @Lob
    private String characterDescription;

    private String imageurl;

    public CharactersModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterSkillRating() {
        return characterSkillRating;
    }

    public void setCharacterSkillRating(String characterSkillRating) {
        this.characterSkillRating = characterSkillRating;
    }

    public String getCharacterPower() {
        return characterPower;
    }

    public void setCharacterPower(String characterPower) {
        this.characterPower = characterPower;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    @Override
    public String toString() {
        return "characters [id=" + id + "+characterName=" + characterName + "characterSkillRating="+ characterSkillRating +"" +
                "+characterPower=" + characterPower+"+characterDescription="+characterDescription+"imageurl="+imageurl+"]";
    }
}
