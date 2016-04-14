package com.caveofprogramming.spring.test;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");
		
		List<Offer> offers = new ArrayList<Offer>();
		offers.add(new Offer(3,"Dave","dave@caveofprogramming.com","Cash for Software"));
		offers.add(new Offer(2,"Karen","karen@caveofprogramming.com","Cash for Software"));
		
		int[] resultValues = offersDao.create(offers);
		
		for(int value: resultValues)
		{
			System.out.println("Updated "+value+"rows.");
		}
		
		//offersDao.create(offers);
		
		
//		offersDao.delete(2);
//		Offer updateOffer = new Offer(5,"Rahul","rahul@caveofprogramming.com","Server Development Engineer - Vertafore");
//		if(offersDao.update(updateOffer))
//		{
//			System.out.println("Object updated");
//		}
//		Offer offer1 = new Offer("Dave","dave@caveofprogramming.com","Coding in Java");
//		Offer offer2 = new Offer("Karen","karen@caveofprogramming.com","Testing on contract");
//		offersDao.create(offer1);
//		offersDao.create(offer2);
		List<Offer> offersList = offersDao.getOffers();
//		System.out.println("Using Query For Object "+offersDao.getOffer(4));
//
		for(Offer offer: offersList)
		{
			System.out.println(offer);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
