package CLI_Framework;

import CLI_Framework.command.*;
import CLI_Framework.ui.Menu;
import CLI_Framework.ui.MenuItem;

public class MyApp extends App{
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(new MenuItem("학생수", new InitScoresCommand()));
        menu.add(new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(new MenuItem("분석", new AnalizeCommand()));
        menu.add(new MenuItem("종료", new ExitCommand()));
    }

    public static void main(final String[] args) {
        App app = new MyApp();
        app.run();
    }
}
