package org.itstep.command;

import java.io.File;
import java.util.Set;

public class Cd implements Command{
    @Override
    public void execute(Way way, Set set, String... arg) {
        if (arg[0].equals("")){
            System.out.println("Дополнительный аргумент отсутствует");
        }else {
            File file = new File(arg[0]);
            if (file.isDirectory()){
                way.setWay(file.getAbsolutePath());
            }else {
                file = new File(way.getWay() + "\\" + arg[0]);
                if (file.isDirectory()){
                    way.setWay(file.getAbsolutePath());
                }else {
                    System.out.println("Не является путем к директории");
                }
            }
        }
    }
}
