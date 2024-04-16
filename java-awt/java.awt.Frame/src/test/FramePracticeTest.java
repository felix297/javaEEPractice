package test;

import java.util.Scanner;
import com.company.FelixFrame;
import org.junit.jupiter.api.Test;
import java.awt.Frame;

public class FramePracticeTest {
    @Test
    public void framePracticeTest () {
//        new FelixFrame().getFrame();
        Frame frame = new Frame();

        new Scanner(System.in).next();// 防止窗口一闪而过
    }
}