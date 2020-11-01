package com.durgesh.test;

import java.util.Arrays;

class Box implements Comparable<Box>
{
	int h,l,w,area;
	Box(int h,int l,int w)
	{
		this.h = h;
		this.l = l;
		this.w = w;
	}
	
	
	@Override
	public String toString() {
		return "Box [h=" + h + ", l=" + l + ", w=" + w + ", area=" + area + "]";
	}


	@Override
	public int compareTo(Box o) {
		
		return o.area - this.area;
	}
}


public class BoxStacking {

	public static void main(String[] args) {
		Box box[] = new Box[4];
		box[0] = new Box(4,6,7);
		box[1] = new Box(1,2,3);
		box[2] = new Box(4,5,6);
		box[3] = new Box(10,12,32);
        System.out.println(boxStackingUtil(box,4));
	}

	public static int boxStackingUtil(Box[] box, int n) {
		int l = n*3;
		Box b[] = new Box[l];
		for(int i=0;i<n;i++)
		{
			b[3*i] = new Box(box[i].h ,Math.max(box[i].l, box[i].w),Math.min(box[i].l, box[i].w));
			b[3*i+1] = new Box(box[i].l ,Math.max(box[i].h, box[i].w),Math.min(box[i].h, box[i].w));
			b[3*i+2] = new Box(box[i].w ,Math.max(box[i].l, box[i].h),Math.min(box[i].l, box[i].h));
		}
		
		/*for(int i=0;i<l;i++)
			System.out.println(b[i]);*/
		
		for(int i=0;i<l;i++)
		{
			
			b[i].area = b[i].l*b[i].w;
		}
		/*for(int i=0;i<l;i++)
			System.out.println(b[i]);*/
		Arrays.sort(b);
		for(int i=0;i<l;i++)
			System.out.println(b[i]);
		int res[] = new int[l];
		Arrays.fill(res,0);
		for(int i=0;i<l;i++ )
		{
			int val = 0;
			Box bb = b[i];
			for(int j=0;j<i;j++)
			{
				Box pb = b[j];
				if(pb.w > bb.w && pb.l > bb.l)
					 val = Math.max(val, res[j]);
			}
			res[i]  = val + bb.h;
		}
		
		int result =-1;
		for(int i=0;i<l;i++)
			 result = Math.max(result,res[i]);
		return result;
	}

}
