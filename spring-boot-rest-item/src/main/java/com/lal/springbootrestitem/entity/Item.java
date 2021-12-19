package com.lal.springbootrestitem.entity;

import java.util.Date;


public class Item {

    private int id;
    private String name;
    private String description;
    private Date created;
    private Date updated;
    
    public Item() {
    }

    public Item(int id, String name, String description, Date created, Date updated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Item [created=" + created + ", description=" + description + ", id=" + id + ", name=" + name
                + ", updated=" + updated + "]";
    }    
}
