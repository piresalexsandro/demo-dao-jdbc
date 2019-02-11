package application;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = Daofactory.createDepartmentDao();
		
		System.out.println(" ==== TEST 1: Seller findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
	}

}
