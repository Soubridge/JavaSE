package org.data_structure.shuangliejihe;

import java.util.Objects;

public class City {
    private String province;
    private String name;

    public City(String province, String name){
        this.province = province;
        this.name = name;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "省份：" + province + " 省会：" + name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("调用了equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(province, city.province) && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(province,name));
        return Objects.hash(province, name);
    }
}
