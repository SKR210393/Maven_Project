package comm.Data_Driven;

import com.Data_Driven_Base_cls.Read_Data;

public class Read_Data_Runner extends Read_Data {

	public static void main(String[] args) throws Throwable {

		allData();

		System.out.println("Age of Antonne retrived from Excel : ");
		particularCell();
		System.out.println();

		System.out.println("Retriving the Particular Column - User Name :");
		particularColumn();
		System.out.println();

		System.out.println("Retriving the Particular Row of User Antonne : ");
		particularRowTitle();
		particularRow();
		
	}

}
