package autowiredByComponent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student implements People{
    private int count=0;

    public void dinner() {
        System.out.println("student begin eat dinner");
    }

    public void printCount(){
        System.out.println("-------"+count++);
    }
}
