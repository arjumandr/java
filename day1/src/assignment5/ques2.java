package assignment5;

import java.util.concurrent.CountDownLatch;

public class ques2 {
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(100_00);
		
        CountDownLatch startSignal = new CountDownLatch(1);

		Thread bank = new Thread(new Bank(account));
		Thread company = new Thread(new Company(account));
		bank.start();
		company.start();
		
		startSignal.countDown();
		
		bank.join();
		company.join();
		
		System.out.println("Final Balance: "+ account.getBalance());
	}
}
