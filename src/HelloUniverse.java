import jdk.swing.interop.SwingInterOpUtils;

public class HelloUniverse {
    public static void main(String...args) {
    Planete planeteMercure = new Planete();
        planeteMercure.nom = "Mercure";
        planeteMercure.matiere = "Tellurique";
        planeteMercure.diametre = 4880;
        System.out.println("La planète " + planeteMercure.nom + " est de nature " + planeteMercure.matiere + " et possède un diamètre de " + planeteMercure.diametre + "Kilomètres");

    Planete planeteVenus = new Planete();
        planeteVenus.nom = "Venus";
        planeteVenus.matiere = "Tellurique";
        planeteVenus.diametre= 12100;
        System.out.println("La planète " + planeteVenus.nom + " est de nature " + planeteVenus.matiere);

    Planete planeteMars = new Planete();
        planeteMars.nom = "Mars";
        planeteMars.matiere = "Tellurique";
        planeteMars.diametre = 6792;
        System.out.println("La planète " + planeteMars.nom + " est de nature" + planeteMars.matiere);

   Planete planeteTerre = new Planete();
        planeteTerre.nom = "Terre";
        planeteTerre.matiere = "Tullerique";
        planeteTerre.diametre = 12756;
        System.out.println("La planète " + planeteTerre.nom + " est de nature " + planeteTerre.matiere + " et a un diamètre de " + planeteTerre.diametre + "Kilomètres!");




    Planete planeteJupiter = new Planete();
    planeteJupiter.nom="Jupiter";
    planeteJupiter.matiere="Tellurique";
    planeteJupiter.diametre=142984;

        System.out.println("La planète du système solaire " +planeteJupiter.nom + " est de nature " + planeteJupiter.matiere + " et possède un diamètre de " + planeteJupiter.diametre + " Kilomètres");


    }
}
