package com.github.fish56.frame;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * 每个JFrame = MenuBar + Panel
 */
public class MyFrame extends JFrame {
    @Getter
    private int width;
    @Getter
    private int height;

    public MyFrame(String title, int width, int height){
        super(title);

        this.width = width;
        this.height = height;

        // 创建一个画布
        MyPanel myPanel = new MyPanel();
        myPanel.setPreferredSize(new Dimension(width, height));
        // 设置到JFrame
        setContentPane(myPanel);

        // 让JFrame窗口适应子元素
        pack();
        // 设置大小
        // setSize(width, height);

        // 设置是否可以修改大小
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置时候可视
        setVisible(true);
    }
    public MyFrame(String title){
        this(title, 1024, 768);
    }

    private class MyPanel extends JPanel {
        /**
         * 绘图方法
         * @param graphics: 上下文绘图环境
         */
        @Override
        public void paintComponent(Graphics graphics){
            super.paintComponent(graphics);
            graphics.drawOval(3, 4, 220, 300);
        }
    }
}
