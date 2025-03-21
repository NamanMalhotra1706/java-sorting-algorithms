public class InsertionSort {
    public static void main(String[] args) {
        int employeeIDs[] = {4,1,5,3,2};

        for(int i=1;i<employeeIDs.length;i++){
            int currentEle = employeeIDs[i];
            int prev = i-1;
            while(prev>=0 && employeeIDs[prev] > currentEle){
                employeeIDs[prev+1] = employeeIDs[prev];
                prev--;
            }
            employeeIDs[prev+1] = currentEle;
        }

        for(int i=0;i<employeeIDs.length;i++){
            System.out.print(employeeIDs[i] +" ");
        }
    }
}
