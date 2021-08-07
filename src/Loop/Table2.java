package Loop;

class Table2 {
    public static void main(String[] args) {
        for(int i =1; i< 10; i++) {
            for (int j = 1; j < 10; j++) {
                int multiple = i * j;
                System.out.printf("%2d * %2d = %2d     ", i, j, multiple);
            }
            System.out.println();
        }
    }
}

