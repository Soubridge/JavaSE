package org.api_test.random;

import java.util.Random;

public class RandomDianMing {
    public static void main(String[] args) {
        String[] nationHero = {
                "精忠报国：岳飞",
                "海疆英魂：邓世昌",
                "抗倭英雄：戚继光",
                "虎门销烟：林则徐"
        };
        Random random = new Random();
        for(int i=1;i<=5;i++){
            int num = random.nextInt(4);
            System.out.println(nationHero[num]);
        }
    }
}
