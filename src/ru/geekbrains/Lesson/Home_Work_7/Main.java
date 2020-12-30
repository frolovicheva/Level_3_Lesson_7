package ru.geekbrains.Lesson.Home_Work_7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        start (MyTest.class);


    }

    public static void start(Class c) {
        Method[] classMethods = c.getDeclaredMethods ();
        List<Method> listOfMethods = new ArrayList<> ();
        int countBefore = 0;
        int countAfter = 0;
        for (Method m : classMethods) {
            if (m.isAnnotationPresent (BeforeSuite.class)) {
                countBefore++;
            }
            if (m.isAnnotationPresent (AfterSuite.class)) {
                countAfter++;
            }
            if (countBefore > 1 || countAfter > 1) {
                throw new RuntimeException ();
            }
        }
        for (Method m : classMethods) {
            if (m.isAnnotationPresent (Test.class)) {
                listOfMethods.add (m);
            }
        }
        listOfMethods.sort (Comparator.comparingInt ((Method i) ->
                i.getAnnotation (Test.class).priority ()));

        for (Method m : classMethods) {
            if (m.isAnnotationPresent (BeforeSuite.class)) {
                listOfMethods.add (0,m);
            }
        }
        for (Method m : classMethods) {
            if (m.isAnnotationPresent (AfterSuite.class)) {
                listOfMethods.add (m);
            }
        }


        for (Method m : listOfMethods) {
            try {
                m.invoke (c);
            } catch (IllegalAccessException e) {
                e.printStackTrace ();
            } catch (InvocationTargetException e) {
                e.printStackTrace ();
            }
        }

    }
}
