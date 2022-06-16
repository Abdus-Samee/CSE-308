package Problem1;

public class FileFilter implements FileReader{
    FileAdapter fileAdapter;

    @Override
    public void read(String file, String delim) {
        if(delim.equals(" ")) CalculateSum.getSumWSDelim(file);
        else if(delim.equals("~")){
            fileAdapter = new FileAdapter(delim);
            fileAdapter.read(file, delim);
        }else System.out.println("Invalid delimiter for file; not supported");
    }
}
