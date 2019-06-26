import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form  extends JFrame {
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea6;
    private JTextArea textArea7;
    private JTextArea textArea8;
    private JTextArea textArea9;
    private JTextArea textArea10;
    private JTextArea textArea11;
    private JTextArea textArea12;
    private JTextArea textArea13;
    private JTextArea textArea14;
    private JTextArea textArea15;
    private JTextArea textArea16;
    private JTextArea textArea17;
    private JTextArea textArea18;
    private JTextArea textArea19;
    private JTextArea textArea20;
    private JTextArea textArea21;
    private JTextArea textArea22;
    private JTextArea textArea23;
    private JTextArea textArea24;
    private JTextArea textArea25;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea26;
    private JLabel label;
    private JPanel root;
    private JButton button1;

    public Form(){
        this.getContentPane().add(root);
        this.button1.addActionListener(new MyButtonListener());
        button1.setName("Checking");

        textArea1.setName("t1");
        textArea2.setName("t2");
        textArea3.setName("t3");
        textArea4.setName("t4");
        textArea5.setName("t5");

        textArea6.setName("t6");
        textArea7.setName("t7");
        textArea8.setName("t8");
        textArea9.setName("t9");
        textArea10.setName("t10");

        textArea11.setName("t11");
        textArea12.setName("t12");
        textArea13.setName("t13");
        textArea14.setName("t14");
        textArea15.setName("t15");

        textArea16.setName("t16");
        textArea17.setName("t17");
        textArea18.setName("t18");
        textArea19.setName("t19");
        textArea20.setName("t20");

        textArea21.setName("t21");
        textArea22.setName("t22");
        textArea23.setName("t23");
        textArea24.setName("t24");
        textArea25.setName("t25");

        textArea26.setName("res");

    }
    public class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            btnclick();
        }
    }


    void btnclick(){
        char [][] s = new char[5][5];
        if(textArea1 != null && !textArea1.getText().equals("")) s[0][0] = textArea1.getText().charAt(0);
        else s[0][0] = ' ';
        if(textArea2 != null && !textArea2.getText().equals("")) s[0][1] = textArea2.getText().charAt(0);
        else s[0][1] = ' ';
        if(textArea3 != null && !textArea3.getText().equals("")) s[0][2] = textArea3.getText().charAt(0);
        else s[0][2] = ' ';
        if(textArea4 != null && !textArea4.getText().equals("")) s[0][3] = textArea4.getText().charAt(0);
        else s[0][3] = ' ';
        if(textArea5 != null && !textArea5.getText().equals("")) s[0][4] = textArea5.getText().charAt(0);
        else s[0][4] = ' ';

        if(textArea6 != null && !textArea6.getText().equals("")) s[1][0] = textArea6.getText().charAt(0);
        else s[1][0] = ' ';
        if(textArea7 != null && !textArea7.getText().equals("")) s[1][1] = textArea7.getText().charAt(0);
        else s[1][1] = ' ';
        if(textArea8 != null && !textArea8.getText().equals("")) s[1][2] = textArea8.getText().charAt(0);
        else s[1][2] = ' ';
        if(textArea9 != null && !textArea9.getText().equals("")) s[1][3] = textArea9.getText().charAt(0);
        else s[1][3] = ' ';
        if(textArea10 != null && !textArea10.getText().equals("")) s[1][4] = textArea10.getText().charAt(0);
        else s[1][4] = ' ';

        if(textArea11 != null && !textArea11.getText().equals("")) s[2][0] = textArea11.getText().charAt(0);
        else s[2][0] = ' ';
        if(textArea12 != null && !textArea12.getText().equals("")) s[2][1] = textArea12.getText().charAt(0);
        else s[2][1] = ' ';
        if(textArea13 != null && !textArea13.getText().equals("")) s[2][2] = textArea13.getText().charAt(0);
        else s[2][2] = ' ';
        if(textArea14 != null && !textArea14.getText().equals("")) s[2][3] = textArea14.getText().charAt(0);
        else s[2][3] = ' ';
        if(textArea15 != null && !textArea15.getText().equals("")) s[2][4] = textArea15.getText().charAt(0);
        else s[2][4] = ' ';

        if(textArea16 != null && !textArea16.getText().equals("")) s[3][0] = textArea16.getText().charAt(0);
        else s[3][0] = ' ';
        if(textArea17 != null && !textArea17.getText().equals("")) s[3][1] = textArea17.getText().charAt(0);
        else s[3][1] = ' ';
        if(textArea18 != null && !textArea18.getText().equals("")) s[3][2] = textArea18.getText().charAt(0);
        else s[3][2] = ' ';
        if(textArea19 != null && !textArea19.getText().equals("")) s[3][3] = textArea19.getText().charAt(0);
        else s[3][3] = ' ';
        if(textArea20 != null && !textArea20.getText().equals("")) s[3][4] = textArea20.getText().charAt(0);
        else s[3][4] = ' ';

        if(textArea21 != null && !textArea21.getText().equals("")) s[4][0] = textArea21.getText().charAt(0);
        else s[4][0] = ' ';
        if(textArea22 != null && !textArea22.getText().equals("")) s[4][1] = textArea22.getText().charAt(0);
        else s[4][1] = ' ';
        if(textArea23 != null && !textArea23.getText().equals("")) s[4][2] = textArea23.getText().charAt(0);
        else s[4][2] = ' ';
        if(textArea24 != null && !textArea24.getText().equals("")) s[4][3] = textArea24.getText().charAt(0);
        else s[4][3] = ' ';
        if(textArea25 != null && !textArea25.getText().equals("")) s[4][4] = textArea25.getText().charAt(0);
        else s[4][4] = ' ';

        HelloTests ht = new HelloTests();
        textArea26.setText(ht.check(s) + "");

    }
}

