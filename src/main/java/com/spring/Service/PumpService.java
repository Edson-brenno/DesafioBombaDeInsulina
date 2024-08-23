package com.spring.Service;

/**
 * This class is an abstraction of insulin pump
 * Esta classe abistrai um bomba de insulina */
public class PumpService {

    // Method to inject insulin
    // Metodo para simular injeção de insulina
    public void injectInsulin(int totalOfInsulin){
        System.out.println("Injetando " + totalOfInsulin + " unidade de insulina");
    }
}
