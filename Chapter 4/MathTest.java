public class MathTest {
    public static void main(String[] args) {
        
        double value = 37.0;

        
        System.out.println("SQRT: " + Math.sqrt(value));
        System.out.println("SIN: " + Math.sin(value));
        System.out.println("COS: " + Math.cos(value));
        
        double floorValue = 22.76;
        System.out.println("FLOOR: " + Math.floor(floorValue));
        System.out.println("CEIL: " + Math.ceil(floorValue));
        System.out.println("ROUND: " + Math.round(floorValue));

        
        int num1 = 71;
        int num2 = 68;
        System.out.println("MAX: " + Math.max(num1, num2));
        System.out.println("MIN: " + Math.min(num1, num2));

        
        double randomValue = 10 + (Math.random() * (20 - 10));
        System.out.println("RANDOM: " + randomValue);
    }
}
