public class SelectionSort {
    public static void main(String[] args) {
        int employeeIDs[] = {4,1,5,3,2};

        for(int i=0;i<employeeIDs.length-1;i++){
            int smallestIx = i;
            for(int j=i+1;j<employeeIDs.length;j++){
                if(employeeIDs[smallestIx]>employeeIDs[j]){
                    smallestIx = j;
                }
            }

            int temp = employeeIDs[smallestIx];
            employeeIDs[smallestIx] = employeeIDs[i];
            employeeIDs[i]=temp;
        }

        for(int i=0;i<employeeIDs.length;i++){
            System.out.print(employeeIDs[i] +" ");
        }
    }
}
