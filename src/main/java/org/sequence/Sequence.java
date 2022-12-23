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

        // Pour chaque index du tableau original :
        for ( int i = 0 ; i < tab.length ; i++ ) {

            // Vérifie que pour chaque index du tableau sequence :
            for (int a = 0; a < sequenceLength ; a++) {

                // Compare les deux tableaux :

                    // Si pas égal, remets à zéro le compteur
                if (sequence[a] != tab[i]) {

                    cpt = 0;

                    System.out.println(" pas égal = i:" + i + " & a:" + a + " car " + tab[i] + " n'est pas égal à " + sequence[a]);
                    System.out.println("compteur " + cpt);

                    // Passer au i suivant
                    break;

                } else {

                    // Si égal, compte 1 et vérifie l'index suivant
                    cpt++;
                    System.out.println("     égal = i:" + i + " & a:" + a + " car " + tab[i] + " est égal à " + sequence[a]);
                    System.out.println("compteur " + cpt);

                    i++;

                    // Si l'élément de tab original et égal à longueur de l'élément de la sequence
                    if (cpt == sequenceLength) {

                        // Ajoute une occurence et remets compteur à zéro
                        occurence++;
                        cpt = 0;
                        System.out.println("occurence : " + occurence);
                        System.out.println("----------------------------------");

                    }

                }
            }
        }

        System.out.println("---------------***----------------");
        System.out.println("Terminé : la séquence est présente " + occurence + " fois dans le tableau.");
        return occurence;

    }

}
