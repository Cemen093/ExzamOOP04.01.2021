package org.itstep;

import org.itstep.command.*;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final String EXIT = "exit";
    public static final String DIR = "dir";
    public static final String CAT = "cat";
    public static final String PWD = "pwd";
    public static final String CD = "cd";
    public static final String HELP = "help";

    public static void main(String[] args) {
        Way way = new Way((new File("")).getAbsolutePath());
        HashMap<String, Command> com = new HashMap<>(){
            @Override
            public Command get(Object key) {
                Command com = super.get(key);
                return com != null ? com : new NotACommand();
            }
        };
        com.put(EXIT, new Exit());
        com.put(DIR, new Dir());
        com.put(CAT, new Cat());
        com.put(PWD, new Pwd());
        com.put(CD, new Cd());
        com.put(HELP, new Help());

        Scanner scanner = new Scanner(System.in);

        while (true){
            //System.out.println(way.getWay());
            //System.out.println("Доступные команды");
            //System.out.println(com.keySet());
            System.out.print("> ");
            com.get(scanner.next().toLowerCase()).execute(way, com.keySet(), scanner.nextLine().trim());
        }
    }
}
