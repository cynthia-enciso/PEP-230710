package d_objectclass;

public class Cat extends Animal {
    
    // state
    private int whiskerLength;

    public Cat() {
        // super();
        System.out.println("I am a cat!");
    }

    // getters and setters
    public int getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(int whiskerLength) {
        this.whiskerLength = whiskerLength;
    }

    @Override
    public String toString() {
        return "Cat [whiskerLength = " + whiskerLength + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + whiskerLength;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (!super.equals(obj)) {
            return false;
        }
        if (whiskerLength != other.whiskerLength)
            return false;
        return true;
    }

    
}
