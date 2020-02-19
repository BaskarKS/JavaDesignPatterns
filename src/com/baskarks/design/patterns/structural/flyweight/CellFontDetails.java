package com.baskarks.design.patterns.structural.flyweight;

public class CellFontDetails {
    private String fontFamily;

    private int fontSize;
    private boolean isBold;
    public CellFontDetails(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public void setBold(boolean isBold) {
        this.isBold = isBold;
    }
    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

    @Override
    public String toString() {
        return "fontFamily='" + fontFamily + '\'' +
                ", fontSize=" + fontSize +
                ", isBold=" + isBold;
    }
}
