package com.microsoft.util;

import javax.swing.ImageIcon;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SnakeUtils {
    private static Properties properties = new Properties();

    static {
        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("size.properties");
            properties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDefaultDirection () {
        return properties.getProperty("default-direction");
    }

    public static int getMainWindowX () {
        return Integer.parseInt(properties.getProperty("mainWindowX"));
    }

    public static int getMainWindowY() {
        return Integer.parseInt(properties.getProperty("mainWindowY"));
    }

    public static int getMainWindowWidth () {
        return Integer.parseInt(properties.getProperty("mainWindowWidth"));
    }

    public static int getMainWindowHeight () {
        return Integer.parseInt(properties.getProperty("mainWindowHeight"));
    }

    public static int getContentPaneX () {
        return Integer.parseInt(properties.getProperty("contentPaneX"));
    }

    public static int getContentPaneY() {
        return Integer.parseInt(properties.getProperty("contentPaneY"));
    }

    public static int getContentPaneWidth () {
        return Integer.parseInt(properties.getProperty("contentPaneWidth"));
    }

    public static int getContentPaneHeight () {
        return Integer.parseInt(properties.getProperty("contentPaneHeight"));
    }

    public static ImageIcon getBGImage () {
        return new ImageIcon(properties.getProperty("bg-image"));
    }

    public static ImageIcon getSnakeHead () {
        return new ImageIcon(properties.getProperty("snake-head"));
    }

    public static ImageIcon getSnakeTail () {
        return new ImageIcon(properties.getProperty("snake-tail"));
    }

    public static int getSnakeInitPosX () {
        return Integer.parseInt(properties.getProperty("snake-initPosX"));
    }

    public static int getSnakeInitPosY () {
        return Integer.parseInt(properties.getProperty("snake-initPosY"));
    }

    public static int getSnakeHeadLength () {
        return Integer.parseInt(properties.getProperty("snake-headLength"));
    }

    public static int getSnakeTailLength () {
        return Integer.parseInt(properties.getProperty("snake-tailLength"));
    }
}
