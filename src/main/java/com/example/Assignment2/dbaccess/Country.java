package com.example.Assignment2.dbaccess;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

/**
 * Country entity representing a country record in the database.
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "country_code", nullable = false, length = 10)
    private String countryCode;

    @Column(name = "country_name", nullable = false, length = 150)
    private String countryName;

    @Column(name = "iso2", length = 2)
    private String iso2;

    @Column(name = "flag_image", length = 255)
    private String flagImage;

    /**
     * Default constructor required by JPA.
     */
    public Country() {
    }

    /**
     * Constructs a Country with the provided information.
     *
     * @param id          the country ID
     * @param countryCode the country code
     * @param countryName the country name
     * @param iso2        the ISO2 code
     * @param flagImage   the flag image path
     */
    public Country(int id, String countryCode, String countryName, String iso2, String flagImage) {
        this.id = id;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.iso2 = iso2;
        this.flagImage = flagImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(String flagImage) {
        this.flagImage = flagImage;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", flagImage='" + flagImage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (countryCode != null ? !countryCode.equals(country.countryCode) : country.countryCode != null) return false;
        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;
        if (iso2 != null ? !iso2.equals(country.iso2) : country.iso2 != null) return false;
        return flagImage != null ? flagImage.equals(country.flagImage) : country.flagImage == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (iso2 != null ? iso2.hashCode() : 0);
        result = 31 * result + (flagImage != null ? flagImage.hashCode() : 0);
        return result;
    }
}