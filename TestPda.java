import static org.junit.Assert.*;
import org.junit.*;


public class TestPda {

  Pda pda1;

@Before
public void before(){
  pda1 = new Pda();
}


@Test
public void testVal1(){
  assertEquals(false, pda1.func1(2));
  assertEquals(true, pda1.func1(1));
}

@Test 
public void testMaxA(){
  assertEquals(8, pda1.max(8, 4));
}

@Test
public void testLooper(){
assertEquals(10, pda1.looper()); 
}

@Test
public void testCheckLoop(){
assertEquals("looper passed", pda1.checkLoop(10));
}

}