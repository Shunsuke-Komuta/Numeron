package test;

import static org.junit.Assert.assertEquals;
import numeron.Judge;

import org.junit.Test;

public class JudgeTest {

  private Judge judge = null;

  @Test
  public void tese_引数に1と1が格納された配列を渡すと桁数を保持する() {



  }

  @Test
  public void test_引数に1と1が格納された配列＿ヌメロン＿を渡してexecuteメソッドを呼び出すと1と0が格納された配列を返す() {
    String[] args = {"1", "1"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("1", actual[0]);
    assertEquals("0", actual[1]);
  }

  @Test
  public void test_引数に1と2が格納された配列を渡してexecuteメソッドを呼び出すと0と0が格納された配列を返す() {
    String[] args = {"1", "2"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("0", actual[0]);
    assertEquals("0", actual[1]);
  }

  @Test
  public void test_引数に12と12が格納された配列＿ヌメロン＿を渡してexecuteメソッドを呼び出すと2と0が格納された配列を返す() {
    String[] args = {"12", "12"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("2", actual[0]);
    assertEquals("0", actual[1]);
  }


  @Test
  public void test_引数に12と21が格納された配列を渡してexecuteメソッドを呼び出すと0と2が格納された配列を返す() {
    String[] args = {"12", "21"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("0", actual[0]);
    assertEquals("2", actual[1]);
  }

  @Test
  public void test_引数に123と123が格納された配列＿ヌメロン＿を渡してexecuteメソッドを呼び出すと3と0が格納された配列を返す() {
    String[] args = {"123", "123"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("3", actual[0]);
    assertEquals("0", actual[1]);
  }

  @Test
  public void test_引数に123と129が格納された配列を渡してexecuteメソッドを呼び出すと3と0が格納された配列を返す() {
    String[] args = {"123", "129"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("2", actual[0]);
    assertEquals("0", actual[1]);
  }

  @Test
  public void test_引数に123と921が格納された配列を渡してexecuteメソッドを呼び出すと2と1が格納された配列を返す() {
    String[] args = {"123", "921"};
    judge = new Judge(args);

    String[] actual = judge.execute();

    assertEquals("1", actual[0]);
    assertEquals("1", actual[1]);

  }
}
