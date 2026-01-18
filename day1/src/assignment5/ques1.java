package assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class FileDownloader implements Runnable{
	private String fileName;
	private Random randomSleep = new Random();

	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void run() {
		try {
			System.out.println("Downloading file: "+fileName);
			int sleepTime = 200 + randomSleep.nextInt(301);
			Thread.sleep(sleepTime);
			System.out.println("File "+fileName+ " has been downloaded.");
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
            System.out.println("Download interrupted for file: " + fileName);
		}

	}	
}

public class ques1 {
	public static void main(String[] args) {
		ArrayList<String> urls = new ArrayList<>(Arrays.asList(
			    "https://www.dropbox.com/photo1.jpg",
			    "https://www.dropbox.com/photo2.jpg",
			    "https://www.dropbox.com/photo3.jpg",
			    "https://www.dropbox.com/photo4.jpg",
			    "https://www.dropbox.com/photo5.jpg",
			    "https://www.dropbox.com/photo6.jpg",
			    "https://www.dropbox.com/photo7.jpg",
			    "https://www.dropbox.com/photo8.jpg",
			    "https://www.dropbox.com/photo9.jpg",
			    "https://www.dropbox.com/photo10.jpg",
			    "https://www.dropbox.com/photo11.jpg",
			    "https://www.dropbox.com/photo12.jpg",
			    "https://www.dropbox.com/photo13.jpg",
			    "https://www.dropbox.com/photo14.jpg",
			    "https://www.dropbox.com/photo15.jpg",
			    "https://www.dropbox.com/photo16.jpg",
			    "https://www.dropbox.com/photo17.jpg",
			    "https://www.dropbox.com/photo18.jpg",
			    "https://www.dropbox.com/photo19.jpg",
			    "https://www.dropbox.com/photo20.jpg",
			    "https://www.dropbox.com/photo21.jpg",
			    "https://www.dropbox.com/photo22.jpg",
			    "https://www.dropbox.com/photo23.jpg",
			    "https://www.dropbox.com/photo24.jpg",
			    "https://www.dropbox.com/photo25.jpg"
			));
			for(String url: urls) {
				String fileName = url.substring(url.lastIndexOf("/") + 1);
				Thread thread = new Thread(new FileDownloader(fileName));
				thread.start();
				// this will start all 25 threads very close to each other
				// internally, the JVM will pick and run each thread.
				// so i cannot guarantee that the files will start printing in the order 1,2,3 ..25
				// however, they do finish downloading randomly due to my run() code
			}
	}
}
