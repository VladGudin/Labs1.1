package org.example;

import java.io.IOException;

public class Country {
    private String name;
    private double area;
    private int population;
    private String capital;
    private int populationCapital;


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
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) throws IllegalArgumentException{
        if (population>0)  this.population = population;
        else throw new IllegalArgumentException("Значение population должно быть больше 0");
    }
    public String getCapital() {
        return capital;
    }
   public boolean setCapital(String capital) throws IOException {
      if (capital==null) throw new IOException("Значение null");
      if (capital.isEmpty()) throw new IOException("Значение отсуствует");
      this.capital = capital;
      return true;
   }

    public int getPopulationCapital() {
        return populationCapital;
    }
    public void setPopulationCapital(int populationCapital) throws IllegalArgumentException {
        if (populationCapital==0 ) throw new IllegalArgumentException("0");
        this.populationCapital = populationCapital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", populationCapital=" + populationCapital +
                '}';
    }
    public double getDensity (){
        double density = population/area;
        return population/area;
    }


    public static void printAll(Country[] startCountries) {
        for (int i = 0; i < 2; i++) {
            System.out.print(startCountries[i]);
        }

    }
    // Обнуляющий метод
    public void setNull () {
        this.capital = null;
        this.populationCapital = 0;
    }
}
