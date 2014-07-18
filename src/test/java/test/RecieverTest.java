package test;

import static org.junit.Assert.assertEquals;
import numeron.Reciever;

import org.junit.Before;
import org.junit.Test;

public class RecieverTest {
  Reciever reciever = null;


  @Before
  public void setUp() {
    reciever = new Reciever();
  }

  @Test
  public void test_getFigureLengthを呼び出すと桁数を取得できる() {
    String[] args = {"12345", "123456789"};

    String[] actual = reciever.getFigureLength(args);

    assertEquals("5", actual[0]);
    assertEquals("9", actual[1]);
  }

  @Test
  public void test_引数に1と1が格納された配列を渡してsumEATメソッドをを呼び出すと1を返す() {
    String[] args = {"1", "1"};

    String actual = reciever.sumEat(args);

    assertEquals("1", actual);
  }

  @Test
  public void test_引数に1と2が格納された配列を渡してsumEATメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "2"};

    String actual = reciever.sumEat(args);

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に12と12が格納された配列を渡してsumEATメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "12"};

    String actual = reciever.sumEat(args);

    assertEquals("2", actual);
  }

  @Test
  public void test_引数に12と13が格納された配列を渡してsumEATメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "13"};

    String actual = reciever.sumEat(args);

    assertEquals("1", actual);
  }

  @Test
  public void test_引数に12と89が格納された配列を渡してsumEATメソッドをを呼び出すと0を返す() {
    String[] args = {"12", "89"};

    String actual = reciever.sumEat(args);

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に1と1が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "1"};

    String actual = reciever.sumBite(args);

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に1と2が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "2"};

    String actual = reciever.sumBite(args);

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に12と12が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"12", "12"};

    String actual = reciever.sumBite(args);

    assertEquals("0", actual);

  }

  @Test
  public void test_引数に12と21が格納された配列を渡してsumBiteメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "21"};

    String actual = reciever.sumBite(args);

    assertEquals("2", actual);

  }

  @Test
  public void test_引数に12と23が格納された配列を渡してsumBiteメソッドをを呼び出すと1を返す() {
    String[] args = {"12", "23"};

    String actual = reciever.sumBite(args);

    assertEquals("1", actual);
  }
}
