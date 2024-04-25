package com.microsoft.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SnakeUtils {
    // info of main window
    private static int mainWindowWidth;
    private static int mainWindowHeight;
    private static int mainWindowX;
    private static int mainWindowY;

    static {
        try {
            InputStream size = ClassLoader.getSystemResourceAsStream("size.properties");
            Properties properties = new Properties();
            properties.load(size);

            mainWindowWidth = Integer.parseInt(properties.getProperty("mainWindowWidth"));
            mainWindowHeight = Integer.parseInt(properties.getProperty("mainWindowHeight"));
            mainWindowX = Integer.parseInt(properties.getProperty("mainWindowX"));
            mainWindowY = Integer.parseInt(properties.getProperty("mainWindowY"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getMainWindowWidth () {
        return mainWindowWidth;
    }

    public static int getMainWindowHeight () {
        return mainWindowHeight;
    }

    public static int getMainWindowX () {
        return mainWindowX;
    }

    public static int getMainWindowY() {
        return mainWindowY;
    }
}
