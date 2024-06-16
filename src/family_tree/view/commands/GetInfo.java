package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class GetInfo extends Command{
    public GetInfo(ConsoleUI consoleUI) {
        super("Получить информацию о дереве", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().getInfo();
    }
}
