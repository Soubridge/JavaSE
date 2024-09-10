package org.enmu.base;

/**
 * 枚举类用来表示一组常量，如 四季、12个月、星期的7天...
 * 枚举类不能通过new的方式获取到实例，只能通过 Class.x获取实例
 * 枚举类可以使得switch结构更清晰
 * */
public enum Season_enum {
    SPRING,SUMMER,AUTUMN,WINTER
}
