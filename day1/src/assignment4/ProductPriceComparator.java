package assignment4;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product d1, Product d2) {
		return Double.compare(d1.getProductPrice(), d2.getProductPrice());
	}

}
