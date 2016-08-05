package com.psl.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LibraryAOP {
  @Pointcut("execution(* insertBook(..))")
  void base()
  {
	  
  }
  @Before("base()")
  public void before(){
	  System.out.println("before");
	  
  }
  @After("base()")
  public void after(){
	  System.out.println("after");
  }
}
