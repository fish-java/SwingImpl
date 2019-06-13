package com.github.fish56.frame;

import org.junit.Test;

public class FrameTest {
    @Test
    public void create() throws Exception{
        MyFrame myFrame = new MyFrame("Hello Jon");
        Thread.sleep(60 * 1000);
    }
}
