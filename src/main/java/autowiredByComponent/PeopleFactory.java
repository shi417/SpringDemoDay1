package autowiredByComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PeopleFactory {
    /**
     * 基于注解的方式注入
     */
    @Autowired
    private People student;


    @PostConstruct
    private  void print(){
        System.out.println("PostConstruct");
        student.printCount();
    }
    /**
     * 基于构造函数注入
     */
    private People p1;
    @Autowired
    public PeopleFactory(People student){

        this.p1 = student;
    }

    /**
     * 基于setter方法的注入
     */
    private People p2;
    @Autowired
    public void setPeople(People programer){
        this.p2 = programer;
    }

    public People getProgramer() {
        return student;
    }

    public People getP1() {
        return p1;
    }

    public People getP2() {
        return p2;
    }
}
