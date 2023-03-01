package leetCode;

public class T8ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1, 1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxSquare = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int currentSquare = findSquare(height, i, j);
                if (currentSquare > maxSquare) {
                    maxSquare = currentSquare;
                }
            }
        }
        return maxSquare;
    }

    public static int findSquare(int[] height, int i, int j) {
        int width = j - i;
        return (height[i] > height[j]) ? (height[j] * width) : (height[i] * width);
    }

//    public static int maxArea(int[] height) {
//        int ans = 0;
//        int i = 0, j = height.length - 1;
//        while (j > i) {
//            ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
//            if (height[i] < height[j]) i++;
//            else j--;
//        }
//        return ans;
//    }
}
