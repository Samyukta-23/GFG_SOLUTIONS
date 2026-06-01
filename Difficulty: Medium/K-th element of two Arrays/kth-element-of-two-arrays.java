class Solution {
    public int kthElement(int a[], int b[], int ka) {
        int[] combined=new int[a.length+b.length];
        int lena=a.length,lenb=b.length;
        int i=0,j=0;
        int k=0;
        while(i<lena && j<lenb){
            if(a[i]<=b[j]){
                combined[k]=a[i];
                i++;
                k++;
            }
            else if(a[i]>b[j]){
                combined[k]=b[j];
                j++;
                k++;
            }
            
        }
        while(i<lena){
            combined[k]=a[i];
            i++;
            k++;
        }
        while(j<lenb){
            combined[k]=b[j];
            j++;
            k++;
        }
        return combined[ka-1];
    }
}