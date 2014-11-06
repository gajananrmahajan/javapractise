package org.javatutorials.logging;

import java.util.logging.Logger;

public class MyLogs {

   private static Logger myLogger = Logger.getLogger(MyLogs.class.getName());
   
   public static void main(String[] args) {
    MyLogs logs = new MyLogs("Hello World!");
    logs.sayHello();
  }

   private String message;
   
   public MyLogs(String message){
     this.message = message;
   }
   
  private void sayHello() {
    myLogger.severe("Hello Logging!!!");
    System.out.println(this.message);
  }

}
