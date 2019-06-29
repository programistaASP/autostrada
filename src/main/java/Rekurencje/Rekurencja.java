package Rekurencje;

public class Rekurencja {
    public static void main(String[] args) {
       gcd(12, 11);
        int[] numberArray = new int[]{1, -6, 7, 8, 12, -178, 45};
       // System.out.println(arraySum(numberArray));
        System.out.println(factorialNormal(5));
        System.out.println(factorialRecursive(30));
    }

    public static int sumowanieTablicyRekurencyjnej(int [] numberArray, int index){

        if(index==0){
            return numberArray[0];
        }else {
            return sumowanieTablicyRekurencyjnej(numberArray, index-1)+numberArray[index];
        }
    }
    static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }else{
            return gcd(b, a%b) + 5;
        }
    }
   /* public static void funkcjaRekurencyjna(){
        System.out.println("Jestem w funkcji rekurencyjnej");
        funkcjaRekurencyjna();*/

    public static int arraySum(int [] numberArray){
        int sum = 0;
        for(int i = 0;i<numberArray.length;i++) {
            sum = +numberArray[i];

        }return sum;
    }
    public static int factorialNormal(int number){
        int factorial = 1;
        for(int i =1; i<=number;i++){
            factorial *= i ;
        }return factorial;

    }
    static int factorialRecursive(int liczba) {
        if (liczba >=1) {
            return factorialRecursive(liczba -1) * liczba;
        }else {
            return 1;
        }
    }


}
