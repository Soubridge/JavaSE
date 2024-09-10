package org.lzssl.demo_city;

public class MainCity {
    public static void main(String[] args) {
        GuiZhouPerson gz = new GuiZhouPerson("gz", 25);
        gz.travel(new JiangXi());
        gz.chili();
        gz.sour();
    }
}
