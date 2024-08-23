package com.spring;

import com.spring.Controller.MainController;
import com.spring.View.MenuView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        MainController controller = new MainController();

        while (true){

            MenuView.presentationMenu();

            controller.run();

            MenuView.limparTela();

            Thread.sleep(2000);
        }
    }
}