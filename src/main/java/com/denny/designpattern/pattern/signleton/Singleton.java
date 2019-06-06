package com.denny.designpattern.pattern.signleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:单例模式
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 14:54
 * @Version: 1.0
 */
@Slf4j
public class Singleton {
  private static Singleton instance = new Singleton();
  private Singleton(){}
  public static Singleton getInstance(){
    return instance;
  }

  public void say(){
    log.info("This is singleton");
  }

}
