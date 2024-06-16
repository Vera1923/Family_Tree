package family_tree.view.commands;

import family_tree.view.ConsoleUI;

import java.io.IOException;

public class Save extends Command{
    public Save(ConsoleUI consoleUI) {
        super("Сохранить в файл", consoleUI);
    }

    @Override
    public void execute() throws IOException {
        super.getConsoleUI().save();
    }
}
