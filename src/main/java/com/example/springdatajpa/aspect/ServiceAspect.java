/*package com.example.springdatajpa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
	
	@Before(value = "execution(* com.example.springdatajpa.services.EmployeeServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint joinpoint){
		System.out.println("Before method for services  : " + joinpoint.getSignature());
	}
	@After(value = "execution(* com.example.springdatajpa.services.EmployeeServiceImpl.*(..))")
	public void AfterAdvice(JoinPoint joinpoint){
		System.out.println("After advise  method:   " + joinpoint.getSignature());
	}
	@Before(value = "execution(* com.example.springdatajpa.controller.*.*(..))")
	public void beforeAdviceController(JoinPoint joinpoint){
		System.out.println("Before method for controllers  :  " + joinpoint.getSignature());
	}
	
	@Around(value = "execution(* com.example.springdatajpa.services.EmployeeServiceImpl.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable 
    {
        System.out.println( joinPoint.getSignature().getName() + "  : Before Around Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println( joinPoint.getSignature().getName() + "  : After Around Method Execution");
    }


}
*/