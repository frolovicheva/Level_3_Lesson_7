package ru.geekbrains.Lesson.Lesson_7;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
//        Class c1 = Cat.class;
//        Class c2 = new Cat("A",7,"R").getClass();
//        Class c3 = Class.forName("lesson7.Cat");


//        Constructor<Cat> constr = c1.getConstructor(String.class, int.class, String.class);
//        Cat cat = constr.newInstance("Barsik", 5, "red");

//        cat.info();

//        System.out.println(int.class);
//        System.out.println(int[].class);
//        System.out.println(int[][].class);

//        Method[] methods =  c1.getMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

//        Method[] methods =  c1.getDeclaredMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

//        Method mInfo = c1.getDeclaredMethod("info");
//        mInfo.invoke(cat);


//        int mod = mInfo.getModifiers();
//        System.out.println("isPublic "+ Modifier.isPublic(mod));
//        System.out.println("isFinal "+ Modifier.isFinal(mod));
//        System.out.println("isStatic "+ Modifier.isStatic(mod));
//        System.out.println("isSynchronized "+ Modifier.isSynchronized(mod));


//        Field[] fields = c1.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

//        Field field = c1.getDeclaredField("color");
//        field.setAccessible(true);
//        System.out.println(field.get(cat));
//        field.set(cat, "purple");
//
//        cat.info();
//        SecurityManager


        Class mt = LessonTest.class;
        Method[] methods = mt.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Anno.class)) {
                System.out.println(m.getAnnotation(Anno.class).description());
                m.invoke(null);
            }
        }


    }
}
