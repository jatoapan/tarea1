package ec.edu.espol;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* Reader.readBook(..))")
    public void logBefore() {
        System.out.println("[Logging] Comenzando la lectura del libro...");
    }

    @After("execution(* Reader.readBook(..))")
    public void logAfter() {
        System.out.println("[Logging] Lectura del libro completada.");
    }
    
}
