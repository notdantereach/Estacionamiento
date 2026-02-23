package edu.lospedros.estacionamiento.example;

import edu.lospedros.estacionamiento.data.SimpleVehicle;
import edu.lospedros.estacionamiento.data.VehicleSize;
import edu.lospedros.estacionamiento.payment.fare.BaseFareStrategy;
import edu.lospedros.estacionamiento.payment.fare.FareCalculator;
import edu.lospedros.estacionamiento.process.Ticket;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ExampleUsage {
    public static void main(String[] args) {
        // Vehicle: moto (SMALL)
        SimpleVehicle v = new SimpleVehicle("ABC-123", VehicleSize.SMALL);

        // Entrada hace 1 hora y 30 minutos
        LocalDateTime entry = LocalDateTime.now().minusHours(1).minusMinutes(30);
        LocalDateTime exit = LocalDateTime.now();

        Ticket t = new Ticket("T1", v, entry);
        t.setExitTime(exit);

        FareCalculator calc = new FareCalculator(Arrays.asList(BaseFareStrategy.withDefaultRates()));
        BigDecimal fare = calc.calculateFare(t);

        System.out.println("Fare = " + fare); // con tus reglas: motos=20/h, mínimo 20 -> 2 horas facturables => 40
    }
}