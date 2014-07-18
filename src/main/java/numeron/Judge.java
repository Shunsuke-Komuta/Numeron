package numeron;


public class Judge {

  private Reciever reciever = null;

  private String eat = "";
  private String bite = "";
  private String[] figureLengths = null;


  public String[] execute(String[] args) {

    reciever = new Reciever();

    figureLengths = reciever.getFigureLength(args);
    eat = reciever.sumEat(args);
    bite = reciever.sumBite(args);
    String[] result = {eat, bite};

    output(figureLengths, bite, bite);

    return result;
  }

  private void output(String[] figureLengths, String eat, String bite) {
    if (!figureLengths[0].equals(eat)) {
      System.out.println(eat + "EAT" + " " + bite + "BITE");

    } else if (figureLengths[1].equals(eat)) {
      System.out.println(eat + "EAT");
    }
  }
}
