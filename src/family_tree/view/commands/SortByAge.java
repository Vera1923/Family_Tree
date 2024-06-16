package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class SortByAge extends Command{
    public SortByAge(ConsoleUI consoleUI) {
        super("Сортировка по возрасту", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().sortByAge();
    }
}
