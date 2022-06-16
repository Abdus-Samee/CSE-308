package Problem1;

import java.io.BufferedReader;
import java.io.FileReader;

public interface AdvancedFileReader {
    public void fileDelimTilde(String file);
}

class DelimiterTilde implements AdvancedFileReader{

    @Override
    public void fileDelimTilde(String file) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String in = reader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }

        CalculateSum.getSum(file, "~");
    }
}
