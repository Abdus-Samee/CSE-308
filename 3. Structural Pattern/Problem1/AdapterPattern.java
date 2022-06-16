package Problem1;

public class AdapterPattern {
    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter();

        //fileFilter.read("input.txt", " ");
        fileFilter.read("src/Problem1/input.txt", "~");
    }
}
