package com.denny.designpattern.pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 17:21
 * @Version: 1.0
 */
public class DynamicCglibProxy implements MethodInterceptor {

  private Object proxyTarget;

  public Object getTargetObject(Object proxy) {
    this.proxyTarget = proxy;
    Enhancer enhancer = new Enhancer();
    enhancer.setCallback(this);
    enhancer.setSuperclass(this.proxyTarget.getClass());
    return enhancer.create();
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
    return method.invoke(this.proxyTarget,objects);
  }
}
