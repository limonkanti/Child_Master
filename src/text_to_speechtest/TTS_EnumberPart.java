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

class TTS_EnumberPart extends JFrame implements ActionListener {

    Font font = new Font("Nirmala UI", Font.PLAIN, 16);
    VoiceManager vm;
    Voice voice;
    JPanel panel = new JPanel();

    JButton a_btn = new JButton("1");
    JButton b_btn = new JButton("2");
    JButton c_btn = new JButton("3");
    JButton d_btn = new JButton("4");
    JButton e_btn = new JButton("5");

    TTS_EnumberPart() {
        super("Number's");
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE);
        add(panel);
        setSize(400, 500);
        setVisible(true);
        addComponent();

    }

    void addComponent() {
        a_btn.setFont(font);
        a_btn.setBounds(10, 10, 50, 50);
        a_btn.addActionListener(this);
        panel.add(a_btn);
        add(panel);

        b_btn.setBounds(70, 10, 50, 50);
        b_btn.addActionListener(this);
        panel.add(b_btn);
        add(panel);

        c_btn.setBounds(130, 10, 50, 50);
        c_btn.addActionListener(this);
        panel.add(c_btn);
        add(panel);

        d_btn.setBounds(190, 10, 50, 50);
        d_btn.addActionListener(this);
        panel.add(d_btn);
        add(panel);

        e_btn.setBounds(250, 10, 50, 50);
        e_btn.addActionListener(this);
        panel.add(e_btn);
        add(panel);

    }

    public static void main(String args[]) {
        TTS_EnumberPart ob = new TTS_EnumberPart();
        System.setProperty("mbrola.base", "C:\\Users\\User\\Downloads\\mbrola");
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == a_btn) {

            vm = VoiceManager.getInstance();

            voice = vm.getVoice("mbrola_us1");
            // voice = vm.getVoice("kevin16");
            // voice.setRate(120);  
            //  voice.setPitch(100);  
            //voice.setPitch(1000);
            // voice.setPitchShift(10);
            voice.allocate();
            voice.speak("1");

        }
        if (e.getSource() == b_btn) {

            vm = VoiceManager.getInstance();
            voice = vm.getVoice("mbrola_us1");
            voice.allocate();
            voice.speak("2.");

        }
        if (e.getSource() == c_btn) {

            vm = VoiceManager.getInstance();
            voice = vm.getVoice("mbrola_us1");
            voice.allocate();
            voice.speak("3");

        }

        if (e.getSource() == d_btn) {

            vm = VoiceManager.getInstance();
            voice = vm.getVoice("mbrola_us1");
            voice.allocate();
            voice.speak("4.");

        }
        if (e.getSource() == e_btn) {

            vm = VoiceManager.getInstance();
            voice = vm.getVoice("mbrola_us1");
            voice.allocate();
            voice.speak("5.");

        }
    }
}
