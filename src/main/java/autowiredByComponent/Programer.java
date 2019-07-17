package autowiredByComponent;

import org.springframework.stereotype.Component;

@Component
public class Programer implements People{
    public void dinner() {
        System.out.println("programer begin eat dinner");
    }

    public void printCount() {

    }
}
