package com.example.Assignment2.dbaccess;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * Customer entity representing a customer record in the database.
 * 
 * This class is mapped to the customer table and contains customer information
 * including personal details, contact information, and address.
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "postal_code", length = 20)
    private String postalCode;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "block_no", length = 20)
    private String blockNo;

    @Column(name = "unit_no", length = 20)
    private String unitNo;

    @Column(name = "country_id")
    private int countryId;

    /**
     * Default constructor required by JPA.
     */
    public Customer() {
    }

    /**
     * Constructs a Customer with the provided information.
     *
     * @param fullName   the customer's full name
     * @param email      the customer's email address
     * @param password   the customer's password
     * @param phone      the customer's phone number
     * @param street     the street address
     * @param postalCode the postal code
     * @param country    the country
     * @param blockNo    the block number
     * @param unitNo     the unit number
     * @param countryId  the country ID
     */
    public Customer(String fullName, String email, String password, String phone, String street, String postalCode,
                    String country, String blockNo, String unitNo, int countryId) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.street = street;
        this.postalCode = postalCode;
        this.country = country;
        this.blockNo = blockNo;
        this.unitNo = unitNo;
        this.countryId = countryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", blockNo='" + blockNo + '\'' +
                ", unitNo='" + unitNo + '\'' +
                ", countryId=" + countryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (countryId != customer.countryId) return false;
        if (userId != null ? !userId.equals(customer.userId) : customer.userId != null) return false;
        if (fullName != null ? !fullName.equals(customer.fullName) : customer.fullName != null) return false;
        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
        if (password != null ? !password.equals(customer.password) : customer.password != null) return false;
        if (phone != null ? !phone.equals(customer.phone) : customer.phone != null) return false;
        if (street != null ? !street.equals(customer.street) : customer.street != null) return false;
        if (postalCode != null ? !postalCode.equals(customer.postalCode) : customer.postalCode != null) return false;
        if (country != null ? !country.equals(customer.country) : customer.country != null) return false;
        if (blockNo != null ? !blockNo.equals(customer.blockNo) : customer.blockNo != null) return false;
        return unitNo != null ? unitNo.equals(customer.unitNo) : customer.unitNo == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (blockNo != null ? blockNo.hashCode() : 0);
        result = 31 * result + (unitNo != null ? unitNo.hashCode() : 0);
        result = 31 * result + countryId;
        return result;
    }
}
