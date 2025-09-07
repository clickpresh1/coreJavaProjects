import java.util.Scanner;

public class DogBreed {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = Integer.valueOf(scanner.nextLine());
        breed(num);
        scanner.close();
    } 

    public static String breed(int num) {
        String result = (num == 1) ? "German Shepherd" : "Other breeds";
        System.out.println(result);
        return result;
    }
}
