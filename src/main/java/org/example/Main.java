package org.example;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Country france = new Country();
        try {
            france.setName("Франция");
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение1");
        }
        france.setArea(1000);
        france.setPopulation(50000);
        try {
            france.setCapital("Париж");
        } catch (IOException e) {
            System.out.println("Исключение2");
        }
        france.setPopulationCapital(2000);
        france.getDensity();
        // france.setNull();// обнуление данных о столице

        System.out.println("Страна " + france.getName() + " Площадь страны " + france.getArea() + " км");
        System.out.println("Население " + france.getPopulation() + " человек");
        System.out.println("Столица " + france.getCapital());
        System.out.println("Население столицы " + france.getPopulationCapital() + " человек");
        System.out.println("Плотность населения " + france.getDensity());

        Country monaco = new Country();// второй конструктор для города-государства
        monaco.setName("Монако");
        monaco.setArea(4000);
        monaco.setPopulation(8000);

        Country[] startCountries = new Country[2];
        startCountries[0] = france;
        startCountries[1] = monaco;
        Country.printAll(startCountries);// Печатает данные о странах в заданно
        System.out.println(" "); // строка, чтобы массив countriesArray печатался на следующей строчке


        Countries[] countriesArray = new Countries[5];// Массив
        countriesArray[0] = new Countries("Russia", 17100, 146700, "Moscow", 12600);
        countriesArray[1] = new Countries("Finland", 338, 5500, "Helsinki", 655);
        countriesArray[2] = new Countries("France", 643.8, 67800, "Paris", 2100);
        countriesArray[3] = new Countries("Andorra", 0.467, 85.4, "Andorra la Vella", 22.6);
        countriesArray[4] = new Countries("Singapore", 0.725, 5700);


        for (int i = 0; i < countriesArray.length; ++i) {
            //System.out.println(countriesArray[i]);
            { if (countriesArray[i].getCapital() == null || countriesArray[i].getCapital() == "") {
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
}








