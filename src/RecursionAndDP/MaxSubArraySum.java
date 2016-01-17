package RecursionAndDP;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] a={-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println(maxSubArraySum(a,0,a.length-1));
    }

    public static int maxSubArraySum(int[] a, int i, int j) {
        if(i==j) {
            return a[0];
        }
        int mid=(i+j)/2;
        return max(maxSubArraySum(a,i,mid), maxSubArraySum(a,i,j,mid), maxSubArraySum(a,mid+1,j));
    }

    private static int maxSubArraySum(int[] a, int i, int j, int mid) {
        int sum=0;
        int leftSum=Integer.MIN_VALUE;
        for(int k=mid;k>=i;k--) {
            sum=sum+a[k];
            if(sum>leftSum) {
                leftSum=sum;
            }
        }
        int sumt=0;
        int rightSum = Integer.MIN_VALUE;
        for(int k=mid+1;k<=j;k++) {
            sumt=sumt+a[k];
            if(sumt>rightSum) {
                rightSum=sum;
            }
        }
        return leftSum+rightSum;
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

    //brute force
    public static int maxSubArraySum(int[] a) {
        int maxSum=Integer.MIN_VALUE;
        int i=0;
        int start=0;
        int end=a.length-1;
        while(i<a.length) {
            int sum=a[i];
            for(int j=i+1;j<a.length;j++) {
                sum=sum+a[j];
                if(sum>maxSum) {
                    start=i;
                    end=j;
                    maxSum=sum;
                }
            }
            i++;
        }
        System.out.println(start+" "+end);
        return maxSum;
    }

    public static boolean isSubArraySum(int[] a, int sumTotal) {
        int maxSum=Integer.MIN_VALUE;
        int i=0;
        int start=0;
        int end=a.length-1;
        while(i<a.length) {
            int sum=a[i];
            for(int j=i+1;j<a.length;j++) {
                sum=sum+a[j];
                if(sum==sumTotal) {
                    start=i;
                    end=j;
                    System.out.println(start+" "+end);
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
