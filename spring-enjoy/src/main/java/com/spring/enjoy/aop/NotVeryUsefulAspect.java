package com.spring.enjoy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

	@Pointcut("execution(* com.spring.enjoy.service.JdkProxyService.*(..))")
	private void anyOldTransfer() {}

	@Before("anyOldTransfer()")
	public void doAccessCheck(){
		System.out.println("====before====");
	}

	@Pointcut("execution(* com.spring.enjoy.service.AopService.test2())")
	private void returnValTransfer(){}

	/**
	 * 接受返回值
	 * @param re
	 */
	@AfterReturning(
			pointcut = "returnValTransfer()",
			returning = "re"
	)
	public void doReturnCheck(Object re){
		System.out.println("====AfterReturning====value===="+re.toString());
	}

	@Pointcut("execution(* com.spring.enjoy.service.AopService.test3())")
	private void throwExTransfer(){}

	@AfterThrowing(
			pointcut = "throwExTransfer()",
			throwing = "ex"
	)
	public void doThrowCheck(Exception ex){
		System.out.println("====afterThrow====value==="+ex.getMessage());
	}

	/**
	 * 小坑：
	 * 注意execution(* com.spring.enjoy.service.AopService.test4(..))中test4（..）两个点加上，
	 * 因为可以确保在有参数的情况下也能实现aop
	 */
	@Pointcut("execution(* com.spring.enjoy.service.AopService.test4(..))")
	private void aroundTransfer(){}

	@Around("aroundTransfer()")
	public Object doAroundCheck(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("====around advice====");
		Object target = pjp.getTarget();
		System.out.println(target);

		Object[] args = pjp.getArgs();

		return pjp.proceed();
	}

	/**
	 * 扩展类的方法（新增业务方法）
	 * 通过实先接口
	 * 注明接口实现类
	 * 以及增强类
	 */
	@DeclareParents(value = "com.spring.enjoy.service.AopService",defaultImpl = DefaultUsageTracked.class)
	public static UsageTracked mixin;

	@Before("execution(* com.spring.enjoy.service.AopService.test5()) && this(usageTracked)")
	public void doMixin(UsageTracked usageTracked){
		usageTracked.adviceAddFunc();
	}
}
