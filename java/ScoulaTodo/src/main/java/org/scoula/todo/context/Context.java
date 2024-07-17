package org.scoula.todo.context;

import lombok.Getter;
import lombok.Setter;
import org.scoula.todo.domain.UserV0;

import java.sql.Connection;

@Getter
@Setter
public class Context {
    private UserV0 user;

    private Context() {
    }

    private static Context context = new Context();

    public static Context getContext() {
        return context;
    }
}
