package Action;
import java.util.ArrayList;
import java.util.List;
import DAO.CustomerDAO;
import DAO.CustomerDAOusage;
import DAO.InvoiceDAO;
import DAO.InvoiceDAOusage;
import DAO.ItemDAO;
import DAO.ItemDAOusage;
import DAO.TransactionDAO;
import DAO.TransactionDAOusage;
import DTO.CustomerDTO;
import DTO.InvoiceDTO;
import DTO.ItemDTO;
import DTO.TransactionDTO;

public class UseDatabase {
public static void main(String[] args) {
	CustomerDAO customer = new CustomerDAOusage();
	CustomerDTO demo  = new CustomerDTO();
	
	ItemDAO item = new 	ItemDAOusage();
	ItemDTO demoItem = new ItemDTO();
	
	InvoiceDAO invoice  = new InvoiceDAOusage();
	InvoiceDTO demoInvoice = new InvoiceDTO();
	
	TransactionDAO transaction = new TransactionDAOusage();
	List<TransactionDTO> demoTransactions = new ArrayList<>();
	
	System.out.println(customer.findById(890));
	System.out.println(customer.findByName("lavanya"));
	System.out.println(item.findById(123));
	
}





}
