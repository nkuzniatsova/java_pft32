package pft32.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String contactAddress;
    private final String contactMob;
    private final String contactEmail;
    private String group;

    public ContactData(String firstName, String lastName, String companyName, String contactAddress, String contactMob, String contactEmail, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.contactAddress = contactAddress;
        this.contactMob = contactMob;
        this.contactEmail = contactEmail;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}
