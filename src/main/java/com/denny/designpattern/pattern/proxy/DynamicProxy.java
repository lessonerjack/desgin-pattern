package com.denny.designpattern.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 16:57
 * @Version: 1.0
 */
public class DynamicProxy implements InvocationHandler {
  //被代理对象
  Object targetProxy;
  public Object getTargetProxy(Object proxy){
    this.targetProxy = proxy;
    return Proxy.newProxyInstance(targetProxy.getClass().getClassLoader(),targetProxy.getClass().getInterfaces(),this);
  }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object invoke = method.invoke(targetProxy, args);
    return invoke;
  }
}
