package org.example;

import java.io.IOException;

public class Countries {
    private String name;
    private double area;
    private double population;
    private String capital;
    private double populationCapital;




    public Countries(String name, double area, double population, String capital, double populationCapital) throws IOException {
        this(name, area, population);
        setCapital(capital);
        setPopulationCapital(populationCapital);

    }

    public Countries(String name, double area, double population) {
        setName(name);
        setArea(area);
        setPopulation(population);
    }

    public Countries() {

    }

    public static void printAll(Countries[] startCountries) {
        for (int i = 0; i < startCountries.length; i++) {
            System.out.print(startCountries[i]);
        }
    }

    public void print(Countries france) {
        if (france.getCapital() == null || france.getCapital() == "") {
            System.out.println("Страна " + france.getName() );
            System.out.println("Площадь страны " + france.getArea() + " км");
            System.out.println("Население " + france.getPopulation() + " человек");


        } else {
            System.out.println("Страна " + france.getName() + " Площадь страны " + france.getArea() + " км");
            System.out.println("Население " + france.getPopulation() + " человек");
            System.out.println("Столица " + france.getCapital());
            System.out.println("Население столицы " + france.getPopulationCapital() + " человек");
            System.out.println("Плотность населения " + france.getDensity());
        }
    }

    public static void printAll1(Countries[] countriesArray) {
        for (int i = 0; i < countriesArray.length; ++i) {

            {
                if (countriesArray[i].getCapital() == null || countriesArray[i].getCapital() == "") {
                    System.out.println("Countries{" +
                            "name=" + countriesArray[i].getName() + '\'' +
                            ", area=" + countriesArray[i].getArea() + '\'' +
                            ", population=" + countriesArray[i].getPopulation() + '\'' +
                            '}');
                } else {
                    System.out.println("Countries{" +
                            "name='" + countriesArray[i].getName() + '\'' +
                            ", area='" + countriesArray[i].getArea() + '\'' +
                            ", population='" + countriesArray[i].getPopulation() + '\'' +
                            ", capital='" + countriesArray[i].getCapital() + '\'' +
                            ", populationCapital='" + countriesArray[i].getPopulationCapital() + '\'' +
                            '}');
                }
            }
        }
    }

    public double getDensity() {
        double density = population / area;
        return population / area;
    }
    // Обнуляющий метод

    public void setNull () {
        this.capital = null;
        this.populationCapital = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws IllegalArgumentException {
        if (name==null) throw new IllegalArgumentException();
        this.name = name;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) throws IllegalArgumentException{
        if (area>0) this.area = area;
        else throw new IllegalArgumentException("Значение area должно быть больше 0");
    }

    public double getPopulation() {

        return population;
    }
    public void setPopulation(double population) throws IllegalArgumentException{
        if (population>0)  this.population = population;
        else throw new IllegalArgumentException("Значение population должно быть больше 0");
    }

    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) throws IOException {
        if (capital==null) throw new IOException("Значение null");
        if (capital.isEmpty()) throw new IOException("Значение отсуствует");
        this.capital = capital;
    }
    public double getPopulationCapital() {
        return populationCapital;
    }

    public void setPopulationCapital(double populationCapital) throws IllegalArgumentException {
        if (populationCapital == 0) throw new IllegalArgumentException("0");
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