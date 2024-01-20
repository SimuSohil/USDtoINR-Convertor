import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CurrencyConvertor
{
    CurrencyConvertor()
    {
        Frame f = new Frame("Currency Convertor");

        Label title = new Label("CURRENCY CONVERTOR-USD TO INR");
        title.setBounds(80,50,450,50);
        title.setFont(new Font("Serif", Font.BOLD, 23));
        title.setForeground(Color.WHITE);
        f.add(title);

        //Panel for USD
        Panel p1 = new Panel();

        Label usd = new Label("Enter USD: ");
        usd.setForeground(Color.LIGHT_GRAY);
        p1.add(usd);

        TextField display1 = new TextField("0.00");
        display1.setSize(100,50);
        display1.setFont(new Font("Serif", Font.BOLD, 15));
        p1.add(display1);

        p1.setBounds(90,120,400,50);
        p1.setLayout(new GridLayout(0,2,3,3));
        f.add(p1);

        //Button for first Reset:
        Button reset = new Button("Reset");
        reset.setBounds(310,200,100,50);
        reset.setFont(new Font("Serif", Font.BOLD, 15));
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display1.setText("0.00");
            }
        });
        f.add(reset);

        //Panel for Result:
        Panel p2 = new Panel();

        Label result = new Label("Converted Value: ");
        result.setForeground(Color.LIGHT_GRAY);
        p2.add(result);

        TextField display2 = new TextField("0.00");
        display2.setSize(100,50);
        display2.setFont(new Font("Serif", Font.BOLD, 15));
        p2.add(display2);

        p2.setLayout(new GridLayout(0,2,3,3));
        p2.setBounds(90,280,400,50);
        f.add(p2);

        //Button for conversion:
        Button convert = new Button("Convert");
        convert.setBounds(150,200,100,50);
        convert.setFont(new Font("Serif", Font.BOLD, 15));
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(display1.getText());
                float inr = (float) (num1*83.12);
                display2.setText(String.valueOf(inr));
            }
        });
        f.add(convert);

        //Button for Reset All:
        Button resetAll = new Button("Reset All");
        resetAll.setBounds(250,360,90,50);
        resetAll.setFont(new Font("Serif", Font.BOLD, 15));
        resetAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display1.setText("0.00");
                display2.setText("0.00");
            }
        });
        f.add(resetAll);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setBackground(Color.BLACK);
        f.setSize(600,450);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args)
    {
        new CurrencyConvertor();
    }
}