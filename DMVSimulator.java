public class DMVSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV");
        int number = 1 + (int)(Math.random() * ((100 - 1) + 1));
        System.out.println("Your number: " + number);
        int called = number + 1;
       
        while (called != number) {
            if (called > 100) {
                called = 1;
            }
            System.out.print(called + ", ");
            called += 1;
        }
        System.out.println(number);

        System.out.println("Whoops, you don't have the correct paperwork, you stupid idiot! Get your life together! MUAHAHAH AHAHAHA AHAHAHA");
    }
}