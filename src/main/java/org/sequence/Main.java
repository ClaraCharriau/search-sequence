package org.sequence;

public class Main {

    public static void main(String[] args) {

        int tab[] = {4,1,7,9,1,2,3,0,7,1,2,1,2,3,3,6,4,3,1,2,3,8,6,4};
        int sequence[] = {1,2,3};

        Sequence nouvelleSequence = new Sequence(tab);
        nouvelleSequence.searchSequence(sequence);

    }

}
