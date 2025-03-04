
class PhoneDirectory {
    private String firstName;
    private String phoneNumber;

   
    public PhoneDirectory(String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

  
    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

   
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void displayContact() {
        System.out.println("Name: " + firstName + ", Phone Number: " + phoneNumber);
    }
}