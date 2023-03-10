package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.CustomerDTO;
import Table.DBUtility;



public class CustomerDAOusage implements CustomerDAO{

	@Override
	public CustomerDTO findById(int id) {
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customerid =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setId(id);
				customer.setName(rs.getNString("customername"));
				customer.setAddress(rs.getString("customeraddress"));
				return customer;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DBUtility.closeConnection(e);
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO findByName(String name) {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customername =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(name);
				customer.setId(rs.getInt("customerid"));
				customer.setAddress(rs.getString("customeraddress"));
				return customer;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DBUtility.closeConnection(e);
		}
		
		
		return null;
	}

	@Override
	public Collection<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customer_master ");
			ResultSet rs = statement.executeQuery();
			List<CustomerDTO> customers = new ArrayList<>();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(rs.getString("customername"));
				customer.setId(rs.getInt("customerid"));
				customer.setAddress(rs.getString("customeraddress"));
				 customers.add(customer);
			}
			return customers;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DBUtility.closeConnection(e);
		}
		
		
		
		return null;
	}

	@Override
	public int updateCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int id= customer.getId();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customerid = ?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			if(rs.next()) {
				statement = connection.prepareStatement("update customer_master set customername =? , customeraddress = ? where customerid =?;");
				statement.setString(1, customer.getName());
				statement.setString(2, customer.getAddress());
				statement.setInt(3, customer.getId());
				
				 int n = statement.executeUpdate();
				 DBUtility.closeConnection(null);
				 return n;
			}
			return 0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DBUtility.closeConnection(e);
		}
		
		
		return 0;
	}

	@Override
	public int DeleteById(int id) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customers where customerid=?");
			statement.setInt(1, id);
			int n = statement.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	@Override
	public int DeleteByName(String Name) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customers where customername=?");
			statement.setString(1, Name);
			int n = statement.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	}


