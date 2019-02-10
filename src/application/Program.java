package application;

import java.util.List;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			SellerDao sellerDao = Daofactory.createSellerDao();// o metodo tem a instancia de SELLERDAO
			
			System.out.println(" ==== TEST 1: Seller findById ====");
			Seller seller = sellerDao.findById(3);
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
	}

}
