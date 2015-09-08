package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CitationProvider {


    ArrayList<String> listAuthor = new ArrayList();
    ArrayList<String> listCitation = new ArrayList();

    public void populaListas (){
        listAuthor.add("Rene Descartes");
        listCitation.add("Não existem métodos fáceis para resolver problemas difíceis.");
        listAuthor.add("Gabriel o Pensador");
        listCitation.add("Aquilo que o mundo pede não é aquilo que o mundo me dá.");
        listAuthor.add("Santo Agostinho");
        listCitation.add("Deus, que te criou sem ti, não te salvará sem ti.");
        listAuthor.add("JEAN-PAUL SARTRE");
        listCitation.add("O importante não é aquilo que fazem de nós, mas o que nós mesmos fazemos do que os outros fizeram de nós.");
        listAuthor.add("Kurt Cobain");
        listCitation.add("Prefiro ser odiado por quem sou do que ser amado por quem não sou.");
        listAuthor.add("Rui Barbosa");
        listCitation.add("Outrora se amilhavam asnos, porcos e galinhas. Hoje em dia há galinheiros, pocilgas e estrebarias oficiais, onde se amilham escritores.");
        listAuthor.add("Cora Carolina");
        listCitation.add("“Criança periférica, rejeitada. Teu mundo é o submundo.");
        listAuthor.add("Leonardo da Vinci");
        listCitation.add("Não desprezes a pintura, pois estarás a desprezar a contemplação apurada e filosófica do universo.");
        listAuthor.add("Joao Paulo II");
        listCitation.add("A Igreja é a carícia do amor de Deus ao mundo.");
        listAuthor.add("Tales de Mileto");
        listCitation.add("Toma para ti o conselho que dá aos outros.");
    }

    public void addCitation(String author, String citation){
        listAuthor.add(author);
        listCitation.add(citation);

    }

    public String getCitation(){
        String author;
        String citation;

        Random r = new Random();
        int index = (r.nextInt(listAuthor.size()));

        author = listAuthor.get(index);
        citation = listCitation.get(index);

        return author + " - " + citation;

    }

}

