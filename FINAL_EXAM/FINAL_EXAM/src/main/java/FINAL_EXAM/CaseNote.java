/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_EXAM;

import java.time.LocalDateTime;

/**
 *
 * @author blair
 */
public class CaseNote {
    private int caseNoteID;
    private int personID;
    private LocalDateTime createTime;
    private String caseNoteText;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;
    private int sec;

    public CaseNote(int caseNoteID, int personID, String caseNoteText, int day, int month, int year, int hour, int min, int sec) {
        this.caseNoteID = caseNoteID;
        this.personID = personID;
        this.caseNoteText = caseNoteText;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    
    @Override
    public String toString() { //edit this to cnange format into proper ones
        return "Case Note " + getDay() + "/" + getMonth() + "/" + getDay() + "  " + getHour() + ":"+ getMin() + ":" + getSec()  ;
    }

    public CaseNote() {
        this.createTime = LocalDateTime.now();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCaseNoteText() {
        return caseNoteText;
    }

    public void setCaseNoteText(String caseNoteText) {
        this.caseNoteText = caseNoteText;
    }

    /**
     * @return the caseNoteID
     */
    public int getCaseNoteID() {
        return caseNoteID;
    }

    /**
     * @param caseNoteID the caseNoteID to set
     */
    public void setCaseNoteID(int caseNoteID) {
        this.caseNoteID = caseNoteID;
    }
}