public class FizzBuzzTest {
    public static void main(String[] args) {
        Number counter = new Number(1);
        int n = 33;

        Thread threadA = new Thread(() -> {
            while(counter.getNumber() <= n) {
                if (counter.processed.get()) continue;

                if (counter.getNumber() % 3 == 0 && counter.getNumber() % 5 != 0) {
                    System.out.print("fizz ");
                    counter.processed.set(true);
                    counter.increment();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            while(counter.getNumber() <= n) {
                if (counter.processed.get()) continue;

                if (counter.getNumber() % 5 == 0 && counter.getNumber() % 3 != 0) {
                    System.out.print("buzz ");
                    counter.processed.set(true);
                    counter.increment();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            while(counter.getNumber() <= n) {
                if (counter.processed.get()) continue;
                if (counter.getNumber() % 15 == 0) {
                    System.out.print("fizzbuzz ");
                    counter.processed.set(true);
                    counter.increment();
                }
            }
        });

        Thread threadD = new Thread(() -> {
            while(counter.getNumber() <= n) {
                if (counter.processed.get()) continue;
                if (counter.getNumber() % 3 != 0 && counter.getNumber() % 5 != 0) {
                    System.out.print(counter.getNumber() + " ");
                    counter.processed.set(true);
                    counter.increment();
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
