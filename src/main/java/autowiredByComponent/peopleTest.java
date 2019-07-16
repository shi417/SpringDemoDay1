package autowiredByComponent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PeopleConfig.class)
public class peopleTest {

    /**
     * 基于注解的方式注入
     */
    @Autowired
    private People programer;
    @Autowired
    private PeopleFactory pf;

    @Test
    public void peopleAction(){
        System.out.println("programer start");
        pf.getProgramer().dinner();
        System.out.println("p1 start");
        pf.getP1().dinner();
        System.out.println("p2 start");
        pf.getP2().dinner();
    }
}
