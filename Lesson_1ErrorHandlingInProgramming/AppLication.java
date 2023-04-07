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
    //добавим обработчик ошибки, если файл не существует
    if (!file.exists()) {
      return -1L;
    }
    return file.length();
    //по умолчанию у файла уже есть информация о размере length
  }
}