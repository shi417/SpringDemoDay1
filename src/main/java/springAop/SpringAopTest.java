package springAop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/Demo.xml");
        Cook scrambledEggs = (Cook) context.getBean("scrambledEggs");
        scrambledEggs.startCook();
    }
}
