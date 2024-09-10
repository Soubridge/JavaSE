package org.annotation.base;
/**
 * 注解类型 八种基本类型 int float boolean byte double char long short
 *         String Class 枚举类型 注解类型
 *         以上所有类型的一维数组
 * 注解的属性需要的名后面加括号（）
 * */
public @interface User {
    String username();
    String password();
    char sex();
    String birthday();
    String[] friends();
}
