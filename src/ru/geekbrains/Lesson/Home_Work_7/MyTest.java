package ru.geekbrains.Lesson.Home_Work_7;

public class MyTest {

    @BeforeSuite(description = "Once before all")
    public static void beforeSuiteTest(){
        System.out.println (BeforeSuite.class.getSimpleName () + " Очередность выполнения - " + BeforeSuite.priority);
    }

//    -- Проверка метода start на RunTimeException --

//    @BeforeSuite()
//    public static void beforeSuiteTest2(){
//        System.out.println (BeforeSuite.class.getSimpleName () + " Очередность выполнения - " + BeforeSuite.priority);
//    }

    @Test(priority = 1)
    public static void testOne(){
        System.out.println (Test.class.getSimpleName () + " Очередность выполнения - 1");
    }
    @Test(priority = 3)
    public static void testTwo(){
        System.out.println (Test.class.getSimpleName () + " Очередность выполнения - 3");
    }
    @Test()
    public static void testThree(){
        System.out.println (Test.class.getSimpleName () + " Очередность выполнения - 5");
    }
    @Test(priority = 7)
    public static void testFour(){
        System.out.println (Test.class.getSimpleName () + " Очередность выполнения - 7");
    }

    //Этот метод без аннотации и выполняться при запуске метода start не должен//
    public static void notTest(){
        System.out.println ("Этот метод не тест");
    }

    @Test(priority = 10)
    public static void testFive(){
        System.out.println (Test.class.getSimpleName () + " Очередность выполнения - 10");
    }

    @AfterSuite (description = "The last one")
    public static void afterSuiteTest(){
        System.out.println (AfterSuite.class.getSimpleName () + " Очередность выполнения - " + AfterSuite.priority);
    }
}
