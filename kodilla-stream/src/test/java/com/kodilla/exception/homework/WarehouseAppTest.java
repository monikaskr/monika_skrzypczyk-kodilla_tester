package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTest {
    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder( "209855");
        // when
        Order isOrderInUse = warehouse.getOrder("209855");
        // then
        assertNotNull(isOrderInUse);
    }

    @Test
    public void testIsOrderInUse_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        //Order isOrderInUse = warehouse.getOrder("254114");
        // then
        assertThrows(OrderDoesntExistException.class,()->warehouse.getOrder("254114"));
    }

}