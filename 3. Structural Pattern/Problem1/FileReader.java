package Problem1;

public interface FileReader {
    public void read(String file, String delim);
}

class FileAdapter implements FileReader{
    AdvancedFileReader advancedFileReader;

    public FileAdapter(String delim){
        if(delim.equals("~")) advancedFileReader = new DelimiterTilde();
    }

    @Override
    public void read(String file, String delim) {
        if(delim.equals("~")) advancedFileReader.fileDelimTilde(file);
    }
}
