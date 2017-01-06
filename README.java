package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int iSwitch = 1;
		Scanner sGet = new Scanner(System.in);
		//
		{
			int aArray[] = new int[101];
			int iGetValueA = 0;
			int	iGetValueB = 0;
			int iCount =0;
			//输入
			OUT:
			do
			{
				for(int i=0;i<10;i++)
				{
				
					iGetValueA = sGet.nextInt();
					iGetValueB = sGet.nextInt();
					if(iGetValueA>-101 || iGetValueA<101)
					{
						//System.out.println("" +iGetValueA+"/"+iGetValueB );
						aArray[iGetValueA] += iGetValueB;
						if( iGetValueA == 0)
						{
							iCount++;
							if(iCount == 2)
							{
								break OUT;
							}
						}
						
					}
					else
					{
						System.out.println("mi xiaoyu 0");
					}

				}			
				
			}while(true);
			String sAnswer = "";
			boolean bEmpty = true;
			for(int mi = aArray.length - 1;mi>=0;mi--)
			{
				//某一位系数!=1
				if(aArray[mi]!=0)
				{
					if(bEmpty)
					{
						bEmpty = false;
					}
					else if(aArray[mi]>0)
					{
						sAnswer +="+";
					}
				
					if(mi > 1)
					{
						if(aArray[mi] == 1)
						{
							sAnswer = sAnswer + "x" + mi;
						}
						else if(aArray[mi] == -1)
						{
							sAnswer = sAnswer + "-x" + mi;
						}
						else
						{
							sAnswer = sAnswer + aArray[mi] + "x" + mi;
						}

					}
					else if( mi ==1)
					{
						

						if(aArray[mi] == 1)
						{
							sAnswer = sAnswer + "x" ;
						}
						else if(aArray[mi] == -1)
						{
							sAnswer = sAnswer + "-x";
						}
						else
						{
							sAnswer = sAnswer + aArray[mi] + "x" ;
						}
					}
					else if( mi ==0)
					{					
							sAnswer = sAnswer + aArray[mi];
					}
					
				}
			}
			if(sAnswer == "")
			{
				sAnswer = "0";
			}
			System.out.println(sAnswer);
		}
		//
	}

}
