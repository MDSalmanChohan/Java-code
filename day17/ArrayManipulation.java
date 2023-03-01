public class ArrayManipulation {

    public static void main(String ir[]) {

        ArrayManipulation am = new ArrayManipulation();
        // chhoteArrayKoBadeArraymeDaalo();
        am.teenArray();
        // badeArrayKo2ChhoteArraymeDaalo();

        // copyArray();

        // arrayKeSaareNumber100seBadhaDo();

        // arrayKoRevereKaro();

        // oddEvenChildArraySeparateKaro();

        // 3 child k arre bnao
        // 50SeChoteNumberKoBadeSeSeparateKaro();
        // valueKaAadhaKro();

    }

    void teenArray() {
        int parentArray[] = getMeArray(30);

        int child1[] = new int[10];
        int child2[] = new int[10];
        int child3[] = new int[10];

        int child1Counter = 0, child2Counter = 0, child3Counter = 0;

        System.out.println("\nparent");

        for (int i = 0; i < parentArray.length; i++) {
            if (i < 10) {
                child1[child1Counter] = parentArray[i];
                child1Counter++;
            } else if (i < 20) {
                child2[child2Counter] = parentArray[i];
                child2Counter++;

            } else if (i < 30) {
                child3[child3Counter] = parentArray[i];
                child3Counter++;

            }
            System.out.print(" " + parentArray[i]);

        }

        System.out.println("\nChild 1");
        for (int i = 0; i < child1.length; i++) {
            System.out.print(" " + child1[i]);
        }

        System.out.println("\nChild 2");
        for (int i = 0; i < child2.length; i++) {
            System.out.print(" " + child2[i]);
        }
        System.out.println("\nChild 3");
        for (int i = 0; i < child3.length; i++) {
            System.out.print(" " + child3[i]);
        }

    }

    public static void valueKaAadhaKro() {
        int parentArray[] = getMeArray(12);

        float halfArr[] = new float[12];

        int halfCounter = 0;

        System.out.println("\nfullArray");
        for (int i = 0; i < parentArray.length; i++) {
            halfArr[halfCounter] = (float) parentArray[i] / 2;
            halfCounter++;
            System.out.print(" " + parentArray[i]);
        }

        System.out.println("\nhalf");
        for (int i = 0; i < halfArr.length; i++) {
            System.out.print(" " + halfArr[i]);
        }
    }

    private static void arrayKoRevereKaro() {
        int parentArray[] = getMeArray(14);
        int reveresArr[] = new int[14];

        int reveresCounter = 0;
        System.out.println("\nreverscounting");

        for (int i = parentArray.length - 1; i >= 0; i--) {
            reveresArr[reveresCounter] = parentArray[i];
            reveresCounter++;
            System.out.print(" " + parentArray[i]);

        }
        System.out.println("\nreversecounting");
        for (int j = 0; j <= parentArray.length - 1; j++) {
            System.out.print(" " + reveresArr[j]);

        }
    }

    private static void copyArray() {
        int parentArray[] = getMeArray(8);

        int copyArr[] = new int[8];

        int copyCounter = 0;

        System.out.println("\noriginal");
        for (int i = 0; i < parentArray.length; i++) {
            copyArr[copyCounter] = parentArray[i];
            copyCounter++;
            System.out.print(" " + parentArray[i]);
        }

        System.out.println("\ncopy");
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(" " + copyArr[i]);
        }
    }

    private static void badeArrayKo2ChhoteArraymeDaalo() {
        int parentArray[] = getMeArray(10);

        int child1[] = new int[5];
        int child2[] = new int[5];

        int child1Counter = 0, child2Counter = 0;

        System.out.println("\nparent");

        for (int i = 0; i < parentArray.length; i++) {
            if (i < 5) {
                child1[child1Counter] = parentArray[i];
                child1Counter++;
            } else {
                child2[child2Counter] = parentArray[i];
                child2Counter++;
            }
            System.out.print(" " + parentArray[i]);
        }

        System.out.println("\nChild 1");
        for (int i = 0; i < child1.length; i++) {
            System.out.print(" " + child1[i]);
        }

        System.out.println("\nChild 2");
        for (int i = 0; i < child2.length; i++) {
            System.out.print(" " + child2[i]);
        }
    }

    private static void chhoteArrayKoBadeArraymeDaalo() {
        int child1[] = getMeArray(5);
        int child2[] = getMeArray(5);

        int parentArray[] = new int[10];

        int parentCounter = 0;
        System.out.println("\nchild 1");
        for (int i = 0; i < child1.length; i++) {
            parentArray[parentCounter] = child1[i];
            parentCounter++;
            System.out.print(" " + child1[i]);
        }
        System.out.println("\nchild 2");
        for (int i = 0; i < child2.length; i++) {
            parentArray[parentCounter] = child2[i];
            parentCounter++;

            System.out.print(" " + child2[i]);
        }
        System.out.println("\nparent");
        for (int i = 0; i < parentArray.length; i++) {
            System.out.print(" " + parentArray[i]);
        }
    }

    private static int[] getMeArray(int i) {
        int arr[] = new int[i];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 100);
        }

        return arr;
    }

}