package project5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> b = new ArrayList<>();
        Car temp = new Car();
        boolean f = true;

        while (f) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\ncar name : ");
            String n = input.nextLine();
            temp.setName(n);
            System.out.println("car color : ");
            n = input.nextLine();
            temp.setColor(n);
            System.out.println("car plake : ");
            n = input.nextLine();
            temp.setPlak(n);
            System.out.println("car Shomare badane : ");
            n = input.nextLine();
            temp.setShomare_badane(n);
            System.out.println("car Shomare shasi : ");
            n = input.nextLine();
            temp.setShomare_shasi(n);
            System.out.println("car Zarfiyat : ");
            n = input.nextLine();
            temp.setZarfiyat(n);
            System.out.print("\n\nAdd other car ? y | n : ");
            n = input.nextLine();
            b.add(temp);
            if (n != "y") {
                f = false;
            }


        }


    }
    static class Car {

        private String name;
        private String color;
        private String shomare_badane;
        private String shomare_shasi;
        private String zarfiyat;
        private String plak;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getShomare_badane() {
            return shomare_badane;
        }

        public void setShomare_badane(String shomare_badane) {
            this.shomare_badane = shomare_badane;
        }

        public String getShomare_shasi() {
            return shomare_shasi;
        }

        public void setShomare_shasi(String shomare_shasi) {
            this.shomare_shasi = shomare_shasi;
        }

        public String getZarfiyat() {
            return zarfiyat;
        }

        public void setZarfiyat(String zarfiyat) {
            this.zarfiyat = zarfiyat;
        }

        public String getPlak() {
            return plak;
        }

        public void setPlak(String plak) {
            this.plak = plak;
        }

    }

}
