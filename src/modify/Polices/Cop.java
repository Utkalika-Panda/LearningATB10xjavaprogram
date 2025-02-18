package modify.Polices;



public class Cop {
    String ID_Card;
    int Gun;

    public Cop(int gun) {
        this.Gun = gun;
    }
    protected void CanIshoot(){
        System.out.println("I can shoot");
    }
}
