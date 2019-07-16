package autowiredByComponent;

import org.springframework.stereotype.Component;

@Component
public class Student implements People{
    public void dinner() {
        System.out.println("student begin eat dinner");
    }
}
