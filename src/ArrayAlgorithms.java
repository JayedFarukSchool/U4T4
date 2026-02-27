public class ArrayAlgorithms {
    public static double average(int[] numList) {
        double avg = 0.0;
        for (int i = 0; i < numList.length; i++) {
            avg += numList[i];
        }
        return (avg / numList.length);
    }

    public static int minimum(int[] numList) {
        int min = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < min) min = numList[i];
        }
        return min;
    }

    public static int howManyContain(String[] strList, String target) {
        int count = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].contains(target)) count++;
        }
        return count;
    }

    public static String[] stringToArray(String myStr) {
        String[] arr = new String[myStr.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = myStr.substring(i, i + 1);
        }
        return arr;
    }

    public static void reversePrint(String[] wordList) {
        String[] s = new String[wordList.length];
        for (int i = wordList.length - 1; i >= 0; i--) {
            String p = wordList[i];
            String q = "";
            for (int j = p.length(); j > 0; j--) {
                q += p.substring(j - 1, j);
            }
            s[i] = q;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int num = arr1.length + arr2.length;
        int[] arr3 = new int[num];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else arr3[i] = arr2[i - arr1.length];
        }
        return arr3;
    }

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] n = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            n[i] = numList[i] * multiplier;
        }
        return n;
    }

    public static void shiftLeft(int[] numList) {
        int n = numList[0];
        for (int i =0; i< numList.length; i++){
            if (i == numList.length-1) numList[i] = n;
            else numList[i] = numList[i+1];
        }
    }

}
