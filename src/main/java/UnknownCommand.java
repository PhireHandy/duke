public class UnknownCommand extends Command {
    public UnknownCommand() {

    }

    public void execute(TaskList tl, Storage st) {
        System.err.println(new UnknownCommandException());
    }
}
