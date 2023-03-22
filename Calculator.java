import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton addButton,subButton,mulButton,divButton,equButton,clrButton;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JPanel panel;

    double a = 0,b = 0,result = 0;
    int operator = 0;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,400,500);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(45,25,300,50);
        textfield.setEditable(false);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(45,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(divButton);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(mulButton);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(subButton);
        panel.add(b0);
        panel.add(clrButton);
        panel.add(equButton);
        panel.add(addButton);
        
        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        new Calculator();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b0){ textfield.setText(textfield.getText().concat("0")); }
        if(e.getSource() == b1){ textfield.setText(textfield.getText().concat("1")); }
        if(e.getSource() == b2){ textfield.setText(textfield.getText().concat("2")); }
        if(e.getSource() == b3){ textfield.setText(textfield.getText().concat("3")); } 
        if(e.getSource() == b4){ textfield.setText(textfield.getText().concat("4")); }
        if(e.getSource() == b5){ textfield.setText(textfield.getText().concat("5")); }
        if(e.getSource() == b6){ textfield.setText(textfield.getText().concat("6")); }
        if(e.getSource() == b7){ textfield.setText(textfield.getText().concat("7")); }
        if(e.getSource() == b8){ textfield.setText(textfield.getText().concat("8")); }
        if(e.getSource() == b9){ textfield.setText(textfield.getText().concat("9")); }
        
        if(e.getSource() == addButton){
            a = Double.parseDouble(textfield.getText());
            operator = 1;
            textfield.setText("");
        }
        if(e.getSource() == subButton){
            a = Double.parseDouble(textfield.getText());
            operator = 2;
            textfield.setText("");
        }
        if(e.getSource() == mulButton){
            a = Double.parseDouble(textfield.getText());
            operator = 3;
            textfield.setText("");
        }
        if(e.getSource() == divButton){
            a = Double.parseDouble(textfield.getText());
            operator = 4;
            textfield.setText("");
        }
        if(e.getSource() == equButton){
            b = Double.parseDouble(textfield.getText());
            
            switch(operator){
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: result = a / b; break;
                default: result = 0;
            }
            textfield.setText( "" + result );
        }
        if(e.getSource() == clrButton){ 
            textfield.setText(""); 
        }
    }
}