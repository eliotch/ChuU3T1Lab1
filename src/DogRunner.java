public class DogRunner {
    public static void main(String args[]){
        /* NOTE! When you create a new object with the new
   operator, it’s a different object in memory from
   any other objects already created -- even if
   instance variables happen to be the same */

        Dog dog1 = new Dog("Spot", 10, false);
        Dog dog2 = new Dog("Petunia", 12, true);
        Dog dog3 = new Dog("Lucky", 3, false);
        Dog dog4 = new Dog("Spot", 5, true);
        Dog dog5 = new Dog("Petunia", 12, true);

        System.out.println("-- Set A --");
        System.out.println(dog1 == dog2);
        System.out.println(dog1 == dog3);
        System.out.println(dog1 == dog4);
        System.out.println(dog2 == dog5);

        // create new reference variables dog6, dog7, dog8
        Dog dog6 = dog1;
        Dog dog7 = dog2;
        Dog dog8 = dog6;

        System.out.println("-- Set B --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);

        dog1 = null;
        System.out.println("-- Set C --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);
        System.out.println(dog1 == null);
        System.out.println(dog6 != dog8);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
        System.out.println(dog6);
        System.out.println(dog7);
        System.out.println(dog8);
        int a = 15;
        int b = 15;
        int c = 20;
        System.out.println("-- Set A --");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println("-- Set B --");
        System.out.println(a > c);
        System.out.println(a < c);
        System.out.println(a >= c);
        System.out.println(a <= c);

        System.out.println("-- Set C --");
        System.out.println((a >= 15) == (c > b));
        System.out.println((b < c) == (a < b));
        System.out.println((a == c) == (b == c));
        System.out.println((a == b) == (b == c));
        final int VOTING_AGE = 18;
        final int DRIVING_AGE = 16;

        int myAge = 17;

        boolean canVote = (myAge >= VOTING_AGE);
        boolean canDrive = (myAge >= DRIVING_AGE);

        System.out.println("I can vote: " + canVote);
        System.out.println("I can drive: " + canDrive);

        int yourAge = 18;

        boolean sameAge = (myAge == yourAge);
        System.out.println("We're the same age: " + sameAge);

        int num1 = 13;
        boolean isEven = (num1 % 2 == 0);
        System.out.println(num1 + " is even: " + isEven);

        boolean weird = (num1 <= 15) == (yourAge > 20);
        System.out.println(weird);


    }
}
