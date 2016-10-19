package pft32.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String contactAddress;
    private final String contactMob;
    private final String contactEmail;

    public ContactData(String firstName, String lastName, String companyName, String contactAddress, String contactMob, String contactEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.contactAddress = contactAddress;
        this.contactMob = contactMob;
        this.contactEmail = contactEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactMob() {
        return contactMob;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
