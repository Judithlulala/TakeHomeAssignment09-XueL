package com.example.carsinfo;

public class Cars {
    private String name;
    private int capacity;
    private int producedYear;
    private boolean imported;

    public Cars(){};

    public Cars(String name, int cCapacity,int cProducedYear, boolean isImported){
        this.name=name;
        this.capacity=cCapacity;
        this.producedYear=cProducedYear;
        this.imported=isImported;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    @Override
    public String toString(){
        return "Brand: " + name + "\nCapacity:" + capacity +
                "\n Is imported? " + imported +
                "\n Produced Year: " + producedYear;

    }
}
