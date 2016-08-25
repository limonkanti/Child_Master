package text_to_speechtest;

import com.sun.speech.freetts.*;
import com.sun.speech.freetts.VoiceManager;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

class TTS_TestPart extends JFrame implements ActionListener {

    Font font = new Font("Nirmala UI", Font.PLAIN, 16);
    VoiceManager vm;
    Voice voice;
    JPanel panel = new JPanel();

    JButton a_btn = new JButton("1");
    JButton b_btn = new JButton("2");
    JButton c_btn = new JButton("3");
    JButton d_btn = new JButton("4");
    JButton e_btn = new JButton("5");
    JButton f_btn = new JButton(" ");

    TTS_TestPart() {
        super("Test");
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE);
        add(panel);
        setSize(400, 500);
        setVisible(true);
        addComponent();

    }

    void addComponent() {

        a_btn.setBounds(10, 10, 50, 50);
        a_btn.addActionListener(this);
        panel.add(a_btn);
        add(panel);

        c_btn.setBounds(10, 70, 50, 50);
        c_btn.addActionListener(this);
        panel.add(c_btn);
        add(panel);

        b_btn.setBounds(130, 70, 50, 50);
        b_btn.addActionListener(this);
        panel.add(b_btn);
        add(panel);

        e_btn.setBounds(130, 10, 50, 50);
        e_btn.addActionListener(this);
        panel.add(e_btn);
        add(panel);

        d_btn.setBounds(70, 70, 50, 50);
        d_btn.addActionListener(this);
        panel.add(d_btn);
        add(panel);

        f_btn.setBounds(70, 10, 50, 50);
        f_btn.addActionListener(this);
        panel.add(f_btn);
        add(panel);

    }

    public static void main(String args[]) {
        TTS_TestPart ob = new TTS_TestPart();
        System.setProperty("mbrola.base", "C:\\Users\\User\\Downloads\\mbrola");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a_btn) {
            String s = a_btn.getLabel();
            if (f_btn.getLabel().equals(" ")) {
                f_btn.setLabel(s);
                a_btn.setLabel(" ");
            } else if (c_btn.getLabel().equals(" ")) {
                c_btn.setLabel(s);
                c_btn.setLabel(" ");
            }
        }//end of if  

        if (e.getSource() == b_btn) {
            String s = b_btn.getLabel();
            String s2 = e_btn.getLabel();

            if (b_btn.getLabel().equals("2")) {
                e_btn.setLabel(s);
                b_btn.setLabel(s2);
            }
        }

        if (f_btn.getLabel().equals("1") && b_btn.getLabel().equals("5") && c_btn.getLabel()
                .equals("3") && d_btn.getLabel().equals("4") && e_btn.getLabel().equals("2")) {
            // JOptionPane.showMessageDialog(TTS_TestPart.this ,"Congratulations!!!You have won!!!");
            vm = VoiceManager.getInstance();
            voice = vm.getVoice("mbrola_us1");
            voice.allocate();
            voice.speak("Congratulations!!!You have won!!!");

        }
    }

}
