package text_to_speechtest;

import com.sun.speech.freetts.*;
import com.sun.speech.freetts.VoiceManager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.scene.paint.Color;
import javax.swing.*;

class Child_Master_Main extends JFrame implements ActionListener {

    ResourceBundle rb;
    Font font = new Font("Nirmala UI", Font.PLAIN, 16);
    JPanel panel = new JPanel();
    JButton number_btn;// = new JButton("সংখ্যা");
    JButton vowel_btn = new JButton("স্বরবর্ণ");
    JButton consonent_btn = new JButton("Number's");
    JButton test_btn = new JButton("Test");
    JButton letter_btn = new JButton("Letter's");

    Child_Master_Main() {
        super("Child Master");
        panel.setBackground(java.awt.Color.BLUE);

        panel.setLayout(null);
        add(panel);
        setSize(450, 550);
        setVisible(true);
        add_components();

    }

    void add_components() {
    //    number_btn= new JButton();
         Locale locale=Locale.US;
        ResourceBundle rb=ResourceBundle.getBundle("text_to_speechtest.MessageBundle",locale);
      //  System.out.println(rb.getString("greeting"));
       // ResourceBundle rb2=ResourceBundle.getBundle("text_to_speechtest.MessageBundle",locale);
       // System.out.println(rb.getString("greeting"));
        Locale.setDefault(new Locale("in", "bn"));
         ResourceBundle rb1=ResourceBundle.getBundle("text_to_speechtest.MessageBundle");
      //   System.out.println(rb1.getString("greeting"));
        number_btn= new JButton(rb1.getString("number"));
        letter_btn.setBounds(150, 50, 120, 60);
        letter_btn.addActionListener(this);
        panel.add(letter_btn);
        add(panel);

        
    //    number_btn.setActionCommand("greeting");
        number_btn.setFont(font);
        number_btn.addActionListener(this);
        number_btn.setBounds(150, 120, 120, 60);
        panel.add(number_btn);
        add(panel);

        vowel_btn.setFont(font);
        vowel_btn.addActionListener(this);
        vowel_btn.setBounds(150, 190, 120, 60);
        panel.add(vowel_btn);
        add(panel);

        consonent_btn.setBounds(150, 260, 120, 60);
        consonent_btn.addActionListener(this);
        panel.add(consonent_btn);
        add(panel);

        test_btn.addActionListener(this);
        test_btn.setBounds(150, 330, 120, 60);
        panel.add(test_btn);
        add(panel);
    }

    public static void main(String args[]) {
       
        Child_Master_Main ob = new Child_Master_Main();
        System.setProperty("mbrola.base", "C:\\Users\\User\\Downloads\\mbrola");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == letter_btn) {
            TTS_LettersPart ob = new TTS_LettersPart();

        }
        if (e.getSource() == number_btn) {
            TTS_NumberPart ob = new TTS_NumberPart();

        }
        if (e.getSource() == vowel_btn) {
            TTS_VowelPart ob = new TTS_VowelPart();

        }
        if (e.getSource() == consonent_btn) {
            TTS_EnumberPart ob = new TTS_EnumberPart();

        }
        if (e.getSource() == test_btn) {
            TTS_TestPart ob = new TTS_TestPart();

        }

    }
}
