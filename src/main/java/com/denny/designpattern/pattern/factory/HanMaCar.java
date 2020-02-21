package com.denny.designpattern.pattern.factory;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/20 9:44
 * @Version: 1.0
 */
public class HanMaCar implements CarFactory {
  @Override
  public void show() {
    System.out.println("this is hanma");
  }
}
