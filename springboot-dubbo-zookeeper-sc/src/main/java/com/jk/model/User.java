package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/3.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1499906727911910538L;
    private String id;
    private String username;
    private Integer age;
    private Integer sex;
    private String yn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", yn='" + yn + '\'' +
                '}';
    }
}
