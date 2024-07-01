package org.scoula.lib.cli.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.scoula.lib.cli.command.Command;

@AllArgsConstructor
@Data

public class MenuItem {
    String title;
    Command command;
}
