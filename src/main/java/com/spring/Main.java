package com.spring;

import com.spring.Controller.MainController;
import com.spring.View.MenuView;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        MainController controller = new MainController();

        while (true){

            MenuView.presentationMenu();

            controller.run();

            MenuView.limparTela();

        }
    }
}