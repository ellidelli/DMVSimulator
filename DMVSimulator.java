public class DMVSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV");
        int number = 1 + (int)(Math.random() * ((200 - 1) + 1));
        System.out.println("Your number: " + number);
        int called = number + 1;
       
        while (called != number) {
            if (called > 200) {
                called = 1;
            }
            System.out.print(called + ", ");
            called += 1;
        }
        System.out.println(number);

        int chance = 1 + (int)(Math.random() * ((100 - 1) + 1));
        if (chance == 5) {
            System.out.println("You have your paperwork, you are all set.");
        } else {
            System.out.println("Whoops, you don't have the correct paperwork, you stupid idiot! Get your life together! MUAHAHAH AHAHAHA AHAHAHA");
        }
    }
}