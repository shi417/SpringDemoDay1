package springAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CookProxy {
    @Around("execution(* springAop.Cook.startCook(..))")
    public void brushPot(ProceedingJoinPoint  pj){
        try {
            System.out.println("start brush pot !");
            pj.proceed();
            System.out.println("start brush pot !");
        }catch (Throwable e){
            System.out.println(e);
        }
    }
}
