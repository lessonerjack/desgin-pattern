package com.denny.designpattern.pattern;

import com.denny.designpattern.pattern.factory.AbstractFactory;
import com.denny.designpattern.pattern.factory.BTWFactory;
import com.denny.designpattern.pattern.factory.CarFactory;
import com.denny.designpattern.pattern.factory.HanMaFactory;
import org.junit.Test;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/20 9:48
 * @Version: 1.0
 */
public class FactoryTest {
  @Test
  public void testFactory(){
    AbstractFactory factory = new BTWFactory();
    CarFactory car = factory.createCar();
    car.show();

    HanMaFactory hanMaFactory = new HanMaFactory();
    CarFactory car1 = hanMaFactory.createCar();
    car1.show();
  }
}
