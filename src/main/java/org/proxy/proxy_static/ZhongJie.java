package org.proxy.proxy_static;

public class ZhongJie implements HeTong{

    private FangDong fangDong;

    public ZhongJie(FangDong fangDong){
        this.fangDong = fangDong;
    }
    @Override
    public void GongYu() {
        fangDong.GongYu();
        System.out.print("中介在基础上加100");
    }

    @Override
    public void JiangJingFang() {
        fangDong.JiangJingFang();
        System.out.println("中介在基础上加200");
    }

    @Override
    public void HaiJingFang() {
        fangDong.HaiJingFang();
        System.out.println("中介在基础上加300");
    }
}
