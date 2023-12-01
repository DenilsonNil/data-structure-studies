package br.com.kualit.algorithms;

public class WindowSliding {

    public int[] maxValue(int[] nums) {
        int maiorSoma = Integer.MIN_VALUE;
        int indiceMaiorSoma = -1;

        for (int i = 0; i <= nums.length - 3; i++) {
            int teste = nums.length - 3;
            int somaAtual = nums[i] + nums[i + 1] + nums[i + 2];

            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
                indiceMaiorSoma = i;
            }
        }
        return new int[]{indiceMaiorSoma, maiorSoma};
    }
}
