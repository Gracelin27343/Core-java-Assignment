package com.gracelin.assignment2;

import java.util.Scanner;

public class Commission extends Student {

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        setName(sc.nextLine());

        System.out.print("Enter Address: ");
        setAddress(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        setPhone(Integer.parseInt(sc.nextLine()));  // Safer with nextLine() + parse

        System.out.print("Enter Sales Amount: ");
        setSalesAmount(sc.nextDouble());
    }

    public void calculateCommission() {
        double sales = getSalesAmount();
        double commission;

        if (sales >= 100000) {
            commission = sales * 0.10;
        } else if (sales >= 50000) {
            commission = sales * 0.05;
        } else if (sales >= 30000) {
            commission = sales * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + getName() + " is: " + commission);
    }
	}
	  
