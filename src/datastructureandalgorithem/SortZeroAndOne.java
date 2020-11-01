package datastructureandalgorithem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SortZeroAndOne {

	public static void main(String[] args) {
		int a[]={0,0,1,1,0,1,0,0,1,1};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] ==0)
			{
				int temp =a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			}
		}
       for(int i=0;i<a.length;i++)
    	   System.out.print(a[i] +" ");
       
       
       int b[] = {1,1,2,2,0,0,1,2,0,0,2,1,1,2,0};
       int low=0,mid=0,high=b.length-1;
       while(mid<=high)
       {
    	   if(b[mid] == 0)
    	   {
    		   b[mid] = b[mid]+b[low];
    		   b[low] = b[mid]-b[low];
    		   b[mid] = b[mid]-b[low];
    		   low++;
    		   mid++;
    	   }
    	   else if(b[mid] ==1)
    	   {
    		   mid++;
    	   }
    	   else{
    		   b[mid] = b[mid]+b[high];
    		   b[high] = b[mid]-b[high];
    		   b[mid] = b[mid]-b[high];
    		   high--;
    	   }
       }
       
       System.out.println();
       for(int i=0;i<b.length;i++)
    	   System.out.print(b[i] +" ");
       
       String name1 = new String("Pranshu");
       
       List<Integer> list1 = new ArrayList<>();
       list1.addAll(Arrays.asList(1,5, 3, 4));
       AtomicInteger ai = new AtomicInteger();
       List<Integer> collect = list1.stream()
                                    .map(ai::addAndGet)
                                    .collect(Collectors.toList());
       System.out.println();
       System.out.println(collect); // [1, 3, 6, 10]
       
	}

}
