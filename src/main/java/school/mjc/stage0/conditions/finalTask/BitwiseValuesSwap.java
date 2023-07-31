package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second; // XOR to get the intermediate result
        second = first ^ second; // XOR with second to get the original value of first
        first = first ^ second;// XOR with first to get the original value of second

        System.out.println(first);
        System.out.println(second);
    }
}
