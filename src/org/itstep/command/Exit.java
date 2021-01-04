package org.itstep.command;

import java.util.Set;

public class Exit implements Command{
    @Override
    public void execute(Way way, Set set, String... arg) {
        System.exit(0);
    }
}
