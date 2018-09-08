import java.util.Scanner;

public class Calc{
    static int summ(int a, int b){
        return a+b;
    }
    static int mult(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, d = 0;
        char c;
        while(true){
            a = reader.nextInt();
            c = reader.next().charAt(0);
            b = reader.nextInt();
            /*
            if (c == '+'){
                d = summ(a,b);
            }
            if (c == '-'){
                System.out.println(sub(a,b));
            }
            if (c == '*'){
                System.out.println(mult(a,b));
            }
            if (c == '/'){
                System.out.println(div(a,b));
            }
            */
            switch (c){
                case '+' :
                    d = summ(a,b);
                    break;
                case '-' :
                    d = sub(a,b);
                    break;
                case '/' :
                    d = div(a,b);
                    break;
                case '*' :
                    d = mult(a,b);
                    break;
                case 'p' :
                    System.exit(-1);
                default :
                    break;
            }
            System.out.println(d);
        }
    }
}