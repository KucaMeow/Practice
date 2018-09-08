import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcMod extends JFrame{
    //Vars
    int numa = 0, numb = 0, res = 0, state = 0, out = 0;
    boolean first = false, second = true, third = false;
    //Digitals
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");
    //Symbols
    private JButton buttonP = new JButton("+");
    private JButton buttonM = new JButton("-");
    private JButton buttonD = new JButton("/");
    private JButton buttonMu = new JButton("*");
    private JButton buttonE = new JButton("=");
    private JButton buttonC = new JButton("C");
    private JLabel output = new JLabel();
    private JLabel empty1 = new JLabel();
    private JLabel empty2 = new JLabel();
    private JLabel empty3 = new JLabel();

    //Operations
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

    //GUI
    public CalcMod() {
        super("Calculator");
        this.setBounds(100, 100, 300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Calculator");

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,4));

        buttonE.setBackground(new Color(235, 153, 77));
        buttonP.setBackground(new Color(77, 214, 235));
        buttonM.setBackground(new Color(77, 214, 235));
        buttonMu.setBackground(new Color(77, 214, 235));
        buttonD.setBackground(new Color(77, 214, 235));

        container.add(output);
        container.add(empty1);
        container.add(empty2);
        container.add(empty3);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(buttonP);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(buttonM);
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(buttonMu);
        container.add(buttonC);
        container.add(button0);
        container.add(buttonE);
        container.add(buttonD);

        //Listeners
        button0.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 0;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 0;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ev) {
                   if(first == false) {
                        numa = numa*10 + 1;
                        System.out.println(numa);
                        out = numa;
                   }
                   else if(first == true && second == true) {
                        numb = numb*10 + 1;
                       out = numb;
                       System.out.println(numb);
                   }
                    output.setText(Integer.toString(out));
                }
            }
        );
        button2.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 2;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 2;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button3.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 3;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 3;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button4.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 4;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 4;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button5.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 5;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 5;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button6.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 6;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 6;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button7.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 7;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 7;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button8.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 8;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 8;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        button9.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = numa*10 + 9;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = numb*10 + 9;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );
        buttonC.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              numa = 0;
                                              System.out.println(numa);
                                              out = numa;
                                          }
                                          else if(first == true && second == true) {
                                              numb = 0;
                                              System.out.println(numb);
                                              out = numb;
                                          }
                                          output.setText(Integer.toString(out));
                                      }
                                  }
        );

        //Actions
        buttonP.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              state = 1;
                                              first = true;
                                          }
                                      }
                                  }
        );
        buttonM.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              state = 2;
                                              first = true;
                                          }
                                      }
                                  }
        );
        buttonMu.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              state = 3;
                                              first = true;
                                          }
                                      }
                                  }
        );
        buttonD.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == false) {
                                              state = 4;
                                              first = true;
                                          }
                                      }
                                  }
        );
        buttonE.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent ev) {
                                          if(first == true) {
                                                switch (state){
                                                    case 1:
                                                        res = summ(numa, numb);
                                                        break;
                                                    case 2:
                                                        res = sub(numa, numb);
                                                        break;
                                                    case 3:
                                                        res = mult(numa, numb);
                                                        break;
                                                    case 4:
                                                        res = div(numa, numb);
                                                        break;
                                                }
                                                out = res;
                                                output.setText(Integer.toString(out));
                                              System.out.println("RESULT========");
                                              System.out.println(res);
                                                numa = 0;
                                                numb = 0;
                                                state = 0;
                                                first = false;
                                                second = true;
                                          }
                                      }
                                  }
        );


    }

    //Main
    public static void main(String[] args) {

        CalcMod app = new CalcMod();
        app.setVisible(true);
        /* OLD VERSION
        -------------------------------------------------------------------

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
        OLD VERSION
        -------------------------------------------------------------------
        */
    }
}