package behaviour.command;

import behaviour.command.implementation.Command;
import behaviour.command.implementation.LogBuffer;
import behaviour.command.implementation.LogReadCommand;
import behaviour.command.implementation.LogSaveCommand;

public class CommandLauncher {
    public static void main(String[] args) {
        LogBuffer buffer = new LogBuffer();
        Command logSaveCommand = new LogSaveCommand(buffer);
        Command logReadCommand = new LogReadCommand();

        buffer.setBuffer("Some useful log!");
        logSaveCommand.execute();
        buffer.setBuffer("Some another useful log!");
        logSaveCommand.execute();
        logReadCommand.execute();
    }
}
