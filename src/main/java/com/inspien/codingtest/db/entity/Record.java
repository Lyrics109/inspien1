package com.inspien.codingtest.db.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Record {
    private String names;
    private String phone;
    private String email;
    private String birthDate;
    private String company;
    private String personalNumber;
    private String organisationNumber;
    private String country;
    private String region;
    private String city;
    private String street;
    private String zipCode;
    private String creditCard;
    private String gUID;

    @Builder
    public Record(String names, String phone, String email, String birthDate, String company, String personalNumber, String organisationNumber, String country, String region, String city, String street, String zipCode, String creditCard, String gUID) {
        this.names = names;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.company = company;
        this.personalNumber = personalNumber;
        this.organisationNumber = organisationNumber;
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.creditCard = creditCard;
        this.gUID = gUID;
    }

    @Override
    public String toString() {
        String delimiter = "^";
        return names + delimiter +
                phone + delimiter +
                email + delimiter +
                birthDate + delimiter +
                company + delimiter +
                personalNumber + delimiter +
                organisationNumber + delimiter +
                country + delimiter +
                region + delimiter +
                city + delimiter +
                street + delimiter +
                zipCode + delimiter +
                creditCard + delimiter +
                gUID +
                "\n";
    }
}
