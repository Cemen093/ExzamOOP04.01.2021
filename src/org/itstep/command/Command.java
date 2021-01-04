package org.itstep.command;

import java.util.Set;

public interface Command {
    void execute(Way way, Set set, String... arg);
}
