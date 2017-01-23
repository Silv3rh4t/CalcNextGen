package fileDat;

import java.io.*;
public class Writer
{

    static File output = new File("output.txt");

    public static void main() throws IOException
    {
        print("Print this");
        print("And save this");
    }

    public static void print(String str) throws IOException
    {
        System.out.println(str);
        writeToFile(output, str);
    }

    public static void writeToFile(File file, String str) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        bw.write(str);
        bw.close();
    }
}