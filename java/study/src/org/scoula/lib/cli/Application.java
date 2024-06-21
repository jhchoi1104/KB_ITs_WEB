package org.scoula.lib.cli;

import org.scoula.lib.cli.ui.Menu;

public abstract class Application {
    Menu menu;
    public abstract void createMenu(Menu menu);

    public void init() {
        System.out.println("어플리케이션을 초기화합니다.");
        menu = new Menu(6);
        createMenu(menu);
    }

    public void run() {
        init();
        while (true) {

        }
    }

}
