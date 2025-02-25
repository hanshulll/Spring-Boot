package org.hibernatepractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    }
    @Id
    private int rollNo;
    private String name;
    private int sAge;

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

        public StudentDetailEntity build() {
            return new StudentDetailEntity(this);
        }
    }

}
