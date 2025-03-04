package org.hibernatepractice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetail")
public class StudentDetailEntity {
    public StudentDetailEntity() {
    }

    public StudentDetailEntity(Builder builder) {
        this.name = builder.name;
        this.sAge = builder.sAge;
        this.rollNo = builder.rollNo;
        this.laptop = builder.laptop;
    }
    @Id
    private int rollNo;
    private String name;
    private int sAge;
    @OneToOne
    private LaptopEntity laptop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public LaptopEntity getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopEntity laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", sAge=" + sAge +
                '}';
    }

    public static class Builder {
        private int rollNo;
        private String name;
        private int sAge;
        private LaptopEntity laptop;

        public Builder rollNo(int rollNo) {
            this.rollNo=rollNo;
            return this;
        }

        public Builder name(String name) {
            this.name=name;
            return this;
        }

        public Builder sAge(int sAge) {
            this.sAge=sAge;
            return this;
        }
        public Builder laptop(LaptopEntity laptop) {
            this.laptop=laptop;
            return this;
        }

        public StudentDetailEntity build() {
            return new StudentDetailEntity(this);
        }
    }

}
