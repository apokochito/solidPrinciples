package com.principles;

import com.principles.di.AddCalculatorOperation;
import com.principles.di.Calculator;
import com.principles.di.DivideCalculatorOperation;
import com.principles.is.School;
import com.principles.ls.Rectangle;
import com.principles.ls.Shape;
import com.principles.ls.Square;
import com.principles.oc.ClaimApprovalManager;
import com.principles.oc.HealthInsuranceSurveyor;
import com.principles.oc.VehicleInsuranceSurveyor;
import com.principles.sr.Book;

public class Main {

    public static void main(String[] args) {

        // 1. Single Responsibility - Book
        Book book = new Book();
        book.addStock(15);
        book.sold();
        System.out.println("Book stock - " + book.getStock());

        System.out.println("");

        // 2. Open-Closed - Consider an insurance system that validates health insurance claims before approving one.
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor(); // Health Insurance
        ClaimApprovalManager claim1 = new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor); // Health Insurance
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor(); // Vehicle Insurance
        ClaimApprovalManager claim2 = new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor); // Vehicle Insurance
        // You can use interfaces too

        System.out.println("");

        // 3. Liskov Substitution
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println("Rectangle - " + rectangle.area());
        square.setHeight(20);
        square.setWidth(10);
        System.out.println("Square - " + square.area());

        System.out.println("");

        // 4. Interface Segregation
        School school = new School();
        System.out.println(school.cyberbullying("Group A"));
        System.out.println(school.leaderships("Among us Society"));

        System.out.println("");

        // 5. Dependency Inversion
        Calculator sum = new Calculator(new AddCalculatorOperation());
        System.out.println("Addition result - " + sum.Solve(1, 6));
        Calculator div = new Calculator(new DivideCalculatorOperation());
        System.out.println("Divide result - " + div.Solve(6, 2));
    }
}
