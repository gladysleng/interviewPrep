package com.company;

import java.util.List;

class Main {

    public static void main(String[] args) {

        Main m1 = new Main();
//        m1.kidsWithCandies();
//        m1.numOfStepsToReduceNumToZero();
//        m1.jewelsAndStones();
//        m1.invertBinaryTree();
//        m1.defangingIPAdressTest();
//        m1.smallerNumberThanCurrentTest();
//        m1.substractProductAndSumTest();
//        m1.twoCitiesSchedulingCosts();
//        m1.reverseStringTest();
//        m1.titleToNumberTest();
//        m1.longestPalindromeTest();
 //       m1.numbersWithSameConsecutiveDifferencesTest();
//        m1.longestTimeForGivenDigitsTest();
//        m1.returnSmallestPositiveInt();
//        m1.numOfStepsReduceToZeroFromBinaryTest();
 //       m1.returnTheMaxTest();
        m1.sunkenShipsTest();
    }

    public void kidsWithCandies() {
        kidsWithCandies test1 = new kidsWithCandies();
        int[] array = {12, 1, 1, 1, 12};
        int extraCandies = 10;
        List<Boolean> results = test1.findGreatestNumberOfCandies(array, extraCandies);
        for (boolean i : results) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    public void numOfStepsToReduceNumToZero() {
        numOfStepsToReduceNumToZero test = new numOfStepsToReduceNumToZero();

        int i = 1;
 //       int numOdd = 123;
 //       int zero = 0;

        String binString = Integer.toBinaryString(i);
        System.out.println(binString);
        System.out.println(test.numberOfSteps(i));
 //       System.out.print(", Odd Number: " + test.numberOfSteps(numOdd));
 //       System.out.println(", Zero Number: " + test.numberOfSteps(zero));
    }

    public void jewelsAndStones() {
        jewelsAndStones test = new jewelsAndStones();
        String j = "aA";
        String s = "aAAbbbb";
        System.out.print("[j : " + j + " and  s : " + s + "], ");
        System.out.print("Number of j in s is : " + test.numJewelsInStonesFasterVersion(j, s));
    }

    public void invertBinaryTree() {
        InvertBinaryTree invert1 = new InvertBinaryTree();
        TreeNode binaryTree = new TreeNode(4);
        binaryTree.left = new TreeNode(2);
        binaryTree.right = new TreeNode(7);
        binaryTree.left.left = new TreeNode(1);
        binaryTree.left.right = new TreeNode(3);
        binaryTree.right.left = new TreeNode(6);
        binaryTree.right.right = new TreeNode(9);
        System.out.println();
        System.out.print("Preorder Binary tree: ");
        invert1.printPreOrder(binaryTree);
        System.out.println();
        invert1.printPreOrder(invert1.invertTree(binaryTree));

    }

    public void defangingIPAdressTest(){
        defangingIPAddress df = new defangingIPAddress();
        System.out.println();
        System.out.println(df.defangIPaddr("1.1.2"));

    }

    public void smallerNumberThanCurrentTest(){
        smallerNumberThanCurrent smallerNumThanCurrent = new smallerNumberThanCurrent();
        int[] array = {8,1,2,2,3};
        int[]arr2 = {1};
        int [] arr3 = {};
        int [] arr4 = {1,1};
        smallerNumThanCurrent.smallerNumbersThanCurrent(array);
        smallerNumThanCurrent.smallerNumbersThanCurrent(arr2);
        smallerNumThanCurrent.smallerNumbersThanCurrent(arr3);
        smallerNumThanCurrent.smallerNumbersThanCurrent(arr4);
    }

    public void substractProductAndSumTest(){
        int a = 234;
        subtractProductAndSum test = new subtractProductAndSum();
        test.subtractProductAndSum(a);
    }

    public void twoCitiesSchedulingCosts(){
        int [][] arr = {{10,20},{30,200},{400,50},{30,20}};
        twoCitiesSchedulingCosts test = new twoCitiesSchedulingCosts();
        test.twoCitySchedCost(arr);
    }

    public void reverseStringTest(){
        reverseString test = new reverseString();
        char [] a = {'s','t','r','i','n','g'};
        char [] b = {'d','i','r','e','c','t','i','o','n','a','l'};
        test.reverseString(a);
        test.reverseString(b);
    }

    public void randomPickWithWeightTest(){
        int [] w = {};
        randomPickWithWeight test = new randomPickWithWeight(w);
        System.out.println(test.pickIndex());

    }

    public void queueReconstructionTest(){
        queueReconstructionByHeight t = new queueReconstructionByHeight();
        int [][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        t.reconstructQueue(people);
    }

    public void titleToNumberTest(){
        titleToNumber t = new titleToNumber();
        String a = "A";
        String b = "ZY";
        System.out.println(t.titleToNumber(a));
        System.out.println(t.titleToNumber(b));
    }

    public void longestPalindromeTest(){
        LongestPalindrome t = new LongestPalindrome();
        String a = "bbbaa";
        System.out.println(t.LongestPalindrome(a));
    }

    public void numbersWithSameConsecutiveDifferencesTest(){
        NumbersWithSameConsecutiveDifferences t = new NumbersWithSameConsecutiveDifferences();
        t.numsSameConsecDiff(2,1);

    }

    public void longestTimeForGivenDigitsTest(){
        LongestTimeForGivenDigits t = new LongestTimeForGivenDigits();
        int [] digits  = {1,2,3,4};
        System.out.println(t.largestTimeFromDigits(digits));

    }

    public void returnSmallestPositiveInt(){
        ReturnSmallestPositiveInt t = new ReturnSmallestPositiveInt();
        int [] A = {};
        System.out.println(t.returnSmallestPositiveInt(A));
    }

    public void numOfStepsReduceToZeroFromBinaryTest(){
        numOfStepsReduceToZeroFromBinary t = new numOfStepsReduceToZeroFromBinary();
        String binary = "0";
        System.out.println("binary steps: " + t.numOfStepsReduceToZeroFromBinary(binary));

    }

    public void returnTheMaxTest(){
        returnTheMaximumAmongOneDigitNum t = new returnTheMaximumAmongOneDigitNum();
        int [] a = {-10,-30,-40,0,4,9};  // return 9
        int [] b = {0,-10,-11,-12,-2}; //return 0
        int [] c = {1,1,1,1,2,-8,};// return 2
        int [] d = {-4,-3,-1,-9}; // return -1
        int [] e = {1,6,2,8}; // return 8
        int [] f = {0};// return 0

        System.out.println(t.returnTheOneDigitMax(a));
        System.out.println(t.returnTheOneDigitMax(b));
        System.out.println(t.returnTheOneDigitMax(c));
        System.out.println(t.returnTheOneDigitMax(d));
        System.out.println(t.returnTheOneDigitMax(e));
        System.out.println(t.returnTheOneDigitMax(f));
    }

    public void sunkenShipsTest(){
        sunkenShips t = new sunkenShips();
        System.out.println(t.solution(12, "1A 2B,12A 12A", "12A 1A 2A"));
    }

}
