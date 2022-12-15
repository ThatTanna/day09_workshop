import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int port = 3000;
        String directory = "static";
        List<String> list = new LinkedList<>();
        String line;
        list.addAll(Arrays.asList(args));
        System.out.println(list);

        if (args.length == 2) {
            if (args[0].equalsIgnoreCase("--port")) {
                port = Integer.parseInt(args[1]);
            }
            if (args[0].equalsIgnoreCase("docRoot")) {
                directory = args[1];
            }
        } else if (args.length == 4) {
            if (("--port")) {
                port = Integer.parseInt(args[1]);
            }
        }
    }
}