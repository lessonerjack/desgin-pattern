package com.denny.designpattern.pattern.signleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 15:12
 * @Version: 1.0
 */
@Slf4j
public class Monitor {
  private static volatile Monitor monitor = null;
  private Monitor(){
    log.info("选举出一个班长");
  }
  public static Monitor getInstance(){
    if (monitor == null){
      monitor = new Monitor();
    }else {
      log.info("已经有monitor了");
    }
    return monitor;
  }

  public void getName(){
    log.info("我是史金班长");
  }

}
