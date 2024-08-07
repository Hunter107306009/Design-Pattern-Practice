package com.seat.design_pattern;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.seat.design_pattern.Singleton.*;
import com.seat.design_pattern.Factory.*;
import com.seat.design_pattern.Proxy.*;
import com.seat.design_pattern.Template.*;
import com.seat.design_pattern.Strategy.*;
import com.seat.design_pattern.Observer.*;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		//Singleton
		printBanner("Singleton Pattern");
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		System.out.println(instance1 == instance2 ? "Singleton的instance相同" : "Singleton的instance不相同");

		//Factory
		printBanner("Factory Method Pattern");
		BMWFactory carFactory=new BMWFactory();
		Car newCar=carFactory.buildACar();
		newCar.drive();

		//Proxy
		printBanner("Proxy Pattern");
		SecuredDoor securedLabDoor=new SecuredDoor(new LabDoor());
		securedLabDoor.open();
		securedLabDoor.open("wrong password");
		securedLabDoor.open("***");
		securedLabDoor.close();

		//Template
		printBanner("Template Method Pattern");
		CookingFood recipe=new CookingFood();
		recipe.cook();

		//Strategy
		printBanner("Strategy Pattern");
		CashContext cashContext;
		cashContext = new CashContext(TYPE.NORMAL);
		System.out.println("Normal: " + cashContext.GetResult(1000));
		cashContext = new CashContext(TYPE.CASH_DISCOUNT);
		System.out.println("Cash Discount: " + cashContext.GetResult(1000));
		cashContext = new CashContext(TYPE.CASH_RETURN);
		System.out.println("Cash Return: " + cashContext.GetResult(1000));

		//Observer
		printBanner("Observer Pattern");
		Debit zack=new Debtor();
		zack.borrow(new Creditor());
		zack.notifyCredit();
	}

	private static void printBanner(String BannerName) {
		System.out.println(" ");
		System.out.print("---");
		System.out.print(BannerName);
		System.out.println("---");
	}

}
