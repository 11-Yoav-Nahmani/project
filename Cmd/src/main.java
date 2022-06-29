import java.io.IOException;

public class main {
    public static void main(String[]args) throws IOException {

        CommandExecutorImpl r = new CommandExecutorImpl();

        r.runCommand("del barbi.txt");

    }
}
