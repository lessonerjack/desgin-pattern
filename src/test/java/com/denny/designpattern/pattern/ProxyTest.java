package com.denny.designpattern.pattern;

import com.denny.designpattern.pattern.proxy.*;
import org.junit.Test;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 16:01
 * @Version: 1.0
 */
public class ProxyTest {
  @Test
  public void testProxy() {
    Subject proxy = new ProxySubject();
    proxy.request();
  }

  @Test
  public void testJdkProxy() {
    Subject subject = (Subject)new DynamicProxy().getTargetProxy(new RealSubject());
    subject.request();
  }

  @Test
  public void testCglibProxy(){
    Subject targetObject = (Subject)new DynamicCglibProxy().getTargetObject(new RealSubject());
    targetObject.request();
  }

}
