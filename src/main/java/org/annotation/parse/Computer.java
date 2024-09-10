package org.annotation.parse;

import java.lang.annotation.*;
/**
 * 如果注解需要解析，那么@Retentation 注解一定要给(RetentionPolicy.RUNTIME)
 * */
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Computer {
    String value();
    double price() default 2000.0D;
    String[] factories();
}
