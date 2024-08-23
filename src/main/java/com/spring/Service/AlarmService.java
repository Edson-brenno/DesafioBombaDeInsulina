package com.spring.Service;

import java.awt.Toolkit;

/**
 * This class it's responsible to simulate one alarm
 * Esta class é responsavel por simular um alarme*/
public class AlarmService {

    /**
     * This method it's responsible to reproduce the beep to alert that the system it's active now
     * Este metodo é responsavel por reproduzir beep que indica que o sistema iniciou*/
    public void beepStartOfTheSystem(){
        Toolkit.getDefaultToolkit().beep();
    }

    /**
     * This method it's responsible to reproduce the beep alert
     * Este metodo é reponsavel por reproduzir beep de alerta*/
    public void beepToAlert(){
        for(int c = 0; c < 3; c++){
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
