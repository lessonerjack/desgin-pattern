package com.denny.designpattern.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:代理处理类
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 15:56
 * @Version: 1.0
 */
@Slf4j
public class ProxySubject implements Subject{
  private RealSubject realSubject;

  public void request(){
    if (realSubject == null){
      realSubject = new RealSubject();
    }
    //预处理
    preRequest();
    realSubject.request();
    postRequest();
  }

  private void postRequest() {
    log.info("真实主题的后处理");
  }

  private void preRequest() {
    log.info("真实主题的预处理");
  }

}
