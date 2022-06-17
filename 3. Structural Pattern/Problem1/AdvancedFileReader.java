package Problem1;

import java.io.*;
import java.io.FileReader;

public interface AdvancedFileReader {
    public void fileDelimTilde(String file);
}

class DelimiterTilde implements AdvancedFileReader{

    @Override
    public void fileDelimTilde(String file) {
        File temp = null;

        try{
            temp = File.createTempFile("temporary", "txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String in = reader.readLine();
            in = in.replaceAll("~", " ");

            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
            writer.write(in);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        CalculateSum.getSumWSDelim(temp);
    }
}
