package Test;

public class lot {
     int validateQuantity(int lotSize, int n,  boolean isUp) {
        while (n % lotSize != 0) {
            if (isUp) {
                n++;
            }
            else n--;
        }
        return n;
    }

    public static void main(String[] args) {
        var obj = new lot();
        System.out.println(obj.validateQuantity(10, 12, false));
    }
}
