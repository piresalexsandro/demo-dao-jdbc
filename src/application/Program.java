package application;

import java.util.Date;
import java.util.List;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			SellerDao sellerDao = Daofactory.createSellerDao();// o metodo tem a instancia de SELLERDAO
			
			System.out.println(" ==== TEST 1: Seller findById ====");
			Seller seller = sellerDao.findById(7);
			System.out.println(seller);

			System.out.println("\n ==== TEST 2: Seller findByDepartment ====");
			Department department =  new Department(2, null);
			List <Seller> sellers = sellerDao.findByDepartment(department);
			for (Seller obj : sellers) {
				System.out.println(obj);
			}

			System.out.println("\n ==== TEST 3: Seller findAll ====");
			List <Seller> sellersAll = sellerDao.findAll();
			for (Seller obj : sellersAll) {
				System.out.println(obj);
			}
			
			/*
			System.out.println("\n ==== TEST 4: Seller insert ====");
			Seller sellerInsert = new Seller(null, "MalcomX", "malcomx@gmail.com", new Date(), 4500.00, department );
			sellerDao.insert(sellerInsert);
			System.out.println("Inserted! New id = " + sellerInsert.getId());
			*/
	

			System.out.println("\n ==== TEST 5: Seller update ====");
			sellerDao.findById(7);
			seller.setBaseSalary(8000.00);
			//seller.setEmail("greatemalcomx@gmail.com");
			sellerDao.update(seller);
			System.out.println("Updated!");
	}

}
