package collectionframework;
import java.util.*;
class student implements Comparable<student>
{
	String name;
	int id;
	double mark;
	public student(String name,int id,double mark)
	{
		super();
		this.name=name;
		this.id=id;
		this.mark=mark;

	}
	@Override
	public String toString()
	{
		return"student[name="+name+", id="+id+", mark="+mark+"]";
	}
	@Override
	public int compareTo(student id)
	{
		//return this.id-s1.id
		//return this.name.compareTo(s1.name);
		return(int)(this.mark-id.mark);
	}
}

public class main 
{
	public static void main(String[]args)
	{
		student s1=new student("abd",01,67.0);
		student s2=new student("awd",02,68.0);
		student s3=new student("aqd",03,69.0);
		student s4=new student("aed",04,63.0);
		ArrayList <student>slist=new ArrayList<student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		System.out.println(slist);
		Collections.sort(slist);
		for(student std:slist)
		{
			System.out.println(std);
		}
	}
}

