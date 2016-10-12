import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;

/**
 * Created by User on 13.10.2016.
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("Welcom!");
       String name =  JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello," + name);
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);
        System.out.println("You are " +age + " years old");
        int dif = Math.abs(31 - age);
        if (age > 31) {
            System.out.println("You are older then I on " + dif + " years old");
        }
        else if (age < 31) {
            System.out.println("You are younger then I on " + dif + " years old");
        }
        else {
            System.out.println(name + ", We are contemporaris! ");
        }
        System.exit(0);

    }
}
