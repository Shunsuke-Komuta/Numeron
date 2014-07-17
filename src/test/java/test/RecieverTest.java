package test;

import static org.junit.Assert.assertEquals;
import numeron.Reciever;

import org.junit.Test;

public class RecieverTest {
  Reciever reciever = null;

  @Test
  public void test_getFigureLengthを呼び出すと桁数を取得できる() {
    String[] args = {"12345", "12345"};
    reciever = new Reciever(args);

    String actual = reciever.getFigureLength();

    assertEquals("5", actual);

  }

  @Test
  public void test_引数に1と1が格納された配列を渡してsumEATメソッドをを呼び出すと1を返す() {
    String[] args = {"1", "1"};
    reciever = new Reciever(args);

    String actual = reciever.sumEat();

    assertEquals("1", actual);
  }

  @Test
  public void test_引数に1と2が格納された配列を渡してsumEATメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "2"};
    reciever = new Reciever(args);

    String actual = reciever.sumEat();

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に12と12が格納された配列を渡してsumEATメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "12"};
    reciever = new Reciever(args);

    String actual = reciever.sumEat();

    assertEquals("2", actual);
  }

  @Test
  public void test_引数に12と13が格納された配列を渡してsumEATメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "13"};
    reciever = new Reciever(args);

    String actual = reciever.sumEat();

    assertEquals("1", actual);
  }

  @Test
  public void test_引数に12と89が格納された配列を渡してsumEATメソッドをを呼び出すと0を返す() {
    String[] args = {"12", "89"};
    reciever = new Reciever(args);

    String actual = reciever.sumEat();

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に1と1が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "1"};
    reciever = new Reciever(args);

    String actual = reciever.sumBite();

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に1と2が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"1", "2"};
    reciever = new Reciever(args);

    String actual = reciever.sumBite();

    assertEquals("0", actual);
  }

  @Test
  public void test_引数に12と12が格納された配列を渡してsumBiteメソッドをを呼び出すと0を返す() {
    String[] args = {"12", "12"};
    reciever = new Reciever(args);

    String actual = reciever.sumBite();

    assertEquals("0", actual);

  }

  @Test
  public void test_引数に12と21が格納された配列を渡してsumBiteメソッドをを呼び出すと2を返す() {
    String[] args = {"12", "21"};
    reciever = new Reciever(args);

    String actual = reciever.sumBite();

    assertEquals("2", actual);

  }

  @Test
  public void test_引数に12と23が格納された配列を渡してsumBiteメソッドをを呼び出すと1を返す() {
    String[] args = {"12", "23"};
    reciever = new Reciever(args);

    String actual = reciever.sumBite();

    assertEquals("1", actual);
    reciever = new Reciever(args);

  }
}
