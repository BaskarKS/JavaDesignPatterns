package com.baskarks.design.patterns.structural.decorator;

public class MainArtefact implements ArtefactInterface {
    private ArtefactInterface artefact;
    public MainArtefact(ArtefactInterface artefact) {
        this.artefact = artefact;
    }
    @Override
    public String render() {
        String value = artefact.render();
        return value + " [Main]";
    }
}
