package behaviour.command.implementation;

public class LogSaveCommand implements Command{
    private final LogBuffer buffer;
    public LogSaveCommand(LogBuffer buffer){
        this.buffer = buffer;
    }
    @Override
    public CommandResult execute() {
        LogHandler.save(buffer.getBuffer());
        return CommandResult.SUCCESS;
    }
}
