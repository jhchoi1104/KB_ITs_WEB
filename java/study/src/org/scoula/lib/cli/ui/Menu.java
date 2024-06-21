package org.scoula.lib.cli.ui;

public class Menu {
    private MenuItem list[];

    public Menu(int size) {
        list = new MenuItem[size];
    }

    public void add(int ix, MenuItem item) {
        list[ix] = item;
    }

    public void print() {
        for (int i = 0; i<list.length; i++) {
            System.out.printf("%d]%s ", (i+1), list[i].getTitle() );
        }
        System.out.println();
    }

    public MenuItem select() {
        int i = Input.getInt("선택> ") -1;

        if (i<list.length) {
            return list[i];
        }
        return null;
    }
}
