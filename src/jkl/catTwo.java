package jkl;

import javax.swing.*;
import java.util.ArrayList;

public class catTwo {
    public static void main(String[] args) {
            ArrayList<fileOne> list;
            list = new ArrayList<>();
            fileOne person;

            person = new fileOne();
            list.add(person);

            person = new fileOne();
            list.add(person);

            person = new fileOne();
            list.add(person);

            person =new fileOne();
            list.add(person);
            JOptionPane.showInputDialog(null,list.toString());
        }
    }
}
