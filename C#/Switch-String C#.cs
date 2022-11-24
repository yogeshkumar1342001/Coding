using System;
class HelloWorld {
  static void Main() {
      string day="sunday";
      day=Console.ReadLine();
      switch(day){
          case "sunday":
          Console.WriteLine("it is holiday");
          break;
          default:
          Console.WriteLine("it is working day");
          break;
      }
  }
}