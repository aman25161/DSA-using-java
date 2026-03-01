import java.util.*;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=0,r=n-1;
        mergeSort(arr,p,r);
        System.out.println("Array after sort is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[] arr,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }
    public static void merge(int arr[],int p,int q,int r){
        int idx1=p;
        int idx2=q+1;
        int x=0;
        int merged[] = new int[r-p+1];
        while(idx1<=q && idx2<=r){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=q){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=r){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        int a=p;
        for(int i=0;i<merged.length;i++){
            arr[a]=merged[i];
            a++;
        }
    }
}
