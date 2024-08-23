package com.spring.Controller;

import com.spring.Service.AlarmService;
import com.spring.Service.ClockService;
import com.spring.Service.PumpService;
import com.spring.Service.SensorService;

public class MainController {

    // Services
    private final SensorService sensorService =  new SensorService();

    private final AlarmService alarmService =  new AlarmService();

    private final PumpService pumpService =  new PumpService();

    private final ClockService clockService =  new ClockService();

    public void run(){

    }

    /**
     * This method checks if the sugar on the blood is high
     * Este metodo verifica se o acucar no sangue esta alto
     * @return true (esta alto | is high), false (esta normal | it's normal)*/
    private boolean isTheBloodSugarHigh(int totalSugarOnBlood){
        return totalSugarOnBlood > 126;
    }

    /**
     * Calculates the total ml of insulin needed
     * Calcula o total de ml de insulina*/
    private float calculateMlOfInsulin(int totalSugarOnBlood){
        float totalOfInsulinUnit = (float) (totalSugarOnBlood - 100) / 50;

        return (float) totalOfInsulinUnit / 5;
    }
}
