package com.caveofprogramming.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");
		offersDao.delete(2);
		List<Offer> offers = offersDao.getOffers();
		System.out.println("Using Query For Object "+offersDao.getOffer(1));

		for(Offer offer: offers)
		{
			System.out.println(offer);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
