/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author deshp
 */
public class Hobby {
    private int totalHobbies;
    private Sports sport;

    public Hobby() {
    }

    public Hobby(int totalHobbies, Sports sport) {
        this.totalHobbies = totalHobbies;
        this.sport = sport;
    }
    
    public String toString(){
        return totalHobbies +" "+sport;
    }

    public int getTotalHobbies() {
        return totalHobbies;
    }

    public void setTotalHobbies(int totalHobbies) {
        this.totalHobbies = totalHobbies;
    }

    public Sports getSport() {
        return sport;
    }

    public void setSport(Sports sport) {
        this.sport = sport;
    }
    
}
