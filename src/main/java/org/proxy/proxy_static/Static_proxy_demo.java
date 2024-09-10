package org.proxy.proxy_static;

public class Static_proxy_demo {
    public static void main(String[] args) {
        FangDong fangDong = new FangDong();
        fangDong.HaiJingFang();
        System.out.println("............................");

        ZhongJie zhongJie = new ZhongJie(fangDong);
        zhongJie.HaiJingFang();
        System.out.println("............................");
        zhongJie.GongYu();
        System.out.println("............................");
    }
}
