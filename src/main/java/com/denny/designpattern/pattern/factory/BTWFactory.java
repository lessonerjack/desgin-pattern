package com.denny.designpattern.pattern.factory;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/20 9:40
 * @Version: 1.0
 */
public class BTWFactory implements AbstractFactory {
  @Override
  public CarFactory createCar() {
    System.out.println("宝马出厂");
    return new BTWCar();
  }
}
