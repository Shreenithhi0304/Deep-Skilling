public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "T-Shirt", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Notebook", "Stationery"),
            new Product(105, "Shoes", "Fashion")
        };

        String searchFor = "Phone";

        Product linearResult = LinearSearch.search(products, searchFor);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Not Found"));

        Product binaryResult = BinarySearch.search(products, searchFor);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Not Found"));
    }
}
