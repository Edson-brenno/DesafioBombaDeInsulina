package com.spring.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class it simulates a clock
 * Esta class simula um relogio*/
public class ClockService {

    /**
     * This method get the current time
     * Este metodo obtem a data e hora atual*/
    public String getCurrentTime() {

        // Obtém o horário atual no fuso horário do Brasil
        ZonedDateTime now = Instant.now().atZone(ZoneId.of("America/Sao_Paulo"));

        // Define o formato desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Formata a data e hora atual
        return now.format(formatter);
    }

}
