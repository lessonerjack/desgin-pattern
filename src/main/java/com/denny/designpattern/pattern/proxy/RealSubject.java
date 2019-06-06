package com.denny.designpattern.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:真实处理类
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 15:55
 * @Version: 1.0
 */
@Slf4j
public class RealSubject implements Subject {
  @Override
  public void request() {
    log.info("This is real subject");
  }
}
