package org.hibernatepractice.dto;

public class StudentDetailsDto {
    private int rollNo;
    private String name;
    private int sAge;
    public StudentDetailsDto(Builder builder) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.sAge = builder.sAge;
    }
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

        public StudentDetailsDto build() {
            return new StudentDetailsDto(this);
        }
    }
}
