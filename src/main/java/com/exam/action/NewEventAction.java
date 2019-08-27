package com.exam.action;


import com.exam.entity.Event;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class NewEventAction extends ActionSupport implements Preparable {
    private Event event;
    private Event editEvent;
    private int editIndex;
    private int deleteIndex;
    private static List<Event> events;

    public void prepare() throws Exception {
        if(events == null){
            events = new ArrayList<Event>();
        }
    }

    public String form(){
        event = new Event();
        return INPUT;
    }

    public String create(){
        events.add(event);
        event = new Event();
        return SUCCESS;
    }

    public String list(){
        return INPUT;
    }

    public String edit() {
        editEvent = events.get(editIndex);
        return INPUT;
    }

    public String update(){
        events.set(editIndex, editEvent);
        return SUCCESS;
    }

    public String delete(){
        events.remove(deleteIndex);
        return SUCCESS;
    }

    public void validate(){
        if(event != null && ServletActionContext.getContext().getActionInvocation().getProxy().getMethod().equals("create")){
            if (event.getName().length() == 0) {
                addFieldError("event.name", "Event name is required.");
            }

            if (event.getPlace().length() == 0 ) {
                addFieldError("event.place", "Place name is required.");
            }

            if (event.getDescription().length() == 0) {
                addFieldError("event.description", "Event description is required.");
            }

            if (event.getStartTime().length() == 0) {
                addFieldError("event.startTime", "Event time is required.");
            }

            if (event.getStartDate() == null ) {
                addFieldError("event.startDate", "Event date is required.");
            } else if(event.getStartDate().before(new Date())){
                addFieldError("event.startDate", "Event date must be in the future.");
            }
        }

        if(editEvent != null && ServletActionContext.getContext().getActionInvocation().getProxy().getMethod().equals("update")){
            if (editEvent.getName().length() == 0) {
                addFieldError("editEvent.name", "Event name is required.");
            }

            if (editEvent.getPlace().length() == 0 ) {
                addFieldError("editEvent.place", "Place name is required.");
            }

            if (editEvent.getDescription().length() == 0) {
                addFieldError("editEvent.description", "Event description is required.");
            }

            if (editEvent.getStartTime().length() == 0) {
                addFieldError("editEvent.startTime", "Event time is required.");
            }

            if (editEvent.getStartDate() == null ) {
                addFieldError("editEvent.startDate", "Event date is required.");
            } else if(editEvent.getStartDate().before(new Date())){
                addFieldError("editEvent.startDate", "Event date must be in the future.");
            }
        }
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Event getEditEvent() {
        return editEvent;
    }

    public void setEditEvent(Event editEvent) {
        this.editEvent = editEvent;
    }

    public int getEditIndex() {
        return editIndex;
    }

    public void setEditIndex(int editIndex) {
        this.editIndex = editIndex;
    }

    public int getDeleteIndex() {
        return deleteIndex;
    }

    public void setDeleteIndex(int deleteIndex) {
        this.deleteIndex = deleteIndex;
    }
}
