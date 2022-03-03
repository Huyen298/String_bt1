public class Test {
    public static Name name;
    public static final String[] nameList = new String[]{"C1221H","C1121I","c08","C1021K","c09h","P0323A"};

    public static void main(String[] args) {
        name = new Name();
        for (String n1:nameList
             ) {
            boolean isValue = name.validate(n1);
            System.out.println("Name is "+ n1+ " is: " +isValue);

        }
    }
}
