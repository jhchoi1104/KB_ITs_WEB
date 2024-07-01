package org.scoula.lib.cli;

import org.scoula.lib.cli.command.AnalizeCommand;
import org.scoula.lib.cli.command.GetScoresCommand;
import org.scoula.lib.cli.command.InitScoresCommand;
import org.scoula.lib.cli.command.PrintScoreCommand;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;

import javax.naming.InitialContext;

public class MyApp extends App {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);
        menu.add(new MenuItem("학생수",new InitScoresCommand()));
        menu.add(new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(new MenuItem("분석", new AnalizeCommand()));
    }
    public static void main(final String[] args) {
        App app = new MyApp();
        app.run();
    }
}
