package Problem1;

import java.io.File;

public class FileFilter implements FileReader{
    FileAdapter fileAdapter;

    @Override
    public void read(String file, String delim) {
        if(delim.equals(" ")){
            File input = new File(file);
            CalculateSum.getSumWSDelim(input);
        }
        else if(delim.equals("~")){
            fileAdapter = new FileAdapter(delim);
            fileAdapter.read(file, delim);
        }else System.out.println("Invalid delimiter for file; not supported");
    }
}
