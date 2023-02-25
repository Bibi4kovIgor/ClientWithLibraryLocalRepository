package org.example;

import edu.demo.Computer;
import edu.demo.ComputerImplementation;

public class Main implements Constants {
    public static void main(String[] args) {
        Computer computer = new ComputerImplementation(
                HIGH_PRODUCTIVITY_COMPUTER_NAME,
                ACCESSORIES);
        System.out.println(computer.getComputerDescription());
    }
}