package org.sequence;

public class Sequence {
    int[] tab;

    // Constructor
    public Sequence(int[] tab) {
        this.tab = tab;
    }

    // Getter
    public int[] getTab() {
        return tab;
    }

    // Setter
    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public int searchSequence(int sequence[]) {

        // Nombre de fois où la séquence est présente
        int occurence = 0;

        // Longueur de la séquence
        int sequenceLength = sequence.length;

        // Compteur des correspondances consécutives
        int cpt = 0;

        // Pour chaque index du tableau original...
        for (int i = 0; i < tab.length; i++) {

            // Vérifie que pour chaque index du tableau sequence :
            for (int a = 0; a < sequenceLength; a++) {

                // Compare les deux tableaux :

                // Si pas égal, MAIS que l'indice corresponds au début de la séquence : mettre à 1 le compteur
                if (sequence[a] != tab[i] && sequence[0] == tab[i]) {

                    cpt = 1;
                    System.out.println("exception !! ----------- ");
                    System.out.println(" pas égal = i:" + i + " & a:" + a + " car " + tab[i] + " n'est pas égal à " + sequence[a]);
                    System.out.println(" MAIS égal = i:" + i + " & a:" + a + " car " + tab[i] + " est égal à " + sequence[0]);

                    // Je dois passer à la comparaison i suivant avec a[1]...
                    // Donc je reprends d'un i en arrière
                    i--;

                    // Si pas égal, je remets à zéro le compteur
                } else if (sequence[a] != tab[i]) {

                    cpt = 0;

                    System.out.println(" pas égal = i:" + i + " & a:" + a + " car " + tab[i] + " n'est pas égal à " + sequence[a]);
                    System.out.println("compteur " + cpt);

                    // Je passe au i suivant
                    break;

                } else {

                    // Si égal, je compte 1 et je vérifie l'index suivant
                    cpt++;
                    System.out.println("     égal = i:" + i + " & a:" + a + " car " + tab[i] + " est égal à " + sequence[a]);
                    System.out.println("compteur " + cpt);

                    i++;

                    // Si l'élément de tab original et égal à longueur de l'élément de la sequence
                    if (cpt == sequenceLength) {

                        occurence++;
                        cpt = 0;
                        System.out.println("occurence : " + occurence);
                        System.out.println("----------------------------------");

                    }

                }
            }

            System.out.println("---------------***----------------");
            System.out.println("Terminé : la séquence est présente " + occurence + " fois dans le tableau.");

        }

        return occurence;

    }

}
