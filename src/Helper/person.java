package Helper;

public abstract class person implements Comparable<person> {

    private String firstName;                   //First name of person
    private String lastName;                    //Last name of person
    private String emailID;                     //EmailId of person
    private StringBuffer phoneNumbers;          //Phone numbers of person

    //Getter for first name
    public String getFirstName() {
        return firstName;
    }
}

