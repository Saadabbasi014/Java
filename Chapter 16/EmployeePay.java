public abstract class EmployeePayComparator Comparator<Employee>{

	@Override
    public int compareTo(Employee emp1, Employee emp2){
			
			if(emp1.getName() == emp2.getName())
				return 0;
			
			if(emp1.getName() < emp2.getName())
				return -1;
			
			if(emp1.getName > emp2.getName())
				return 1;
			
			return (emp1.name).compareTo(emp2.name);
			
	}
}	