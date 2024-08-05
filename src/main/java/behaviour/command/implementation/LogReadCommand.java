package behaviour.command.implementation;

public class LogReadCommand implements Command{
    @Override
    public CommandResult execute() {
        LogHandler.read();
        return CommandResult.SUCCESS;
    }
}
