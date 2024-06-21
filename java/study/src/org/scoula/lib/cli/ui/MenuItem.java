package org.scoula.lib.cli.ui;

import org.scoula.lib.cli.command.Command;

public class MenuItem {
    private String title;
    private Command cmd;

    public void MenuItem(String title, Command cmd) {
        this.title = title;
        this.cmd = cmd;
    }

    public String getTitle() {
        return title;
    }

    public void execute() {
        if (cmd != null) {
            cmd.execute();
        }
    }
}
