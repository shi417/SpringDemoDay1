package autowiredByXml;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/Demo.xml");
        Computer pc = (Computer) context.getBean("dellPc");
        pc.cpuRun();
    }
}
