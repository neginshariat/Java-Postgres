package com.JavaPostgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "`Gallery`")

public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long  id;
    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id= id;
    }

    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Column(name="season")
    private String season;
    public String getSeason() {
        return season;
    }
    public void setSeason(String season){
        this.season= season;
    }

    @Column(name="type")
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    @Column(name="price")
    private long price;
    public long getPrice() {
        return price;
    }
    public void setPrice(Long price){
        this.price= price;
    }

/*     public Image(){}

    public Image(long id, String name , String season , String type ,long price){
        this.id=id;
        this.name=name;
        this.season=season;
        this.type = type;
        this.price=price;
    } */
    @Override
    public String toString() {
        return "Imag [id=" + id + ", Name=" + name + ", Season=" + season + ", Type=" + type
        + ", Price=" + price + "]";
    }
}