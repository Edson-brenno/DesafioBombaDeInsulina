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

}
