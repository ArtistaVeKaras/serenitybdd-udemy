package jpetstore.pages.pages;

public class DataDriverPage extends BasePage {

    //all the String name should match the column names in the csv file
    private String username;
    private String password;
    private String productCategory;
    private String productName;
    private String specficProductName;
    private String cardType;
    private String expireDate;
    private String firstName;
    private String lastName;
    private String add1;
    private String add2;
    private String city;
    private String state;
    private String zip;
    private String country;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSpecficProductName(String specficProductName) {
        this.specficProductName = specficProductName;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
