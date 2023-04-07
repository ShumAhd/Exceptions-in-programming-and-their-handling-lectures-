package Lesson_1ErrorHandlingInProgramming;

import java.io.File;

public class AppLication {

  /**
   * Функция для возврата размера файла
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(getFileSize(new File("123")));

  }
  //long-так обозначается размер файла, в функцию передаём объект файл (File file)
  public static long getFileSize(File file){
    //по умолчанию у файла уже есть информация о размере length
    return file.length();
  }
}