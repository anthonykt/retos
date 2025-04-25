package dev.anthony;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = { 1, 3, 4, 1 };
        int target = 7;

        int[] resultado = twoSum(nums, target);
        if (resultado != null) {
            System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No es encontro una solucion.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }

        return null;
    }
}
