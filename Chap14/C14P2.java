/*
 * Pr 14.1
 */

import java.io.*;

public class C14P2 {
    public static void main(String[] args) throws IOException {
        int number = IBIO.inputInt("Enter number to be entered into file: ");
        File read = new File("sort");
        File insert = new File("Pr14.2");

        FileReader fr = new FileReader(read);
        BufferedReader load = new BufferedReader(fr);

        FileWriter fw = new FileWriter(insert);
        PrintWriter save = new PrintWriter(fw);

        while (load.ready()) {
            String line = load.readLine();
            int num = Integer.parseInt(line);
            // if (condition)
                save.println(number);
            save.println(num);
        }

        save.close();
        load.close();
    }
}
