package numeron;

public class Reciever {

  char[] array1 = null;
  char[] array2 = null;

  private String[] args = null;

  public Reciever(String[] args) {
    this.args = args;
    String num1 = this.args[0];
    String num2 = this.args[1];
    array1 = num1.toCharArray();
    array2 = num2.toCharArray();
  }

  public String sumEat() {

    int sum = 0;

    for (int i = 0; i < array1.length || i < array1.length; i++) {
      if (array1[i] == array2[i]) {
        sum++;
      }
    }
    String eat = new Integer(sum).toString();
    return eat;
  }

  public String sumBite() {

    int sum = 0;

    for (int i = 0; i < array1.length; i++) {
      for (int h = 0; h < array2.length; h++) {
        if (i != h & array1[i] == array2[h]) {
          sum++;
        }
      }
    }
    String bite = new Integer(sum).toString();
    return bite;
  }

  public String getFigureLength() {

    String figureLength = new Integer(array1.length).toString();

    return figureLength;
  }
}
