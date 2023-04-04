/**
@Order Messages DOS OS 1.1
*/

import java.util.*;
public class orderMsges
{
	public static void main(String [] args)
	{	
		Scanner ipt = new Scanner(System.in);
		//调用类
		
		int co; //功能选择变量
		int order = 1;//功能1控制变量
		int see = 1;//功能2控制变量
		int back = 1;//功能5控制变量
		int cleck =1;//功能3控制变量
		int del = 1;//功能4控制变量
		String dishName [] = {"红烧带鱼","鱼香肉丝","时令蔬菜"};//菜单名称
		double dishSal [] = {38,20,10};//对应的价格
		String odName;//订餐人姓名
		int odNum;//点餐序号
		int ods;//点餐数量
		int orderTime;//点餐时间
		int timeFlag = 1;//点菜时间控制变量
		String orderAdders;//点菜地址
		double sum = 0;//点菜总价格
		double sums = 0;//点菜总价格+外带
		String names [] = new String[4];//用户数组
		String dishMsg [] = new String[4];//信息数组
		int Times [] = new int[4];//订单时间数组
		String address [] = new String[4];//订单地址数组
		double sumsal [] =  new double[4];//订单总价数组
		int status [] = new int [4];//订单状态数组
		String pj = "";//拼接字符串变量
		String exit;//退出控制变量
		int ffl = 1;//系统循环变量
		int good []= {0,0,0};//点赞数组
		int nn;//点赞序号
		int flag =1;//数组溢出提示变量
		int cleckNum;//提取输入签收值
		int dels;//获取删除编号
		names[0] = "张晴";
		names[1] = "张晴";
		dishMsg[0] = "红烧带鱼2份";
		dishMsg[1] = "鱼香肉丝2份";
		Times[0] = 12;
		Times[1] = 18;
		address[0] = "天成路207号";
		address[1] = "天成路207号";
		sumsal[0] = 76;
		sumsal[1] = 26;
		status[0] = 1;
		status[1] = 0;
		//初始化
		
		/*定义变量*/
		/*********************************************************/
		/*执行语句*/
		
		System.out.println("欢迎使用+-*/订餐系统");
		System.out.println("********************");
		do
		{
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("********************");
			System.out.print("请选择功能：");
			order=1;
			see=1;
			back=1;
			cleck=1;
			del=1;
			//控制变量全部开启
			co=ipt.nextInt();
			
			for(int i=0;i<names.length;i++)
			{
				if(names[i]==null)
				{
					flag = 1;
				}
			}
			
			if(names[0]!=null&&names[1]!=null&&names[2]!=null&&names[3]!=null)
			{
				flag = 0;
			}
			
			if(flag==0&&co==1)
			{
				co = 10;
				System.out.println("正忙");
			}
			
			switch(co)
			{
				case 1:
					while(order==1)
					{
						//显示菜单
						sums=0;
						sum=0;
						pj = "";
						System.out.println("**我要订餐**");
						System.out.print("请输入订餐人姓名:");
						odName = ipt.next();
						System.out.println("序号\t菜名\t单价\t点赞量");
						for(int i =0;i<dishName.length;i++)
						{	
							System.out.print((i+1)+"."+"\t");
							System.out.print(dishName[i]+"\t");
							System.out.print(dishSal[i]+"元\t");
							System.out.println(good[i]);
						}
						System.out.print("请选择您要点菜的序号:");
						odNum = ipt.nextInt();
						System.out.print("请选择您要点菜的数量:");
						ods = ipt.nextInt();
						timeFlag=1;
						while(timeFlag==1)
						{
							System.out.print("请输入送餐时间:");
							orderTime = ipt.nextInt();
							if(orderTime<20&&orderTime>10)
							{
								System.out.print("请输入送餐地点:");
								orderAdders = ipt.next();
								System.out.println("订餐成功！");
								System.out.println("您订的是:"+dishName[odNum-1]);
								System.out.println(ods+"份");
								System.out.println("送餐地点是:"+orderAdders);
								System.out.println("送餐时间是:"+orderTime);
								pj = dishName[odNum-1]+ods+"份";
								sum = (ods*dishSal[odNum-1]);
								if(sum>=50)
								{	
									sums = sum+0;
									System.out.println("餐费:"+sum+"元，送餐费用0.0元，总计"+sums+"元");
									timeFlag=0;
									
									//值导入数组
									for(int i=0;i<names.length;i++)
									{
										if(names[i]==null)
										{
											names[i] = odName;
											
											dishMsg[i] = pj;
											
											Times[i] = orderTime;

											address[i] = orderAdders;
											
											sumsal[i] = sums;
										
											status[i] = 0;
											break;
											
										}
									}
									
									System.out.print("输入0返回");
									order = ipt.nextInt();
									
									

	
								}
								else
								{	
									sums = sum+5;
									System.out.println("餐费:"+sum+"元，送餐费用5.0元，总计"+sums+"元");
									timeFlag=0;
									
									//值导入数组
									for(int i=0;i<names.length;i++)
									{
										if(names[i]==null)
										{
											names[i] = odName;
											
											dishMsg[i] = pj;
											
											Times[i] = orderTime;

											address[i] = orderAdders;
											
											sumsal[i] = sums;
										
											status[i] = 0;
											break;
											
										}
									}
									
									System.out.print("输入0返回");
									order = ipt.nextInt();
								}
							}
							else
							{
								System.out.print("输入的时间不在范围内，重试");
								timeFlag=1;
							}
						}
						
						
					}
				break;
				
				case 2:
					System.out.print("**查看餐袋**");
					while(see==1)
					{
						System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态\t");
						for(int i=0;i<names.length;i++)
						{
							if(names[i]!=null)
							{	
								String stat;
								System.out.print((i+1)+"\t");
								System.out.print(names[i]+"\t");
								System.out.print(dishMsg[i]+"\t");
								System.out.print(Times[i]+"\t");
								System.out.print(address[i]+"\t");
								System.out.print(sumsal[i]+"元"+"\t");
								if(status[i]==0)
								{
									stat = "预定";
								}
								else
								{
									stat = "完成";
								}
								System.out.println(stat+"\t");
							}
						}
						System.out.print("输入0返回");
						see = ipt.nextInt();
					}
				break;
				
				case 3:
					System.out.print("**签收订单**");
					while(cleck==1)
					{
						System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态\t");
						for(int i=0;i<names.length;i++)
						{
							if(names[i]!=null&&status[i]==0)
							{	
								String stat;
								System.out.print((i+1)+"\t");
								System.out.print(names[i]+"\t");
								System.out.print(dishMsg[i]+"\t");
								System.out.print(Times[i]+"\t");
								System.out.print(address[i]+"\t");
								System.out.print(sumsal[i]+"元"+"\t");
								if(status[i]==0)
								{
									stat = "预定";
								}
								else
								{
									stat = "完成";
								}
								System.out.println(stat+"\t");
							}
						}

						
						System.out.print("输入要签收的订单号,若没有请输入0来退出");
						cleckNum = ipt.nextInt();
						
						
						for(int i=0;i<names.length;i++)
						{
							if(names[i]!=null &&  status[i]==0 && cleckNum==i+1 )
							{
								status[i]=1;
								System.out.println("签收成功");
							}
							else if(names[i]!=null &&  status[i]==1 && cleckNum==i+1 )
							{
								System.out.println("不可重复签收");
							}
						}
						
						
						
						if(cleckNum==0)
						{
							System.out.println("已返回");
							cleck = 0;
						}
						else
						{
							System.out.print("输入0返回");
							cleck = ipt.nextInt();
						}
					}
				break;
				
				case 4:
					while(del==1)
					{
						System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态\t");
						for(int i=0;i<names.length;i++)
						{
							if(names[i]!=null&&status[i]==1)
							{	
								String stat;
								System.out.print((i+1)+"\t");
								System.out.print(names[i]+"\t");
								System.out.print(dishMsg[i]+"\t");
								System.out.print(Times[i]+"\t");
								System.out.print(address[i]+"\t");
								System.out.print(sumsal[i]+"元"+"\t");
								if(status[i]==0)
								{
									stat = "预定";
								}
								else
								{
									stat = "完成";
								}
								System.out.println(stat+"\t");
							}
						}
						System.out.print("输入要删除的订单号,若没有请输入0来退出");
						dels = ipt.nextInt();
						for(int i=0;i<names.length;i++)
						{
							if(names[i]!=null &&  status[i]==1 && dels==i+1)
							{
								
								for(int j=dels-1;j<names.length-1;j++)
								{
									names[j]=names[j+1];
									dishMsg[j]=dishMsg[j+1];
									Times [j]=Times[j+1];
									sumsal[j]=sumsal[j+1];
									status[j]=status[j+1];
									address[j]=address[j+1];
								}
								names[names.length-1-1] = null;
								dishMsg[names.length-1-1] = null;
								Times[names.length-1-1] = 0;
								address[names.length-1-1] = null;
								sumsal[names.length-1-1] = 0;
								status[names.length-1-1] = 0;
								System.out.print("已删除");
							}
							else if(names[i]!=null &&  status[i]==0 && dels==i+1)
							{
								System.out.println("不能删除没有的订单");
							}
						}
						
						
						if(dels==0)
						{
							System.out.println("已返回");
							del = 0;
						}
						else
						{
							
							System.out.print("输入0返回");
							del = ipt.nextInt();
						}
					}
				break;
				
				case 5:
					while(back==1)
					{
					System.out.println("序号\t菜名\t点赞量");
					for(int i =0;i<dishName.length;i++)
					{	
						System.out.print((i+1)+"."+"\t");
						System.out.print(dishName[i]+"\t");
						System.out.println(good[i]);
					}
					System.out.print("请输入要点赞的序号");
					nn = ipt.nextInt();
					for(int i=0;i<good.length;i++)
					{
						if((nn-1)==i)
						{
							good[i]++;
						}
					}
					System.out.print("完成点赞");
					System.out.print("输入0返回");
					back = ipt.nextInt();
					}
				break;
					
				case 6:
					System.out.print("确定要退出吗(y/n)");
					exit = ipt.next();
					if("y".equals(exit))
					{
						ffl=0;
						System.out.print("下次再见");
					}
					else
					{
						ffl=1;
					}
				break;
				
				default :
					System.out.print("错误，请重新输入任意数字后重试");
					co = ipt.nextInt();
				break;
			}
		}
		while(ffl==1);
	}
}