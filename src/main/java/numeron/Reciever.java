package numeron;

public class Reciever {

  char[] array1 = null;
  char[] array2 = null;


  public String sumEat(String[] args) {

    setCharaArray(args);

    int sum = 0;

    for (int i = 0; i < array1.length || i < array1.length; i++) {
      if (array1[i] == array2[i]) {
        sum++;
      }
    }
    String eat = new Integer(sum).toString();
    return eat;
  }

  public String sumBite(String[] args) {

    setCharaArray(args);

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

  public String[] getFigureLength(String[] args) {

    setCharaArray(args);

    String figureLength1 = new Integer(array1.length).toString();
    String figureLength2 = new Integer(array2.length).toString();

    String[] figureLengths = {figureLength1, figureLength2};

    return figureLengths;
  }

  private void setCharaArray(String[] args) {
    String num1 = args[0];
    String num2 = args[1];
    this.array1 = num1.toCharArray();
    this.array2 = num2.toCharArray();
  }
}
