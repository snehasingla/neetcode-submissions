class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int[][] pair = new int[position.length][2];


        for(int i=0;i<position.length;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b)->b[0] - a[0]);

        int fleet=1;
        double prevtime = (double)(target-pair[0][0]) / pair[0][1];

        for(int i=1;i<position.length;i++){
            double currtime = (double)(target-pair[i][0]) / pair[i][1];
            if(currtime > prevtime){
                fleet++;
                prevtime = currtime;
            }
        }
        return fleet;
    }
}
