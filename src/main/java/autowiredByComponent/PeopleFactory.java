package autowiredByComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PeopleFactory {
    /**
     * 基于注解的方式注入
     */
    @Autowired
    private People programer;

    /**
     * 基于构造函数注入
     */
    private People p1;
    @Autowired
    public PeopleFactory(People p){
        this.p1 = p;
    }

    /**
     * 基于setter方法的注入
     */
    private People p2;
    @Autowired
    public void setPeople(People p){
        this.p2 = p;
    }

    public People getProgramer() {
        return programer;
    }

    public People getP1() {
        return p1;
    }

    public People getP2() {
        return p2;
    }
}
