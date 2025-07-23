package FunctionsAllProgram;

import java.util.function.Function;
import java.util.*;

public class UsingGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function <String,String> prefix = x ->x.substring(0, 3);
		Student st = new Student(1,"Nishant");
		Student st1 = new Student(2,"Nisha");
		Student st2 = new Student(3,"Vishal");
		Student st3 = new Student(4,"Aniket");
		Student st4 = new Student(5,"Nishikant");

	Function<List<Student>,List<Student>> studentwithprefix = li ->{
		List<Student> result =new ArrayList<>();
		for(Student i :li) {
			if(prefix.apply(i.getName()).equalsIgnoreCase("Nis")) {
			result.add(i);
		}
		}
		
		return result;
	};
	List<Student>students =Arrays.asList(st,st1,st2,st3,st4);
	List<Student> filterStudent = studentwithprefix.apply(students);
	System.out.println(filterStudent);
		
	}
	public static class Student{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		
	}

}
