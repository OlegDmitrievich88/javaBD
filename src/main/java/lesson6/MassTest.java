package lesson6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MassTest {
    massiv mas;

    @Before
    public void init(){
        System.out.println("Init");
        mas = new massiv();
    }
    @Test
    public void masstest(){
        int[] mas1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
      //  ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertArrayEquals(new Integer[]{1,7},massiv.masReturnNumberBeforFore(mas1));
    }
    @Test
    public void masstest1(){
        int[] mas1 = {1, 2, 7, 9, 2, 3, 3, 1, 7};
       // ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertArrayEquals(new Integer[]{1,7},massiv.masReturnNumberBeforFore(mas1));
    }
    @Test
    public void masstest2(){
        int[] mas1 = {1, 2, 4, 4, 2, 3, 5, 1, 7};
      //  ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertArrayEquals(new Integer[]{2,3,5,1,7},massiv.masReturnNumberBeforFore(mas1));
    }
    @Test
    public void masstest3(){
        int[] mas1 = {1, 2, 4, 4, 2, 3, 5, 1, 7};
        Assert.assertArrayEquals(new boolean[]{false},massiv.masReturnOneFore(mas1));
    }
    @Test
    public void masstest4(){
        int[] mas1 = {0, 2, 5, 6, 2, 3, 5, 9, 7};
       Assert.assertArrayEquals(new boolean[]{false},massiv.masReturnOneFore(mas1));
    }
    @After
    public void shutdown(){
        System.out.println("End");
    }
}
