package DivisibilityCode;
        public class DivisibilityCounter {
            public static void main(String[] args) {
                for (int i = 100; i >= 1; i--) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("Testing");
                    } else if (i % 3 == 0) {
                        System.out.println("Software");
                    } else if (i % 5 == 0) {
                        System.out.println("Agile");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }

