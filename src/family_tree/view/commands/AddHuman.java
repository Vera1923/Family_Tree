package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class AddHuman extends Command{
    public AddHuman(ConsoleUI consoleUI) {
        super("Добавить человека", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().addHuman();
    }
}
