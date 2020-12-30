package ru.geekbrains.Lesson.Home_Work_7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
public @interface AfterSuite {
    String description() default "no description";
    int priority = 2147483647; // Запускаем позже всех //

}
