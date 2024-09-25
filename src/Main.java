import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                           =======Список заданий=======
                           1 - Вывод чисел от 1 до 10
                           2 - Сумма числел от 1 до 100
                           3 - Факториал числа
                           4 - Таблица умножения
                           5 - Четные и нечетные числа
                           """);
        System.out.print("Выберите задание: ");
        int input = scan.nextInt();
        switch (input) {
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
            case 4:    
                ex4();
                break;
        }
        
    }
    
    public static void ex1(){
        
        for(int i = 1; i <= 10; i++){
        
            System.out.print(i + " ");
            
        }
        
    }

    public static void ex2(){

        for(int i = 1; i <= 100; i++){

            System.out.print(i + " ");

        }

    }

    public static void ex3(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Найти факториал числа: ");
        int x = scan.nextInt();
        int fact = 1;
        
        for(int i = 2; i <= x; i++){

            fact *= i;

        }

        System.out.println("Факториал числа " + x + ": " + fact);
        
    }

    public static void ex4(){

        for(int i = 1; i <= 10; i++){

           for(int j = 1; j <= 10; j++){
               System.out.print(j+"*"+i+"="+i*j+" | ");
           }
           
            System.out.println();
           
        }

    }
}