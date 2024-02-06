public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
       // b = b + c; //b=3
        //a = a * b; //a= 12
        //c = a - c; //c=2
        a = a + b; //a= 15
        //a = a - b; //a=12
        c = a + b; //c=15
        b = c / a; //b=1
        //a = b + c; //a=26
        a = a + c + b;
        int s;
        // Напишите здесь свой код
        for (s=0;s<=20;s++){
            System.out.println(a);

        }
    }
}
