package com.denny.designpattern.lambda;

/**
 * @Description:
 * @Author: denny.wang
 * @Email wtz@winning.com.cn
 * @CreateDate: 2020/2/14 16:18
 * @Version: 1.0
 */
public class LambdaMain {
  public static void main(String args[]) {
    LambdaMain tester = new LambdaMain();
    // 类型声明
    MathOperation addition = (int a, int b) -> a + b;
    // 不用类型声明
    MathOperation subtraction = (a, b) -> a - b;
    // 大括号中的返回语句
    MathOperation multiplication = (int a, int b) -> {
      return a * b;
    };
    // 没有大括号及返回语句
    MathOperation division = (int a, int b) -> a / b;
    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
    System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + tester.operate(10, 5, division));
    // 不用括号
    GreetingService greetService1 = message ->
            System.out.println("Hello " + message);
    // 用括号
    GreetingService greetService2 = (message) ->
            System.out.println("Hello " + message);
    greetService1.sayMessage("Runoob");
    greetService2.sayMessage("Google");
/*    UserServer userServer = user -> System.out.println(user);
    UserServer userServer1 = (user) -> {
      System.out.println(user);
      System.out.println(user.substring(0,3));

    };*/
    UserServer userServer2 = user -> System.out.println("88879879"+user);
/*    userServer.user("user");
    userServer1.user("user");*/
    userServer2.user("user");
  }
  interface MathOperation {
    int operation(int a, int b);
  }
  interface GreetingService {
    void sayMessage(String message);
  }
  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
  interface UserServer{
    void user(String user);
  }
}
