package ru.geekbrains.Lesson.Home_Work_7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
public @interface Test {
    int priority() default 5; //Очередность выполнения: от 1 - самый первый, до 10 - самый последний //


}
