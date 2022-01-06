package validation;

import dao.CustomerDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SaveCustomerDaoTest {
    CustomerDao customerDao;

    @BeforeEach
    void init() {
        customerDao = new CustomerDao();
    }

    @AfterEach
    void after() {
        System.out.println("*******DONE!!!*******");
    }

    @Test
    void giveCustomer_saveIt() {
//        customerDao.save(creatCustomer());

    }

//    Customer creatCustomer() {
//        return Customer.builder()
//                .firstName("sara")
//                .build();
//    }
}
