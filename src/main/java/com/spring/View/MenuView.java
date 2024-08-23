package com.spring.View;

import java.io.IOException;

public class MenuView {

    public static void presentationMenu(){
        System.out.println("=========================================================");
        System.out.println("                       Iɴsᴜʟɪɴᴀ ᴀᴜᴛᴏ");
        System.out.println("=========================================================");
    }

    public static void limparTela() throws IOException, InterruptedException {
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}
