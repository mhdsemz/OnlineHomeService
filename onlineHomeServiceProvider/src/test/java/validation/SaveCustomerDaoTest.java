package validation;

import dao.CustomerDao;
import models.member.Customer;
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
}
