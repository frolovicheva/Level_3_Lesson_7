package ru.geekbrains.Lesson.Lesson_7;

public class LessonTest {
    @Anno(description = "Запускаю тест 1")
    public static void test1(){
        System.out.println("test1");
    }

    @Anno(time = 6,description = "terter")
    public static void test2(){
        System.out.println("test2");
    }

    @Anno
    public static void test3(){
        System.out.println("test3");
    }
}
