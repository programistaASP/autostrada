package Rekurencje;

public class Rekurencja {
    public static void main(String[] args) {
        funkcjaRekurencyjna();

    }
    public static void funkcjaRekurencyjna(){
        System.out.println("Jestem w funkcji rekurencyjnej");
        funkcjaRekurencyjna();
    }
}
