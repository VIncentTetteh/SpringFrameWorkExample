package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Nurse nurse = context.getBean(Nurse.class);
        Docter docter = context.getBean(Docter.class);
        docter.assist();
        docter.setQualification("PHD");
        System.out.println(docter);

        Docter docter1 = context.getBean(Docter.class);
        System.out.println(docter1);

    }
}
