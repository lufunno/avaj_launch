package Simulator;

import weather.*;
import java.io.*;
import Aircraft.*;

public class WriteFile {
    public static void	writeToFile(String str) {
        try
        {
            File file = new File("Simulation.txt");


            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.append("\n");
            writer.append(str);
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }

    }
}
