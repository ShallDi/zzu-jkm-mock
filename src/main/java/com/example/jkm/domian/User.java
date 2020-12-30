package com.example.jkm.domian;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String time;
    @Column
    private String mockLocation;
    @Column
    private String collage;
    @Column
    private String passInfo;
    @Column
    private String passIdentity;
    @Column
    private String imagesUrl;

    public String getMockLocation() {
        return mockLocation;
    }

    public void setMockLocation(String mockLocation) {
        this.mockLocation = mockLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public String getPassIdentity() {
        return passIdentity;
    }

    public void setPassIdentity(String passIdentity) {
        this.passIdentity = passIdentity;
    }

    public String getPassInfo() {
        return passInfo;
    }

    public void setPassInfo(String passInfo) {
        this.passInfo = passInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getCollageWithUsername() {
        return this.collage + this.name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String collage, String passInfo, String passIdentity, String imagesUrl) {
        this.name = name;
        this.collage = collage;
        this.passInfo = passInfo;
        this.passIdentity = passIdentity;
        this.imagesUrl = imagesUrl;
    }
}
