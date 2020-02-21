package com.denny.designpattern.thread;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2019/6/13 10:57
 * @Version: 1.0
 */
public class Mythread implements Runnable {
  @Override
  public void run() {
    System.out.println(LocalDateTime.now()+"-------->");

  }
}
