public class File {
    
    // state
    public String name;
    public String text;

    // constructors
    public File(String name, String text) {
        this.name = name;
        this.text = text;
    }

    // behavior
    public void readFrom() throws FileAccessException {
        if (text != null) {
            System.out.println(text);
        } else {
            throw new FileAccessException();
        }
    }
}
