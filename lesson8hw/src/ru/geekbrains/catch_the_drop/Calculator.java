package ru.geekbrains.catch_the_drop;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Calculator {

    public JFrame window = new JFrame("Calculator");
    public JTextField imput = new JTextField();

    public Calculator() {
        window.setSize(295, 405);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.white);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        enterArea();
        monthButton();

        window.setVisible(true);
    }

    private void enterArea() {
        imput.setFont(new Font("Arial", Font.BOLD, 24));
        imput.setBounds(16, 10, 248, 36);
        imput.setBackground(Color.white);
        imput.setHorizontalAlignment(JTextField.RIGHT);
        window.add(imput);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher((KeyEventDispatcher) new KeyDispatcher());
    }


    class KeyDispatcher implements KeyEventDispatcher {
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                result();
            }

            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                imput.setText("");
            }
            return false;
        }
    }


    private void monthButton() {
        int num = 0;
        String arr[] = {"1", "2", "3", "С", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "+", "/", "(", ")", "="};
        JButton[] jbutton_n = new JButton[arr.length];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                jbutton_n[num] = new JButton();
                jbutton_n[num].setFont(new Font("Arial", Font.PLAIN, 36));
                jbutton_n[num].setText(arr[num]);
                jbutton_n[num].setMargin(new Insets(0, 0, 0, 0));
                if (num < arr.length - 1) {
                    jbutton_n[num].setBounds(16 + j * 62, 55 + i * 62, 60, 60);
                } else {
                    jbutton_n[num].setBounds(16 + j * 62, 55 + i * 62, 122, 60);
                }
                jbutton_n[num].setFocusable(false);

                window.add(jbutton_n[num]);

                ActionListener num_button = new GoNumListener();
                jbutton_n[num].addActionListener(num_button);

                if (num < arr.length - 1) {
                    num++;
                } else {
                    break;
                }
            }
        }
    }


    public class GoNumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            if (name == "=" || name == "С") {
                //...
            } else {
                imput.setText(imput.getText() + name);
            }
            if (name == "=") {
                result();
            }
            if (name == "С") {
                imput.setText("");
            }
            window.repaint();
        }
    }

    private void result() {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            imput.setText("" + engine.eval(imput.getText()));
        } catch (ScriptException e1) {
        }
    }
}