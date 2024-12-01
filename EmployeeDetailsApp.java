import java.util.*;
class Employee
{
private Long Id,Contact,Salary;
private int Value;
private String Name,Address,Email;
	public void setId(Long Id)
	{
		this.Id=Id;
	}
	public long getId()
	{
		return Id;
	}
	
	public void setValue(int Value)
	{
			this.Value=Value;
	}
	public int getValue()
	{
		return Value;
	}
	
	public void setContact(Long Contact)
	{
		this.Contact=Contact;
	}
	public long getContact()
	{
		return Contact;
	}
	
	
	public void setSalary(long Salary)
	{
		this.Salary=Salary;
	}
	public long getSalary()
	{
		return Salary;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public String getAddress()
	{
		return Address;
	}
	
	public void setEmail(String Email)
	{
		this.Email=Email;
	}
	public String getEmail()
	{
		return Email;
	}
	
}
class Company
{
	Employee e[];
	Company(Employee e[])
	{
		Scanner xyz=new Scanner(System.in);
		int Result;
		do
		{
		System.out.println("1.Add Employee Details");
		System.out.println("2.Show Employee Details");
		System.out.println("3.Search Employee Details");
		System.out.println("4.Delete the Employee Details");
		System.out.println("5.Update Employee Details");
		System.out.println("6.Sorting Employee Details ");
		System.out.println("7.Display Employee Details in Highest Salary ");
		System.out.println("8.Display Employee Details in Second Highest Salary");
		System.out.println("9.Display the Employee Details in minimum Salary is 10000 to maximum");
		System.out.println("0 to exit the program");
		 Result=xyz.nextInt();
		switch(Result)
			{
				case 1:
				{
					for(int i=0;i<e.length;i++)
					{
					System.out.println("emter the Id of an employ ");
					Long id=xyz.nextLong();
					xyz.nextLine();
						System.out.println("enter the Name of employee");
						String  name=xyz.nextLine();
						
						System.out.println("enter the Email of Employee");
						String email=xyz.nextLine();
						
						System.out.println("enter the contact number of Employee");
						long num=xyz.nextLong();
						xyz.nextLine();
						System.out.println("enter the Address of Employee");
						String address=xyz.nextLine();
						
						System.out.println("enter the salary of Employee ");
						int sal=xyz.nextInt();
						e[i]=new Employee();
						e[i].setAddress(address);
						e[i].setContact(num);
						e[i].setEmail(email);
						e[i].setId(id);
						e[i].setName(name);
						e[i].setSalary(sal);
					}
					
				}
				break;
				case 2:
				{
					System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
					System.out.println("________________________________________________________________________________________________________________________");
					for(int i=0;i<e.length;i++)
					{
						System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
					}
				}
				break;
			
				case 3:
				{
						System.out.println("________________________________________________________________________________________________________________________");
							
					System.out.println("1: by id ");
					System.out.println("2: by name ");
					System.out.println("3: by  Email");
					System.out.println("4: by  Salary");
					System.out.println("5: by  Address");
					System.out.println("6: by  Contact");
					
						int skey=xyz.nextInt();
						switch(skey)
						{
							case 1:
							{boolean flag=true;
							int b=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the id");
							int sid=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getId())
									{
											flag=false;
											b=i;
											
									}	
								}
								if(flag==false)
								{
									System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
								}
								else{
									System.out.println("employ data not found");
								}
									System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
							
							case 2:
							{boolean flag=true;
							int b=0;
							xyz.nextLine();
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the name of employee");
							String sname=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(sname.equals(e[i].getName()))
									{
											flag=false;
											b=i;
									}
									
								}
								if(flag==false)
								{
								System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
									}
								else{
									System.out.println("employ data not found");
								}
									System.out.println("________________________________________________________________________________________________________________________");
							
							}
							break;
							
							case 3:
							{boolean flag=true;
							int b=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Email");
							String semail=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(semail.equals(e[i].getEmail()))
									{
											flag=false;
											b=i;
									}	
								}
								if(flag==false)
								{
									System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
								}
								else{
									System.out.println("employ data not found");
								}
									System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
							
							
							case 4:
							{boolean flag=true;
							int b=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the salary of employee");
							long Ssalary=xyz.nextLong();
								for(int i=0;i<e.length;i++)
								{
									if(Ssalary==e[i].getSalary())
									{
											flag=false;
											b=i;
									}
										
								}
								if(flag==false)
								{
									System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
								}
								else{
									System.out.println("employ data not found");
								}	System.out.println("________________________________________________________________________________________________________________________");
							
							}
							break;
							
							case 5:
							{boolean flag=true;
							int b=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the address of employee");
							String Saddress=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(Saddress.equals(e[i].getAddress()))
									{
											flag=false;
											b=i;
									}
										
								}
								if(flag==false)
								{
									System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
								}
								else{
									System.out.println("employ data not found");
								}
									System.out.println("________________________________________________________________________________________________________________________");
							
							}
							break;
							
							case 6:
							{boolean flag=true;
							int b=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the contact number of employee");
							long Snumber=xyz.nextLong();
								for(int i=0;i<e.length;i++)
								{
									if(Snumber==e[i].getContact())
									{b=i;
											flag=false;
									}
										
								}
								if(flag==false)
								{
									System.out.println("\t\t"+e[b].getName()+"\t\t"+e[b].getId()+"\t\t"+e[b].getEmail()+"\t\t"+e[b].getContact()+"\t\t\t"+e[b].getAddress()+"\t\t"+e[b].getSalary());
								}
								else{
									System.out.println("employ data not found");
								}
								System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
						}	
						System.out.println("________________________________________________________________________________________________________________________");
				}
				break;
				
				case 4:
				{
						System.out.println("________________________________________________________________________________________________________________________");
							
					System.out.println("1: by id ");
					System.out.println("2: by name ");
					System.out.println("3: by  Email");
					System.out.println("4: by  Salary");
					System.out.println("5: by  Address");
					System.out.println("6: by  Contact");
					
						int skey=xyz.nextInt();
						xyz.nextLine();
						
						System.out.println("________________________________________________________________________________________________________________________");

						switch(skey)
						{
							case 1:
							{
							int count=0;
							
							System.out.println("enter the id");
							int sid=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getId())
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getId())
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
									System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
							
							case 2:
							{
							int count=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Name");
							String sid=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getName()))
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getName()))
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							
							break;
							case 3:
							{
							int count=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Email");
							String sid=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getEmail()))
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getEmail()))
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							break;
							
							case 4:
							{
							int count=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Salary");
							int  sid=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getSalary())
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getSalary())
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
										System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
							
							case 5:
							{
							int count=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Address");
							String sid=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getAddress()))
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid.equals(e[i].getAddress()))
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
										System.out.println("________________________________________________________________________________________________________________________");
					
							}
							break;
							
							
							case 6:
							{
							int count=0;
								System.out.println("________________________________________________________________________________________________________________________");
							
							System.out.println("enter the Contact ");
							long sid=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getContact())
									{
											count++;
									}	
								}
								int Ssize=e.length-count;
								Employee emp[]=new Employee[Ssize];
								for(int i=0;i<e.length;i++)
								{
									if(sid==e[i].getContact())
									{
										e[i].setValue(-1);
									}
								}
								
								int k=0;
								for(int i=0;i<e.length;i++)
								{
									if(e[i].getValue()!=-1)
									{
										emp[k]=e[i];
										k++;
									}
								}
								e=emp;
								System.out.println("\t\tName\t\t Id\t\tEmail\t\tContact\t\tAddress\t\t\tSalary");
								System.out.println("________________________________________________________________________________________________________________________");
								for(int i=0;i<e.length;i++)
									{
										System.out.println("\t\t"+e[i].getName()+"\t\t"+e[i].getId()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact()+"\t\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary());
									}
										System.out.println("________________________________________________________________________________________________________________________");
							}
							break;
						}						
				}
				break;
				
				case 5:
				{
					System.out.println("1:using id");
					System.out.println("2: Name");
					System.out.println("3 :Email");
					System.out.println("4 :Salary");
					System.out.println("5 :Address");
					int skey=xyz.nextInt();
					xyz.nextLine();
					switch(skey)
					{
							case 1:
							{ long sId,sContact,sSal;
							String sName,sEmail,addres;
							int a=0;
								boolean flag=true;
								System.out.println("enter the id");
								int Sid=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(Sid==e[i].getId())
									{
										flag=false;
										a=i;
										
									}
								}
								
								if(flag==false)
								{
									System.out.println("enter the Id");
										 sId=xyz.nextInt();
										System.out.println("enter the contact");
										  sContact=xyz.nextInt();
										 xyz.nextLine();
										 System.out.println("enter the name");
										  sName=xyz.nextLine();
										
										System.out.println("enter the Email ");
										 sEmail=xyz.nextLine();
										
										System.out.println("enter the Salary of employee");
										 sSal=xyz.nextInt();
										xyz.nextLine();
										System.out.println("enter the address ");
										 addres=xyz.nextLine();
										e[a].setAddress(addres);
										e[a].setContact(sContact);
										e[a].setEmail(sEmail);
										e[a].setId(sId);
										e[a].setName(sName);
										e[a].setSalary(sSal);
								}
								else
									{
										System.out.println("Id not found please enter the valid id !");
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							break;
							
							case 2:
							{long sId,sContact,sSal;
							String sName,sEmail,addres;
							int a=0;
								boolean flag=true;
								System.out.println("enter the Name");
								String Sname=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(Sname.equals(e[i].getName()))
									{
										flag=false;
										a=i;
									}
								}
								
								if(flag==false)
								{
										System.out.println("enter the Id");
										sId=xyz.nextInt();
										System.out.println("enter the contact");
										  sContact=xyz.nextInt();
										 xyz.nextLine();
										 System.out.println("enter the name");
										  sName=xyz.nextLine();
										
										System.out.println("enter the Email ");
										 sEmail=xyz.nextLine();
										
										System.out.println("enter the Salary of employee");
										sSal=xyz.nextInt();
										xyz.nextLine();
										System.out.println("enter the address ");
										 addres=xyz.nextLine();
										e[a].setAddress(addres);
										e[a].setContact(sContact);
										e[a].setEmail(sEmail);
										e[a].setId(sId);
										e[a].setName(sName);
										e[a].setSalary(sSal);
										
								}
								else
									{
										System.out.println("Name not found please enter the valid Name !");
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							break;
							
							case 3:
							{long sId,sContact,sSal;
							String sName,sEmail,addres;
							int a=0;
								boolean flag=true;
								System.out.println("enter the Email");
								String Semail=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(Semail.equals(e[i].getEmail()))
									{
										flag=false;
										a=i;
									}
								}
								
								if(flag==false)
								{
									System.out.println("enter the Id");
										 sId=xyz.nextInt();
										System.out.println("enter the contact");
										  sContact=xyz.nextInt();
										 xyz.nextLine();
										 System.out.println("enter the name");
										  sName=xyz.nextLine();
										
										System.out.println("enter the Email ");
										 sEmail=xyz.nextLine();
										
										System.out.println("enter the Salary of employee");
										sSal=xyz.nextInt();
										xyz.nextLine();
										System.out.println("enter the address ");
										 addres=xyz.nextLine();
										
										e[a].setAddress(addres);
										e[a].setContact(sContact);
										e[a].setEmail(sEmail);
										e[a].setId(sId);
										e[a].setName(sName);
										e[a].setSalary(sSal);
								}
								else
									{
										System.out.println("Email not found please enter the valid Email !");
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							break;
							
							case 4:
							{int a=0;
								long sId,sContact,sSal;
							String sName,sEmail,addres;
								boolean flag=true;
								System.out.println("enter the Salary");
								int  Ssalary=xyz.nextInt();
								for(int i=0;i<e.length;i++)
								{
									if(Ssalary==e[i].getSalary())
									{
										flag=false;
										a=i;
									}
								}
								
								if(flag==false)
								{
									System.out.println("enter the Id");
										 sId=xyz.nextInt();
										System.out.println("enter the contact");
										  sContact=xyz.nextInt();
										 xyz.nextLine();
										 System.out.println("enter the name");
										  sName=xyz.nextLine();
										
										System.out.println("enter the Email ");
										 sEmail=xyz.nextLine();
										
										System.out.println("enter the Salary of employee");
										 sSal=xyz.nextInt();
										xyz.nextLine();
										System.out.println("enter the address ");
										 addres=xyz.nextLine();
										
										e[a].setAddress(addres);
										e[a].setContact(sContact);
										e[a].setEmail(sEmail);
										e[a].setId(sId);
										e[a].setName(sName);
										e[a].setSalary(sSal);
										
								}
								else
									{
										System.out.println("Salary not found please enter the valid Salary !");
									}
									System.out.println("________________________________________________________________________________________________________________________");
								
							}
							break;
							
							case 5:
							{int a=0;
								long sId,sContact,sSal;
							String sName,sEmail,addres;
								boolean flag=true;
								System.out.println("enter the Address");
								String Saddress=xyz.nextLine();
								for(int i=0;i<e.length;i++)
								{
									if(Saddress.equals(e[i].getAddress()))
									{a=i;
										flag=false;
									}
								}
								
								if(flag==false)
								{
									System.out.println("enter the Id");
										 sId=xyz.nextInt();
										System.out.println("enter the contact");
										  sContact=xyz.nextInt();
										 xyz.nextLine();
										 System.out.println("enter the name");
										  sName=xyz.nextLine();
										
										System.out.println("enter the Email ");
										 sEmail=xyz.nextLine();
										
										System.out.println("enter the Salary of employee");
										sSal=xyz.nextInt();
										
										System.out.println("enter the address ");
										 addres=xyz.nextLine();
										
										e[a].setAddress(addres);
										e[a].setContact(sContact);
										e[a].setEmail(sEmail);
										e[a].setId(sId);
										e[a].setName(sName);
										e[a].setSalary(sSal);	
								}
								else
									{
										System.out.println("Address not found please enter the valid Address !");
									}
									System.out.println("________________________________________________________________________________________________________________________");	
							}
							break;		
					}
				}break;
				
				case 6:
				{
					System.out.println("1 : by using id");
					System.out.println("2 :by using Salary ");
					int r=xyz.nextInt();
					
					switch(r)
					{
						case 1:
						{
							Employee temp;
							
							for(int i=0;i<e.length;i++)
							{
									for(int j=i+1;j<e.length;j++)
									{
										if(e[i].getId()<e[j].getId())
										{
											 temp=e[i];
											e[i]=e[j];
											e[j]=temp;
										}
									}
							}
						}
						break;
						case 2:
						{
							Employee temp;
							for(int i=0;i<e.length;i++)
							{
								for(int j=i+1;j<e.length;j++)
								{
									if(e[i].getSalary()<e[i+1].getSalary())
									{
										temp=e[i];
											e[i]=e[j];
											e[j]=temp;
									}
								}
							}
							
						}break;
					}
				}
				break;
				
				
				case 7:
				{
					
					int a=0;
					 long tempS=e[0].getSalary();
					for(int i=0;i<e.length;i++)
					{
						if(tempS<e[i].getSalary())
						{
							tempS=e[i].getSalary();
							a=i;
						}
					}
					System.out.println("________________________________________________________________________________________________________________________");
					System.out.println("\t\tId\t\tName\t\tAddress\t\t\tSalary\t\tEmail\t\tContact");
					//System.out.println("\t\t"+e[tempS].getId()+"\t\t"+e[tempS].getName()+"\t\t"+e[tempS].getAddress()+"\t\t"+e[tempS].getSalary()+"\t\t"+e[tempS].getEmail()+"\t\t"+e[tempS].getContact());
					System.out.println("\t\t"+e[a].getId()+"\t\t"+e[a].getName()+"\t\t"+e[a].getAddress()+"\t\t"+e[a].getSalary()+"\t\t"+e[a].getEmail()+"\t\t"+e[a].getContact());	
				}break;
				
				case 8:
				{
					Employee max=e[0];
					Employee Smax=e[0];
					
					for(int i=0;i<e.length;i++)
					{
						if(max.getSalary()<e[i].getSalary())
						{
							Smax=max;
							max=e[i];
						}
					}
					System.out.println("________________________________________________________________________________________________________________________");
					System.out.println("\t\tId\t\tName\t\tAddress\t\t\tSalary\t\tEmail\t\tContact");
					System.out.println("\t\t"+Smax.getId()+"\t\t"+Smax.getName()+"\t\t"+Smax.getAddress()+"\t\t"+Smax.getSalary()+"\t\t"+Smax.getEmail()+"\t\t"+Smax.getContact());	
				}
				break;
				
				case 9:
				{
					System.out.println("________________________________________________________________________________________________________________________");
					System.out.println("\t\tId\t\tName\t\tAddress\t\t\tSalary\t\tEmail\t\tContact");
					
					for(int i=0;i<e.length;i++)
					{
						if(e[i].getSalary()>=10000)
						{
							System.out.println("\t\t"+e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getAddress()+"\t\t"+e[i].getSalary()+"\t\t"+e[i].getEmail()+"\t\t"+e[i].getContact());
					
						}
					}
				}break;
				case 0:
				{
				System.out.println("OK BY");	
				}break;
				default :
				{
					System.out.println("Invalid input please input a valid Case");
				}
				break;
		}
	}
		while(Result!=0);
		{
		
		}
}
}
public class EmployeeDetailsApp
{
	public static void main(String x[])
	{	
		Scanner xyz=new Scanner (System.in);
		System.out.println("enter the number  of employee ");
		int size=xyz.nextInt();
		Employee e[]=new Employee[size];
		Company c=new Company(e); 	
	}
}