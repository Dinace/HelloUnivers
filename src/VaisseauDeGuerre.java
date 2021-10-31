public class VaisseauDeGuerre extends Vaisseau{


    void attaque(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLattaqueEnMinute){
        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme" + armeUtilisee + " pendant " + dureeDeLattaqueEnMinute);
        vaisseauAttaque.resistanceDuBouclier=0;
        vaisseauAttaque.blindage= vaisseauAttaque.blindage/2;
    }
}
