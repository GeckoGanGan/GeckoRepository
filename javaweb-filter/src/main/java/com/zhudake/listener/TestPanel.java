package com.zhudake.listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("恐龙抗狼");
        Panel panel = new Panel(null);
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255));
        panel.setBounds(50,50,200,200);
        panel.setBackground(new Color(0,255,0));
        frame.add(panel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("关闭ing");
            }
        });
    }
}
