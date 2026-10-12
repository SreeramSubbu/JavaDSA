package ram.dsa.training.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    BinaryGap target = new BinaryGap();

    @Test
    public void test1(){
        var result = target.solution(5);
        assertEquals(1,result);
    }

    @Test
    public void test2(){
        var result = target.solution(1041);
        assertEquals(5,result);
    }

    @Test
    public void test3(){
        var result = target.solution(32);
        assertEquals(0  ,result);
    }

    @Test
    public void test4(){
        var result = target.solution(81);
        assertEquals(3  ,result);
    }

}