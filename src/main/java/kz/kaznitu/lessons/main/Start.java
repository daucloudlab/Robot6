package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Robot;
import kz.kaznitu.lessons.interfaces.RobotConveyer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml") ;

//        Robot terminator1 = (ModelT1000)context.getBean("t1000") ;
//        terminator1.action();
//        terminator1.dance();

        RobotConveyer robotConveyer = (RobotConveyer)context.getBean("t100Conveyer") ;
        Robot terminator1 = robotConveyer.createRobot() ;
        Robot terminator2 = robotConveyer.createRobot() ;
        Robot terminator3 = robotConveyer.createRobot() ;


    }
}
