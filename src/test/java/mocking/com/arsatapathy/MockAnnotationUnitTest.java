package mocking.com.arsatapathy;

import com.arsatapathy.mocktest.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockAnnotationUnitTest {

    @Mock
    private Customer customer;

    @Test
    public void test_01() {
        when(customer.getCustomerName()).thenReturn("ashish");

        Assert.assertEquals("ashish", customer.getCustomerName());

        verify(customer).getCustomerName();
    }
}
