package Arrays;

class TrappedWater {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        
        // Calculate leftMax array
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        
        // Calculate rightMax array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        
        // Calculate trapped water
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {125, 2, 0, 6, 3, 2, 5,351,1,5,4,46,46,46,46,4,64,46,4,64,64,6,654};
        System.out.print("Trapped water is: ");
        System.out.println(trappedRainwater(height));
    }
}
