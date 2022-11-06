package org.example;

import java.io.IOException;

public class Countries {
    private String name;
    private double area;
    private double population;
    private String capital;
    private double populationCapital;

    public Countries(String name, double area, double population, String capital, double populationCapital) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.capital = capital;
        this.populationCapital = populationCapital;
    }
    public Countries(String name, double area, double population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) throws IOException {
        if (capital==null) throw new IOException("пусто");
        this.capital = capital;
    }

    public double getPopulationCapital() {
        return populationCapital;
    }

    public void setPopulationCapital(double populationCapital) {

        this.populationCapital = populationCapital;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", populationCapital=" + populationCapital +
                '}';
    }
}
