package com.baskarks.design.patterns.behavioral.mediator.mosh.demo;

public class ArticlesDialogBox {
  private ListBox articlesListBox = new ListBox();
  private TextBox titleTextBox = new TextBox();
  private Button saveButton = new Button();

  public ArticlesDialogBox() {
    /*
    * the concrete colleagues are anonymous objects which
    * are communicated back from concrete mediators (Button
    * TextBox, ListBox). mediator (UIControl have all
    * instances of colleague which are registered here)
    * */
    articlesListBox.addEventHandler(this::articleSelected);
    titleTextBox.addEventHandler(this::titleChanged);
/*
    //or
    titleTextBox.addEventHandler(new EventHandler() {
      @Override
      public void handle() {
        titleChanged();
      }
    });
    //or
    titleTextBox.addEventHandler(() -> titleChanged());
*/
  }

  public void simulateUserInteraction() {
    articlesListBox.setSelection("Article 1");
    titleTextBox.setContent("");
    titleTextBox.setContent("Article 2");
    System.out.println("TextBox: " + titleTextBox.getContent());
    System.out.println("Button: " + saveButton.isEnabled());
  }

  private void titleChanged() {
    var content = titleTextBox.getContent();
    var isEmpty = (content == null || content.isEmpty());
    saveButton.setEnabled(!isEmpty);
  }

  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnabled(true);
  }
}
