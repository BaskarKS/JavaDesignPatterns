package com.baskarks.design.patterns.structural.decorator;

import com.baskarks.design.patterns.structural.decorator.ArtefactInterface;

public class ErrorArtefact implements ArtefactInterface {
    private ArtefactInterface artefact;
    public ErrorArtefact(ArtefactInterface artefact) {
        this.artefact = artefact;
    }
    @Override
    public String render() {
        String value = artefact.render();
        return value + " [Error]";
    }
}
