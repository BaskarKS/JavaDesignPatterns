package com.baskarks.design.patterns.behavioral.mediator.mosh.demo.polymorphism;

public class ArticlesDialogBox extends DialogBox {
  private ListBox articlesListBox = new ListBox(this);
  private TextBox titleTextBox = new TextBox(this);
  private Button saveButton = new Button(this);

  @Override
  public void changed(UIControl control) {
    if(control == articlesListBox) {
      articleSelected();
    } else if (control == titleTextBox) {
      titleChanged();
    }
  }

  public ArticlesDialogBox() {
    /*
    * the concrete colleagues are anonymous objects which
    * are communicated back from concrete mediators (Button
    * TextBox, ListBox). mediator (UIControl have all
    * instances of colleague which are registered here)
    * */
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
