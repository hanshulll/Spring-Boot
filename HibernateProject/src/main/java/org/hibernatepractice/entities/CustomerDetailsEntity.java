package org.hibernatepractice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// This class shows how to define specific table name which differs from the entity name and specify different column names than in entity
@Entity
@Table(name = "customer_detail")
public class CustomerDetailsEntity {

    public CustomerDetailsEntity() {

    }

    public CustomerDetailsEntity(Builder builder) {
        this.age = builder.age;
        this.id = builder.id;
        this.name = builder.name;
        this.mobileNumber = builder.mobileNumber;
        this.isActive = builder.isActive;
        this.address=builder.address;
    }

    @Id
    @Column(name = "customer_id")
    private int id;
    @Column(name = "customer_name")
    private String name;
    private String age;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Transient
    private Boolean isActive;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDetailsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", isActive=" + isActive +
                ", address=" + address +
                '}';
    }

    public static class Builder {

        private int id;
        private String name;
        private String age;
        private String mobileNumber;
        private Boolean isActive;
        private Address address;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public CustomerDetailsEntity build() {
            return new CustomerDetailsEntity(this);
        }
    }
}
