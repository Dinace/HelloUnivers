public class Vaisseau {
    int nbrePassager;
    String type;
    int blindage;
    int resistanceDuBouclier;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type" + type);
    }
    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }

}
