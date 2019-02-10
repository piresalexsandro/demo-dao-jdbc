package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

			Department obj = new Department(1, "Books");
				
			SellerDao sellerDao = Daofactory.createSellerDao();// o metodo tem a instancia de SELLERDAO
			
			System.out.println(" ==== TEST 1: Seller findById ====");
			
			Seller seller = sellerDao.findById(3);
			
			System.out.println(seller);
	}

}
