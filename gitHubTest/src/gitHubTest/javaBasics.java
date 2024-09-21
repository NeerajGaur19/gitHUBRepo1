package gitHubTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaBasics {

	public static void main(String[] args) {

//***************************************Data type******************************************************
		
		int iNum = 5;
		String strTest = "Testing";
		String strNum = strTest + " Value is " +  iNum ;
		System.out.println(strNum);
		
		boolean boolVar = true;
		System.out.println(boolVar);
		
		//Arrays
		int[] arrRank = new int[3];
		arrRank[0] = 1;
		arrRank[1] = 2;
		arrRank[2] = 3;
		
		//int[] arrR = {1,2,3};
		
//***************************************For loop******************************************************
		
		for (int i=0;i<arrRank.length;i++)
		{
			System.out.println(arrRank[i]);
		}
		
		
		String[] arrName = {"neeraj","Ajay","raj"};
				
		for (int i=0;i<arrName.length;i++)
		{
			System.out.println(arrName[i]);
		}
		
		
		for (int num : arrRank)
		{
			System.out.println(num);
		}
		
		
		for (String s : arrName)
		{
			System.out.println(s);
		}
		
//*******************************If Else**************************************************************
		
		int[] intArrayNum = {1,2,3,4,8,10,122,135};
		
		for (int i=0;i<intArrayNum.length;i++)
		{
			if (intArrayNum[i]<=40)
			{
				System.out.println("value less than 40 is " + intArrayNum[i]);
				continue;
			}
			else
			{
				System.out.println("value greater than 40 is " + intArrayNum[i]);
			}
		}
		
		
		System.out.println("**************************************");
	
		
//*******************************Array Lists**************************************************************
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Neeraj");
		arrList.add("Sanjay");
		arrList.add("Amit");

		System.out.println("value is " + arrList.get(2));

		for (int i=0;i<arrList.size();i++)
		{
			System.out.println(arrList.get(i));
		}
		
		System.out.println(arrList.contains("Neeraj"));
		
		for (String s : arrList)
		{
			System.out.println(s);
		}
		
		System.out.println("**************************************");
		
		//convert Array into ArrayList
		
		/* int[] intArrNum = {2,5,8};
		List<int[]> convertedArrIntList = Arrays.asList(intArrNum);
		
		for(int i=0;i<convertedArrIntList.size();i++)
		{
			System.out.println(convertedArrIntList.get(i));
			System.out.println("******");
		}*/
		
		//System.out.println("*****************");
		
		String[] strArr = {"Neeraj","Ajay","Yash"};
		
		List<String> convertedArrStrList = Arrays.asList(strArr);
		
		for(int i=0;i<convertedArrStrList.size();i++)
		{
			System.out.println(convertedArrStrList.get(i));
		}
		
		//**********************************************************************
		
		//String s = "Neeraj1";
		//String s1 = "Neeraj";
		
		String objStr = new String("I AM POSSIBLE");
		
		System.out.println(objStr);
		
		String[] strSplit = objStr.split(" ");
		
		System.out.println("'" + strSplit[1] + "'");
		
		for(int i=0;i<objStr.length();i++)
		{
			System.out.println(objStr.charAt(i));
		}
						
		//**********************************************************************
		
	}
}

