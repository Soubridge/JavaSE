package org.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
/**
 * Lombok插件常用的方法
 * @Getter @Setter @ToString @EqualsAndHashCode   == @Data
 * @NoArgsConstructor @AllArgsConstruct 无参和满参构造函数
 * @NonNull 标记在形参上，避免传来的方法为空值，为空时会在控制台提醒
 * @Slf4j   标记在类，生成属性名为log的log4j的日志对象
 * */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;

    public void eat(@NonNull String food){
        System.out.println(name + "吃了" + food);
    }
}
