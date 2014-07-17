package numeron;


public class Judge {

  private Reciever reciever = null;
  private String figureLength = "";

  public Judge(String[] args) {
    reciever = new Reciever(args);
  }

  public String[] execute() {

    figureLength = reciever.getFigureLength();
    String eat = reciever.sumEat();
    String bite = reciever.sumBite();
    String[] result = {eat, bite};

    if (!figureLength.equals(eat)) {
      System.out.println(eat + "EAT" + " " + bite + "BITE");

    } else if (figureLength.equals(eat)) {
      System.out.println(eat + "EAT");

    }



    return result;
  }
}
