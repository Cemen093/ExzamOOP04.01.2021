package org.itstep.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

public class Cat implements Command{
    @Override
    public void execute(Way way, Set set, String... arg) {
        if (!arg[0].equals("")) {
            File file = new File(arg[0]);
            if (file.isFile()) {
                Scanner scanner = null;
                try {
                    scanner = new Scanner(new File(arg[0]));
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден");
                }
            } else {
                System.out.println("Файл не найден или не является файлом");
            }
        }else {
            System.out.println("Дополнительный аргумент отсутствует");
        }
    }
}
