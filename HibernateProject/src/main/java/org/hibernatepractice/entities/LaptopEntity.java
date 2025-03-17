package org.hibernatepractice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptop")
public class LaptopEntity {
    public LaptopEntity() {
    }

    public LaptopEntity(Builder builder) {
        this.lid = builder.lid;
        this.brand = builder.brand;
        this.model = builder.model;
        this.ram = builder.ram;
    }

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "LaptopEntity{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static class Builder {
        private int lid;
        private String brand;
        private String model;
        private int ram;

        public Builder lid(int lid) {
            this.lid = lid;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public LaptopEntity build() {
            return new LaptopEntity(this);
        }
    }
}
