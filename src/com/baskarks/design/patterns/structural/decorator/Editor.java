package com.baskarks.design.patterns.structural.decorator;

public class Editor {
    public void openProject(String path) {
//        Artefact[] artefacts = {
        ArtefactInterface[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };
/*
        artefacts[0].setMain(true);
        artefacts[2].setHasError(true);
*/
        artefacts[0] = new MainArtefact(artefacts[0]);
        artefacts[2] = new ErrorArtefact(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
