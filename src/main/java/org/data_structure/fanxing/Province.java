package org.data_structure.fanxing;

public class Province {
    private String name;
    private String shortName;
    private String location;
    public void intro(){
        System.out.println("名称: " + name + ",简称: " + shortName + ",所属地区: " + location);
    }
    public Province(){}
    public Province(String name, String shortName, String location){
        this.name = name;
        this.shortName = shortName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
