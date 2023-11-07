package Schule;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchuleGUI {
    private JPanel Mainpanel;


    private JLabel Label;
    private JLabel Label2;
    private JTextField Erraten;
    private JTextField Raten;
    private JButton B;
    private JButton Button;
private JButton Button2;
    private JButton u;
    private JButton p;
    private JButton s;
    private JButton r;
    private JButton v;
    private JButton q;
    private JButton w;
    private JButton x;
    private JButton y;
    private JButton t;
    private JButton o;
    private JButton n;
    private JButton m;
    private JButton l;
    private JButton k;
    private JButton j;
    private JButton i;
    private JButton h;
    private JButton g;
    private JButton f;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton z;
    private JButton aButton;
    private JTextArea Grafik;
    private JTextField Eingabe;
    private JButton Leertaste;
    private JButton Reset;
    private JLabel Label3;
    String wort ;
String tee;
    String[] wort1;
    String[] buchstabe;
    int fehler2 = 0;
    int fehler ;
    String wort2 = "exekutieren";
    String wort3 = "vandalieren";
    String wort4 = "eskalieren";
    String wort5 = "wal";
    String wort6 = "meerjungfrau";
    String wort7 = "orangutan";
    String wort8 = "basketball";
    String wort9 = "yoghurt";
    String wort10 = "nichtsdestotrotz";
    String wort11 = "Galionsfigur";
    int max = 10;
    int min = 1;

    public SchuleGUI() {


        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafik.setText("\n\n\n\n\n\n=============\\ / \\ /");
                 tee = Eingabe.getText();
                wort = tee.toLowerCase();

                Eingabe.setText("");
                int a = wort.length();
                Raten.setText("");
                wort1 = new String[wort.length()];
                for(int i = 0; i<a;i++){
                    wort1[i] = "_ ";
                }
                Erraten.setText("");
                for(int i = 0; i<a;i++){
                    Erraten.setText(Erraten.getText()+wort1[i]);

                }
            }
        });

        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String nn = Raten.getText();

                String g = nn.toLowerCase();


                Raten.setText("");

                String buchstabe = "";
                for (int i = 0; i < wort.length(); i++) {
                    buchstabe = String.valueOf(wort.charAt(i));
                    if (buchstabe.equals(g)) {
                        wort1[i] = g;
                        fehler2=0;
                    }
                    else {
                        fehler2++;
                    }
                }
                if(g.length()>=2){
                    Raten.setText("Nur EINEN Buchstaben,Reset!");
                }
                if(fehler2/wort.length()==1){fehler++;
                    fehler2=0;
                    Eingabe.setText(Eingabe.getText()+g+",");}
                if(fehler==1){Grafik.setText("");
                    Grafik.setText("                             |\n\t|\n\t|\n\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==2){
                    Grafik.setText("");Grafik.setText(" ============|\n\t|\n\t|\n\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==3){
                    Grafik.setText("");Grafik.setText(" ============|\n  |\t|\n\t|\n\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==4){
                    Grafik.setText("");Grafik.setText(" ============|\n  |\t|\n O\t|\n\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==5){
                    Grafik.setText("");Grafik.setText(" ============|\n  |\t|\n\\O/\t|\n\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==6){
                    Grafik.setText("");Grafik.setText(" ============|\n  |\t|\n\\O/\t|\n  |\t|\n\t|\n\t|\n=============\\ / \\ /");}
                if(fehler==7){
                    Grafik.setText("");Grafik.setText(" ============|\n  |\t|\n\\O/\t|\n  |\t|\n /|\t|\n\t|\n=============\\ / \\ /");
                    Raten.setText("Verloren :(");}
                Erraten.setText("");

                for (int i = 0; i<wort.length();i++){

                    Erraten.setText(Erraten.getText()+wort1[i]);
                }

                if(wort.equals(Erraten.getText()))
                {

                    Erraten.setText("");
                    Erraten.setText( Raten.getText()+"Super,geschafft!");

                }
            }


        });


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("b");


            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("c");

            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("d");

            }
        });
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("e");

            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("f");

            }
        });
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("g");

            }
        });
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("h");

            }
        });
        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("i");

            }
        });
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("j");

            }
        });
        k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("k");

            }
        });
        l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("l");

            }
        });
        m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("m");

            }
        });
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("n");

            }
        });
        o.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("o");

            }
        });
        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("p");

            }
        });
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("q");

            }
        });
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("r");

            }
        });
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("s");

            }
        });
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("t");

            }
        });
        u.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("u");

            }
        });
        v.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("v");

            }
        });
        w.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("w");

            }
        });
        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("x");

            }
        });
        y.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("y");

            }
        });
        z.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("z");

            }
        });

        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText("a");

            }
        });

        Leertaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Raten.setText("");
                Raten.setText(" ");

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafik.setText("\n\n\n\n\n\n=============\\ / \\ /");
                int woerter= (int)(Math.random()*max)+min;
                if(woerter==1){wort=wort2;}
                if(woerter==2){wort=wort3;}
                if(woerter==3){wort=wort4;}
                if(woerter==4){wort=wort5;}
                if(woerter==5){wort=wort6;}
                if(woerter==6){wort=wort7;}
                if(woerter==7){wort=wort8;}
                if(woerter==8){wort=wort9;}
                if(woerter==9){wort=wort10;}
                if(woerter==10){wort=wort11;}
                Eingabe.setText("");
                int a = wort.length();
                Raten.setText("");
                wort1 = new String[wort.length()];
                for(int i = 0; i<a;i++){
                    wort1[i] = "_ ";
                }
                Erraten.setText("");
                for(int i = 0; i<a;i++){
                    Erraten.setText(Erraten.getText()+wort1[i]);

                }
            }

        });
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eingabe.setText("");
                Raten.setText("");
                Erraten.setText("");
                Grafik.setText("");
                fehler=0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HangmanGUI");
        frame.setContentPane(new SchuleGUI().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
