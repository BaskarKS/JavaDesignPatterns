package com.baskarks.design.patterns.structural.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
/*
  private String fontFamily;
  private int fontSize;
  private boolean isBold;
*/
  private CellFontDetails fontDetails;

  public Cell(int row, int column, CellFontDetails fontDetails) {
    this.row = row;
    this.column = column;
    this.fontDetails = fontDetails;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CellFontDetails getFontDetails() {
    return this.fontDetails;
  }

  public void setFontDetails(CellFontDetails fontDetails) {
    this.fontDetails = fontDetails;
  }
/*

  public String getFontFamily() {
    return fontDetails.getFontFamily();
  }

  public void setFontFamily(String fontFamily) {
    this.fontDetails.setFontFamily(fontFamily);
  }
*/

/*
  public int getFontSize() {
    return fontDetails.getFontSize();
  }

  public void setFontSize(int fontSize) {
    this.fontDetails.setFontSize(fontSize);
  }
*/

/*
  public boolean isBold() {
    return fontDetails.isBold();
  }

  public void setBold(boolean bold) {
    fontDetails.setBold(bold);
  }
*/

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontDetails.getFontFamily());
  }
}
