package Lesson_1ErrorHandlingInProgramming;

import java.io.File;
import java.util.Arrays;

public class AppLication {

  /**
   * Функция для возврата размера файла
   *
   * @param args
   */
  public static void main(String[] args) {
    //System.out.println(getFileSize(new File("/О_IT/Project/java/Исключения в программировании и их обработка (лекции)/Exceptions-in-programming-and-their-handling-lectures-/README.md")));

    System.out.println(getFileSize(new File
        ("/О_IT/Project/java"
            + "/Исключения в программировании и их обработка (лекции)"
            + "/Exceptions-in-programming-and-their-handling-lectures-"
            + "/Lesson_1ErrorHandlingInProgramming/TestFile")));
    System.out.println(divide(10, 0));
  }

  //функция деления на ноль
  public static int divide(int a, int b) {
    //обработчик ошибки деления на ноль
    if (b == 0) {
      return  -1;
    }
    return a / b;
  }

  //long-так обозначается размер файла, в функцию передаём объект файл (File file)
  public static long getFileSize(File file) {
    //добавим обработчик ошибки, если файл не существует
    if (!file.exists()) {
      return -1L;
    }
    return file.length();
    //по умолчанию у файла уже есть информация о размере length
  }
}