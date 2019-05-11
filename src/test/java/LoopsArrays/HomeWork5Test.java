package SoftServe.LoopsArrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork5Test {
    private static int[] arr = {2,5,1,3,6,-1,-2,2,2,2};

    @Test
    public void getMinElemPosition() {
        assertEquals(6 ,HomeWork5.getMinElemPosition(arr));
    }

    @Test
    public void positionOfSecondPositiveNumber() {
        assertEquals(1,HomeWork5.positionOfSecondPositiveNumber(arr));
    }

    @Test
    public void getDaysArrayShouldBeNull() {
        assertNull(HomeWork5.getDaysArray(13,true));
    }

    @Test
    public void getDaysArray() {
        assertArrayEquals(new int[31],HomeWork5.getDaysArray(5,true));
    }

    @Test
    public void calculateSumNumbers() {
        assertEquals(16,HomeWork5.calculateSumOrProductOfNumbersArr(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllArgExcept() {
        HomeWork5.showCarsWithCertainModelYear(null, 2000);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExcept() {
        Car[] cars = {null};
        HomeWork5.showCarsWithCertainModelYear(cars, 2000);
    }
}