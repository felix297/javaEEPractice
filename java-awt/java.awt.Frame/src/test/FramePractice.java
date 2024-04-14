package test;

import java.util.Scanner;
import com.company.FelixFrame;
import org.junit.jupiter.api.Test;

public class FramePractice{
    @Test
    public void framePracticeTest () {
        new FelixFrame().getFrame();

        new Scanner(System.in).next();
    }
}