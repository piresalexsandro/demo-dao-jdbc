package application;

import java.util.List;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = Daofactory.createDepartmentDao();
		
		System.out.println(" ==== TEST 1: Seller findById ====");
		Department department = departmentDao.findById(0);
		System.out.println(department);
		
		
		System.out.println("\n ==== TEST 2: Seller findAll ====");
		List <Department> departments = departmentDao.findAll();
		for (Department dep : departments) {
			System.out.println(dep);
		}
		
		
		System.out.println("\n ==== TEST 3: Department insert ====");
		department = new Department(0, "Cosmetics");
		departmentDao.insert(department);
		System.out.println("Inserted row!" + department.getId());
		
		
		
		System.out.println("\n ==== TEST 4: Department update ====");
		departmentDao.findById(0);
		department.setName("Human Resource");
		departmentDao.update(department);
		System.out.println("Updated!");
		
		
		System.out.println("\n ==== TEST 5: Department delete ====");
		departmentDao.deleteById(0);
		System.out.println("Deleted!");
		
		
	}

}
