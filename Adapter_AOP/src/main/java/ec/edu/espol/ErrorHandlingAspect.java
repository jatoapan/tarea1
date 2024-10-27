package ec.edu.espol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ErrorHandlingAspect {

    @Around("execution(* Client.displayText(..)) || execution(* Reader.readBook(..))")
    public void handleErrors(ProceedingJoinPoint joinPoint) {
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            System.err.println("Error en " + joinPoint.getSignature().getName() + ": " + e.getMessage());
        }
    }

}
