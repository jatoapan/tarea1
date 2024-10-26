package Singleton_AOP; //Singleton_AOP\LogginAspect.java

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogginAspect {

	@Pointcut("execution(* ec.edu.espol.Singleton_OOP.Configuracion.getConfiguracion(..))")
	public void getConfiguracionPointcut() {}

	@Pointcut("execution(* ec.edu.espol.Singleton_OOP.Configuracion.setConfiguracion(..))")
	public void setConfiguracionPointcut() {}

	@Before("getConfiguracionPointcut()")
	public void logBeforeGetConfig(JoinPoint joinPoint){
		System.out.println("Accediendo configuracion...");
	}

	@After("setConfiguracionPointcut()")
	public void logAfterSetConfig(JoinPoint joinPoint){
		System.out.println("Configuracion ha sido actualizada");
	}

}
