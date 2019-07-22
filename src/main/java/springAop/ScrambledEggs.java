package springAop;

import org.springframework.stereotype.Component;

@Component
public class ScrambledEggs implements Cook{

    public void startCook() {
        System.out.println("start scrambled eggs!");
    }
}
