package com.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "Rooms")
public class Rooms {
    @Id
    @Column
    private Integer room_id;
    @Column
    private Integer room_no;
    @Column
    private String type;
    @Column
    private Integer price;
    @Column
    private String details;
    @Column
    private String image;

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Integer getRoom_no() {
        return room_no;
    }

    public void setRoom_no(Integer room_no) {
        this.room_no = room_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "room_id=" + room_id +
                ", room_no=" + room_no +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", details='" + details + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
