import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //Составить алгоритм: если введенное число больше 7, то вывести “Привет”

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if(number>7){
            System.out.println("Привет");
        }

        //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        scanner.nextLine();

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }


        //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };

        for(int i = 0; i < myArray.length; i++){
            int temp = myArray[i];

            if (temp %3 == 0){
                System.out.println(myArray[i]);
            }
        }

    }
}