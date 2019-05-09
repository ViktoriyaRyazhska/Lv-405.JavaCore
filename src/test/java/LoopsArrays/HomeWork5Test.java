package SoftServe.LoopsArrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork5Test {

    @Test
    public void getMinElemAndItPosition() {
        int[] arr1 = {2,5,1,3,6,-1,-2,2,2,2};
        int[] result = {-2,6};
        assertArrayEquals(result,HomeWork5.getMinElemAndItPosition(arr1));
    }

    @Test
    public void positionOfSecondPositiveNumber() {
        int[] arr1 = {2,5,1,3,6,-1,-2,2,2,2};
        assertEquals(1,HomeWork5.positionOfSecondPositiveNumber(arr1));
    }

    @Test
    public void getDaysArray() {
        assertEquals(29,HomeWork5.getDaysArray(2,true).length);
        assertEquals(28,HomeWork5.getDaysArray(2,false).length);
        assertNull(HomeWork5.getDaysArray(13,true));
    }

    @Test
    public void calculateSumOrProductOfNumbersArr() {
        int[] arr1 = {2,5,1,3,6,-1,-2,2,2,2};
        assertEquals(17,HomeWork5.calculateSumOrProductOfNumbersArr(arr1));
        int[] arr2 = {2,5,-1,3,6,-1,-2,2,2,2};
        assertEquals(16,HomeWork5.calculateSumOrProductOfNumbersArr(arr2));
    }
}