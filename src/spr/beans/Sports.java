/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author deshp
 */
public class Sports {
    private String sportName;
    private String about;

    public Sports(String sportName, String about) {
        this.sportName = sportName;
        this.about = about;
    }
    public Sports(){}
    
    public String toString(){
        return sportName+" "+about;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
}
