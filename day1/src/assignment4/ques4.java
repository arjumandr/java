package assignment4;
import java.util.PriorityQueue;

public class ques4 {
	public static void main(String[] args) {
		PriorityQueue<Product> pq = new PriorityQueue<>(new ProductPriceComparator());
		pq.add(new Product(1, "Laptop", 55000));
        pq.add(new Product(2, "Mouse", 500));
        pq.add(new Product(3, "Keyboard", 1500));
        pq.add(new Product(4, "MotherBoard", 4500));
        pq.add(new Product(5, "Headphone", 1200));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
	}
}
