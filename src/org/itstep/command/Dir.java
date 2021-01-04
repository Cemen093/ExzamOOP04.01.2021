package org.itstep.command;

import java.io.File;
import java.util.Set;

public class Dir implements Command{
    @Override
    public void execute(Way way, Set set, String... arg) {

        if (arg[0].equals("")) {
            File dir = new File(way.getWay());
            for (File f : dir.listFiles()) {
                System.out.println(f.getName());
            }
        }else {
            File dir = new File(arg[0]);
            if (dir.isDirectory()) {
                for (File f : dir.listFiles()) {
                    System.out.println(f.getName());
                }
            }else {
                System.out.println("Не является директорией");
            }
        }
    }
}
