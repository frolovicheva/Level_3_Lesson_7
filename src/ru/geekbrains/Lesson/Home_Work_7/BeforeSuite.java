package ru.geekbrains.Lesson.Home_Work_7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
public @interface BeforeSuite {
    String description() default "no description";
    int priority = 0; // Запускаем раньше всех //

}
