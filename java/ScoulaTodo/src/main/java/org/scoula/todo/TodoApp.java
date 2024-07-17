package org.scoula.todo;

import org.scoula.lib.cli.ui.Input;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;
import org.scoula.todo.context.Context;
import org.scoula.todo.exception.LoginFailException;
import org.scoula.todo.service.AccountService;
import org.scoula.todo.service.LoginService;

import java.sql.SQLException;

public class TodoApp extends App{
    Menu userMenu;
    Menu anonymousMenu;
    AccountService accountService = new AccountService();
    LoginService loginService = new LoginService();

    @Override
    public void init() {
        anonymousMenu = new Menu();
        anonymousMenu.add(new MenuItem("로그인",this::login));
        anonymousMenu.add(new MenuItem("가입",accountService::join));
        anonymousMenu.add(new MenuItem("종료",this::exit));

        userMenu = new Menu();
        userMenu.add(new MenuItem("목록",null));
        userMenu.add(new MenuItem("검색",null));
        userMenu.add(new MenuItem("상세",null));
        userMenu.add(new MenuItem("추가",null));
        userMenu.add(new MenuItem("수정",null));
        userMenu.add(new MenuItem("삭제",null));


        userMenu.add(new MenuItem("로그아웃",this::logout));
        userMenu.add(new MenuItem("종료",this::exit));

        setMenu(anonymousMenu);
    }
    public void login() {
        try {
            loginService.login();
            setMenu(userMenu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
        }
    }
    public void logout() {
        if(Input.confirm("로그아웃 할까요?")) {
            Context.getContext().setUser(null);
            setMenu(anonymousMenu);
        }
    }
    // exit 미지정

    public static void main(final String[] args) {
        final TodoApp app = new TodoApp();
        app.run();
    }

}
