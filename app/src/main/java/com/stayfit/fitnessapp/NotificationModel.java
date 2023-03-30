package com.stayfit.fitnessapp;

public class NotificationModel {

    private String id, notifications_image, notifications_name, notifications_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotifications_image() {
        return notifications_image;
    }

    public void setNotifications_image(String notifications_image) {
        this.notifications_image = notifications_image;
    }

    public String getNotifications_name() {
        return notifications_name;
    }

    public void setNotifications_name(String notifications_name) {
        this.notifications_name = notifications_name;
    }

    public String getNotifications_time() {
        return notifications_time;
    }

    public void setNotifications_time(String notifications_time) {
        this.notifications_time = notifications_time;
    }

    public NotificationModel(String id, String notifications_image, String notifications_name, String notifications_time) {
        this.id = id;
        this.notifications_image = notifications_image;
        this.notifications_name = notifications_name;
        this.notifications_time = notifications_time;
    }

    public NotificationModel() {
    }
}



