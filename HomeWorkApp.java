public class HomeWorkApp{
    public static void printThreeWords (){
        String firstColor = "Orange";
        String secondColor = "Banana";
        String thirdColor = "Apple";
        String allColors = firstColor + "\n" + secondColor + "\n" + thirdColor;
        System.out.println(allColors);
    };
    public static void checkSumSign(int a, int b){
        int res = a + b;
        boolean isOr = a + b >= 0;
        if (isOr){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value) {
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value < 100 ){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) {

        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static void main (String[] args){
        boolean isFinished = true;
        printThreeWords();
        checkSumSign(3, 7);
        checkSumSign(-7,2);
        printColor(17);
        printColor(0);
        printColor(120);
        compareNumbers(10, 11);
        compareNumbers(16, 8);
        compareNumbers(7, 7);
    }
}
