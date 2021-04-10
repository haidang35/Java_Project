package pratical.adf2;

public class Passenger implements Comparable<Passenger>{
    public Integer id;
    public String name;
    public String address;
    public String phoneNumber;
    public String goDate;
    public String returnDate;

    @Override
    public int compareTo(Passenger o) {
        return 0;
    }

    public Passenger(Integer id, String name, String address, String phoneNumber, String returnDate, String goDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.returnDate = returnDate;
        this.goDate = goDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGoDate() {
        return goDate;
    }

    public void setGoDate(String goDate) {
        this.goDate = goDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
