package com.tts.springboothomework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Swimmers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer lapTime;

    public Swimmers(){
        //
    }
    public Swimmers(String firstName, Integer lapTime, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        setLapTime(lapTime);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getLapTime() {
        return lapTime;
    }

    public void setLapTime(Integer lapTime) {
        this.lapTime = lapTime;
    }

    @Override
    public String toString(){
        return "Swimmers [id=" + id + ", firstName=" + firstName + ",lastName="
                +lastName + ", lapTime=" + lapTime + "]";
    }
}
