package com.spring.View;

import java.io.IOException;

public class MenuView {

    public static void presentationMenu(){
        System.out.println("=========================================================");
        System.out.println("                       Iɴsᴜʟɪɴᴀ ᴀᴜᴛᴏ");
        System.out.println("=========================================================");
    }

    public static void limparTela(){
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String cmd;
            if (os.contains("win")) {
                cmd = "cmd /c cls"; // Windows
            } else {
                cmd = "clear"; // Unix-like systems
            }
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
