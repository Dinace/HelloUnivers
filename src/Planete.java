public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAccoste;
    static String forme = "Sphérique";
    static int nbPlaneteDecouvertes;
    Planete( String nom){
        this.nom=nom;
        nbPlaneteDecouvertes++;
    }

    int revolution(int angle) {
        return angle / 360;
    }

    int rotation(int angle) {
        return angle / 360;
    }

    static String expansion(double distanceEntreDeuxPlanetes){
        if(distanceEntreDeuxPlanetes < 14){
            return "Oh la la, mais c'est super rapide!!";
        }
        else {

            return "Je rêve ou c'est plus rapide que la lumière!";
        }
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteurs = totalVisiteurs + vaisseau.nbrePassager;
        if (vaisseauActuellementAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type" + vaisseauActuellementAccoste.type + " doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent=vaisseauActuellementAccoste;
        vaisseauActuellementAccoste=vaisseau;
        return vaisseauPrecedent;

    }
}


