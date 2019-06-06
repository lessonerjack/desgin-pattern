package com.denny.designpattern.pattern;

import com.denny.designpattern.pattern.signleton.Monitor;
import com.denny.designpattern.pattern.signleton.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/6 15:01
 * @Version: 1.0
 */
@Slf4j
public class SingletonTest {
  @Test
  public void testSingleTest(){
    Singleton instance1 = Singleton.getInstance();
    instance1.say();
    Singleton instance = Singleton.getInstance();
    instance.say();
    if (instance == instance1){
      log.info("他们是同一个东东");
    }else {
      log.info("他们不是同一个东东");
    }

  }

  @Test
  public void testMonitor(){
    Monitor monitor_1 = Monitor.getInstance();
    Monitor instance = Monitor.getInstance();
    monitor_1.getName();
    instance.getName();
    if (monitor_1 == instance){
      log.info("equal");
    }
  }
}
