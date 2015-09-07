package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CitationProvider {
    private static CitationProvider citation;
    ;


    private final List<Citation> listCitation = new ArrayList<>();


    public void addCitation(String author, String citation) {
        this.listCitation.add(new Citation(author, citation));
    }

    public static CitationProvider getInstance() {
        if (citation == null) {
            citation = new CitationProvider();
            citation.addCitation("Confucio", "Tudo tem alguma beleza, mas nem todos são capazes de ver");
            citation.addCitation("Ronald Reagan", "Um hippie é alguém que se parece ao Tarzan, anda como a Jane e tem o cheiro da Cheetah");
            citation.addCitation("Albert Einstein", "Nunca penso no futuro - ele já chegará");
            citation.addCitation("Robert Kennedy", "Sempre perdoe aos seus inimigos, mas nunca se esqueça o nome deles.");
            citation.addCitation("Vidal Sassoon", "Ínicio lugar onde o êxito chega antes do trabalho é no dicionário.");
            citation.addCitation("Oscar Wilde", "As mulheres precisam ser amadas, não compreendidas");
            citation.addCitation("Helen Sáller", "Se você vive olhando para o sol, não verá as sombras.");
            citation.addCitation("Garth Brooks", "Ser feliz não é conseguir o que deseja, é desejar o que não possui. ");
            citation.addCitation("Mike Ditka", "O êxito não é© permanente, e fracassar não é mortal. ");
            citation.addCitation("Socrates", "Com certeza, se casem. Se casar com uma boa mulher, será um homem feliz. Se casar com uma mÃƒÂ¡, se convertirá em filosofo.");
            citation.addCitation("Albert Einstein", "NÃƒÂ£o procure ser um homem com ÃƒÂªxito, e sim um homem com valores. ");
            citation.addCitation("Nelson Mandela", "NÃƒÂ£o sou um santo. A menos que para vocÃƒÂª um santo seja um pecador que simplesmente segue se esforÃƒÂ§ando.");
            citation.addCitation("Thomas Edison", "20 citaÃƒÂ§ÃƒÂµes famosas que todo empreendedor deveria conhecer");
            citation.addCitation("Bill Gates", "20 citaÃƒÂ§ÃƒÂµes famosas que todo empreendedor deveria conhecer - InfoMoney");
            citation.addCitation("Warren Buffett", "20 citaÃƒÂ§ÃƒÂµes famosas que todo empreendedor deveria conhecer - InfoMoney");
        }

        return citation;
    }

    public Citation getCitation() {

        int nrAleatorio = 0;
        Random ramdom = new Random();

        for (int i = 0; i < listCitation.size(); i++) {

            nrAleatorio = 0 + ramdom.nextInt(listCitation.size());


        }
        return listCitation.get(nrAleatorio);

    }

}


