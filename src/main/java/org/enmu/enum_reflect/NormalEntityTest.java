package org.enmu.enum_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NormalEntityTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<NormalEntity> entityClass = NormalEntity.class;
        Constructor<NormalEntity> normalConstructor = entityClass.getDeclaredConstructor();
        normalConstructor.setAccessible(true);
        NormalEntity normalEntity = normalConstructor.newInstance();
    }
}
