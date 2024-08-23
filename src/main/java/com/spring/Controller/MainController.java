package com.spring.Controller;

import com.spring.Service.*;

public class MainController {

    // Services
    private final SensorService sensorService =  new SensorService();

    private final AlarmService alarmService =  new AlarmService();

    private final PumpService pumpService =  new PumpService();

    private final ClockService clockService =  new ClockService();

    private final DisplayService displayService =  new DisplayService();

    public void run() throws InterruptedException {

        int bloodGlucose = sensorService.obterInformacoesAcucarNoSangue();

        displayService.display("Hora: " + clockService.getCurrentTime());
        displayService.display("Glicose: " + bloodGlucose +"mg/dL");

        if (this.isTheBloodSugarHigh(bloodGlucose)){

            alarmService.beepToAlert();

            pumpService.injectInsulin(this.calculateMlOfInsulin(bloodGlucose));

            Thread.sleep(3000);
        }
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
