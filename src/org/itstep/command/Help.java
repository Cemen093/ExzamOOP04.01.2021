package org.itstep.command;

import java.util.Set;

public class Help implements Command{
    @Override
    public void execute(Way way, Set set, String... arg) {
        System.out.println(set);
    }
}
