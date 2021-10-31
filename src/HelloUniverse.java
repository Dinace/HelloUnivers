import jdk.swing.interop.SwingInterOpUtils;

public class HelloUniverse {
    public static void main(String...args) {
    Planete planeteMercure = new Planete("Mercure");
        planeteMercure.matiere = "Tellurique";
        planeteMercure.diametre = 4880;


    Planete planeteVenus = new Planete("Venus");
        planeteVenus.matiere = "Tellurique";
        planeteVenus.diametre= 12100;

    Planete planeteMars = new Planete("Mars");
        planeteMars.matiere = "Tellurique";
        planeteMars.diametre = 6792;

   Planete planeteTerre = new Planete("Terre");
        planeteTerre.matiere = "Tullerique";
        planeteTerre.diametre = 12756;

    Planete planeteJupiter = new Planete("Jupiter");
    planeteJupiter.matiere="Gazeuse";
    planeteJupiter.diametre=142984;

    Planete planeteSaturne = new Planete("Saturne");
    planeteSaturne.matiere="Gazeuse";
    planeteSaturne.diametre=120536;

    Planete planeteUranus = new Planete("Uranus");
    planeteUranus.matiere="Gazeuse";
    planeteUranus.diametre=51118;

    Planete planeteNeptune = new Planete("Neptune");
    planeteNeptune.matiere="Gazeuse";
    planeteNeptune.diametre=49532;


    System.out.println("La planète du système solaire " +planeteJupiter.nom + " est de nature " + planeteJupiter.matiere + " et possède un diamètre de " + planeteJupiter.diametre + " Kilomètres");

    System.out.println("Neptune a effectue " + planeteNeptune.revolution(-3542) + " tours autour de son étoile");
    System.out.println("Mars a effectue " + planeteMars.rotation(-684) + " tours sur elle-même");
    System.out.println("Venus a effectue " + planeteVenus.rotation(-1250)+ " tours sur elle-même!");

    Vaisseau nouveauVaisseau=new Vaisseau();
    nouveauVaisseau.type="FREGATE";
    nouveauVaisseau.nbrePassager=9;

    planeteMars.accueillirVaisseau(nouveauVaisseau);
    Vaisseau autreVaisseau=new Vaisseau();
    autreVaisseau.type="CROISEUR";
    autreVaisseau.nbrePassager=42;
    planeteMars.accueillirVaisseau(autreVaisseau);

    VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
    chasseur.blindage=156;
    chasseur.resistanceDuBouclier=2;
    chasseur.type="CHASSEUR";
    VaisseauCivil vaisseauMonde = new VaisseauCivil();
    vaisseauMonde.blindage=4784;
    vaisseauMonde.resistanceDuBouclier=30;
    vaisseauMonde.type="VAISSEAU-MONDE";
    vaisseauMonde.activerBouclier();
    chasseur.activerBouclier();
    chasseur.attaque(vaisseauMonde, "laserPhotonique", 3);
    vaisseauMonde.desactiverBouclier();

        System.out.println("La durée de protection résiduelle du bouclier du vaisseau monde est " + vaisseauMonde.resistanceDuBouclier);
        System.out.println(" Le blindage du vaisseau monde est " + vaisseauMonde.blindage);




    System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + planeteMars.totalVisiteurs);

    Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxDhydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxDeMethane = 2.5f;

        planeteUranus.atmosphere = atmosphereUranus;
        System.out.println("L'athmosphère d'Uranus est composée : ");
        System.out.println("A " + planeteUranus.atmosphere.tauxDhydrogene + " % d'hydrogène");
        System.out.println("A " + planeteUranus.atmosphere.tauxArgon + " % d'Argon");
        System.out.println("A " + planeteUranus.atmosphere.tauxDazote + " % d'Azote");
        System.out.println("A " + planeteUranus.atmosphere.tauxDioxydeDeCarbonne + " % de Dioxyde de carbonne");
        System.out.println("A " + planeteUranus.atmosphere.tauxHelium + " % d'Hélium");
        System.out.println("A " + planeteUranus.atmosphere.tauxDeMethane + " % de Méthane");
        System.out.println("A " + planeteUranus.atmosphere.tauxSodium + " % de Sodium");

        System.out.println("La forme d'une planete est " + Planete.forme);
        System.out.println("La forme de la planète  Uranus est " + Planete.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));
        System.out.println("Le nombre de planètes découvertes est actuellement de " + Planete.nbPlaneteDecouvertes);




    }
}
