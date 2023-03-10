package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.InvoiceDTO;
import DTO.TransactionDTO;
import Table.DBUtility;


public class TransactionDAOusage implements TransactionDAO {

	@Override
	public Collection<TransactionDTO> findByInvoice(int id) {
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from  invoice_trans where invoiceno=? ;");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			List<TransactionDTO> transactions = new ArrayList<>();
			while(rs.next()) {
				TransactionDTO transaction = new TransactionDTO();
				transaction.setInvoiceNumber(rs.getInt("invoiceno"));
				transaction.setItemNumber(rs.getInt("itemno"));
				transaction.setItemQuantity(rs.getInt("itemqty"));
				transactions.add(transaction);
				
			}
			return transactions;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DBUtility.closeConnection(e);
		}
		
		return null;
	}
	@Override
	public int updateTransaction(TransactionDTO transaction) {
		try {
			Connection connection  = DBUtility.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int invoiceNumber= transaction.getInvoiceNumber();
			int itemNumber = transaction.getItemNumber();
			
			
			PreparedStatement statement =connection.prepareStatement("select * from  invoice_trans where invoiceno = ? and itemno = ?;");
		
			statement.setInt(1, invoiceNumber);
			statement.setInt(2, itemNumber);
//			System.out.println(statement);
			ResultSet rs = statement.executeQuery();
			
			
			
			if(rs.next()) {
				statement = connection.prepareStatement("update transactions set  itemqty = ?  where invoiceno=? and itemno = ?");
				statement.setInt(1, transaction.getItemQuantity());
				statement.setInt(2, transaction.getInvoiceNumber());
				statement.setInt(3, transaction.getItemNumber());
				
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
	public int deleteTransaction(int invoiceId) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from  invoice_trans where invoiceno=?;");
			ps.setInt(1, invoiceId);
			int n = ps.executeUpdate();
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
