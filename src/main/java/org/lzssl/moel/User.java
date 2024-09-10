package org.lzssl.moel;

public class User {
    public String username;
    public String address;
    public Integer id;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public User(String username, String address, Integer id) {
        System.out.println("------------有参init-------------");
        this.username = username;
        this.address = address;
        this.id = id;
    }

    public User() {
        System.out.println("--------无参init---------");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
