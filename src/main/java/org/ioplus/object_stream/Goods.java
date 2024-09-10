package org.ioplus.object_stream;

import java.io.Serializable;

public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private Double price;
    private transient Integer store;

    private String band;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Goods(String title, Double price, Integer store) {
        this.title = title;
        this.price = price;
        this.store = store;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}
