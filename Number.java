// // The number 39 will reduce as
// // Step 1 :(39 → 3x9 = 27) →
// // Step 2 : (27 → 2x7 =  14) → 
// // Step 3 : (14 → 1x4 = 4)

import java.util.ArrayList;


class Number
{
public static void main(String args[])
	{

int n=39;

int mult=n;
while(mult>10)
{
ArrayList<Integer> list= new ArrayList<Integer>();
while(mult>10)
{
	list.add(mult%10);
	mult=mult/10;
}

int l= list.size();

for(int i=l;i>1;i--)
{
	mult=1*list.get(i);
}


}

System.out.print(mult);

}
}

// // System.out.println(mult);


// int ar[]= n.split();

// }

// }







// public List<String> getNames(List<Employee> employees){

//   if(Employee.salary>10000)
//   {
//   	return Employee.employee;
//   }

//  else
//  {
//  	return "No Employee found";
//  }

// //
// }

// @Controller
// puclic class Controller
// {


// @Autowired EmployeeReposistory EmpRepo


// @RequestMapping("/update", method=POST)

// public Employee emp updateEmp()

// EmployeeReposistory.EmpRepo.save();

// }








