package pft32.addressbook.model;

import java.io.File;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String contactAddress;
    private final String contactMob;
    private final String contactEmail;
    private String group;
    private File photo;

    public ContactData(String firstName, String lastName, String companyName, String contactAddress, String contactMob, String contactEmail, String group, File photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.contactAddress = contactAddress;
        this.contactMob = contactMob;
        this.contactEmail = contactEmail;
        this.group = group;
        this.photo = photo;
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

    public void setGroup(String group) {
        this.group = group;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
}
