package org.scoula.todo.service;

import org.scoula.lib.cli.ui.Input;
import org.scoula.todo.dao.UserDao;
import org.scoula.todo.dao.UserDaoImpl;
import org.scoula.todo.domain.UserV0;
import org.scoula.todo.exception.PasswordMissmatchException;
import org.scoula.todo.exception.UsernameDuplicateException;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.SQLException;
import java.util.Optional;

public class AccountService {
    UserDao dao = new UserDaoImpl();

    public void join() {
        try {
            UserV0 user = getUser();
            dao.create(user);
        } catch (UsernameDuplicateException | PasswordMissmatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public boolean checkDuplication(String username) throws UsernameDuplicateException, SQLException {
        Optional<UserV0> result = dao.get(username);
        if(result.isPresent()) {
            throw new UsernameDuplicateException();
        }
        return false;
    }
    private UserV0 getUser() throws SQLException, UsernameDuplicateException, PasswordMissmatchException {
        String username = Input.getLine("사용자 ID:");
        checkDuplication(username);

        String password = Input.getLine("비밀번호: ");
        String password2 = Input.getLine("비밀번호 확인: ");
        if(!password.equals(password2)) {
            throw new PasswordMissmatchException();
        }
        String name=Input.getLine("이름: ");
        String role=Input.getLine("역할: ");

        return UserV0.builder()
                .id(username)
                .password(password)
                .name(name)
                .role(role)
                .build();
    }
}
