import java.util.ArrayList;

// this is a test

public class sp2 {

	static ArrayList<Integer> posrow = new ArrayList<Integer>();
	static ArrayList<Integer> poscol = new ArrayList<Integer>();
	static ArrayList<Integer> value = new ArrayList<Integer>();
	static ArrayList<Integer> frow = new ArrayList<Integer>();
	static ArrayList<Integer> fcol = new ArrayList<Integer>();
	static ArrayList<Integer> fvalue = new ArrayList<Integer>();
	static ArrayList<Integer> saddle = new ArrayList<Integer>();

	static boolean b = true;
	
	public static void highestrows(int[][] arr)
	{
		
		
		for(int j = 0; j < arr.length; j++)
		{
			
			int greatest = Integer.MIN_VALUE;
			int c = Integer.MIN_VALUE;
			int r = Integer.MIN_VALUE;
		for(int i = 0; i < arr[0].length; i++)
		{
			if(greatest < arr[j][i])
			{
				greatest = arr[j][i];
				c = i;
				r = j;
			}
			
		}
		posrow.add(r);
		poscol.add(c);
		value.add(greatest);
		for(int k = 0; k < arr[0].length; k++)
		{
			if((arr[j][k] == greatest) && !(c == k))
			{
				posrow.add(j);
				poscol.add(k);
				value.add(greatest);
			}
		}
		}
	}
	
	public static void lowestcols(int[][] arr)
	{
		
		
		for(int i = 0; i < arr.length; i++)
		{
			
			int lowest = Integer.MAX_VALUE;
			int c = Integer.MIN_VALUE;
			int r = Integer.MIN_VALUE;
		for(int j = 0; j < arr[0].length; j++)
		{
			if(lowest > arr[j][i])
			{
				lowest = arr[j][i];
				c = i;
				r = j;
			}
			
		}
		frow.add(r);
		fcol.add(c);
		fvalue.add(lowest);
		for(int k = 0; k < arr[0].length; k++)
		{
			if((arr[k][i] == lowest) && !(r == k))
			{
				frow.add(k);
				fcol.add(i);
				fvalue.add(lowest);
			}
		}
		}
	}
	
	public static void compare()
	{
		for(int i = 0; i < value.size(); i++)
		{
			int x = posrow.get(i);
			int y = poscol.get(i);
			for(int j = 0; j < fvalue.size(); j++)
			{
				if((x == frow.get(j)) && (y == fcol.get(j)))
				{
					
					saddle.add(fcol.get(j));
					saddle.add(frow.get(j));
				}
			}
		}
		if(saddle.size() == 0)
		{
			System.out.println("No saddle points");
		}
		else
		{
			System.out.println(saddle);
		}
	}
	
	
	public static void main(String[] args)
	{
		int z = 5;
		int[][] ar = new int[z][z];
		
		for(int i = 0; i < z; i++)
		{
			for(int j = 0; j < z; j++)
			{
				int a = (int) Math.floor(Math.random() * 5);
				ar[i][j] = a;
			}
		}
		
		highestrows(ar);
	lowestcols(ar);
	compare();
//		System.out.println(value);
//		System.out.println(posrow);
//		System.out.println(poscol);
//	System.out.println(fvalue);
//		System.out.println(frow);
//		System.out.println(fcol);
//		System.out.println(poscol);
	//System.out.println(saddle);
		for(int i = 0; i < z; i++)
		   {
		      for(int j = 0; j < z; j++)
		      {
		         System.out.printf("%5d ", ar[i][j]);
		      }
		      System.out.println();
		      //h
		      
		   }
		
		System.out.println("testinga");
	}
	
	
}
