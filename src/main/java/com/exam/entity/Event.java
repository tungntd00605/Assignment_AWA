package com.exam.entity;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Event {
    private Date startDate;
    private String startTime;
    private String name;
    private String place;
    private String description;

    public Date getStartDateTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        String[] splitStr = startTime.split(":");
        int hours = Integer.parseInt(splitStr[0]);
        int minutes = Integer.parseInt(splitStr[1]);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    public boolean isUpcomingEvent(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 7);
        Date upcomingDate = c.getTime();
        return upcomingDate.after(this.getStartDateTime());
    }

    public String getInputDateStringFormat(){
        return new SimpleDateFormat("yyyy-MM-dd").format(this.startDate);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
