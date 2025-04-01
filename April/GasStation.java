// Question link -> https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150




public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost=0;
        int[] diff = new int[gas.length];

        for(int i = 0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            diff[i] = gas[i]-cost[i];
        }

        if(totalGas<totalCost){
            return -1;
        }
        int start=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            total+=diff[i];
            if(total<0){
                total=0;
                start=i+1;
            }
        }

        return start;

    }
}
