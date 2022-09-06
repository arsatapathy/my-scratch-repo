package com.arsatapathy.mocking;

import com.arsatapathy.mocktest.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.mockito.Mockito.*;

public class MockTest {

    @Test
    public void test_01() {
        Customer customer = mock(Customer.class);

        when(customer.getCustomerId()).thenReturn(1230);

        int customerId = customer.getCustomerId();
        System.out.println(customerId);
        Assert.assertEquals(1230, customerId);


        customer.getCustomerName();

        verify(customer, times(1)).getCustomerName();
    }
}
