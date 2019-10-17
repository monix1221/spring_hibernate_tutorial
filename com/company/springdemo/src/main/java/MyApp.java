package main.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    private static final String CONTEXT_CONFIG_PATH = "applicationContext.xml";
    private static final String BEAN_ID = "myCoach";

    public static void main(String[] args) {

        // 1. Create Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONTEXT_CONFIG_PATH);

        // 2. Retrieve Bean from the Container
        Coach myCoach = context.getBean(BEAN_ID, Coach.class); // bean id + INTERFACE (!) name

        // 3. Call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        // 4. Close the context
        context.close();

    }

}
