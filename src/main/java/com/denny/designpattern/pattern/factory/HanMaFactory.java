package com.denny.designpattern.pattern.factory;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/20 9:43
 * @Version: 1.0
 */
public class HanMaFactory implements AbstractFactory {
  @Override
  public CarFactory createCar() {
    System.out.println("hanma create;");
    return new HanMaCar();
  }
}
