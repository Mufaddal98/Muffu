package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        String name, NIC;
        double WSalary, Wage;
        int hours;
        Employee[] arr =new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Chose one \n a)SalariedEmployee b)HourlyEmployee");
            char E = scanner.next().charAt(0);
            if (E == 'a') {
                System.out.println("Enter the name: ");
                name = scanner.next();
                System.out.println("Enter NIC: ");
                NIC = scanner.next();
                System.out.println("Enter the weekly salary: ");
                WSalary = scanner.nextDouble();

                arr[i] = new SalariedEmployee(name, NIC, WSalary);
                arr[i].Earnings(WSalary,52);
                arr[i].Displaydetails((SalariedEmployee) arr[i]);

            }
            else if (E == 'b') {
                System.out.println("Enter the name: ");
                name = scanner.next();
                System.out.println("Enter NIC: ");
                NIC = scanner.next();
                System.out.println("Enter the weekly salary: ");
                Wage = scanner.nextDouble();
                System.out.println("Enter hours worked: ");
                hours = scanner.nextInt();
                arr[i] = new HourlyEmployee(name, NIC, Wage, hours);
                arr[i].Earnings(Wage,hours);
                arr[i].Displaydetails((HourlyEmployee)arr[i]);

            }
        }
    }
}
