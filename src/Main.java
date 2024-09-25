public class Main {
    public static void main(String[] args) {

        Rettangolo rt = new Rettangolo(5,6);
        rt.stampaRettangolo();
        Rettangolo rt2 = new Rettangolo(4,3);
        rt2.stampaRettangolo();



        Sim sm = new Sim("345322323");
        sm.aggiornaCredito(20.0);
        sm.aggiungiChiamata("3481234567", 3);
        sm.aggiungiChiamata("3479876543", 10);
        sm.datiSim();
    }
}