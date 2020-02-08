package com.baskarks.design.patterns.behavioral.mediator;

public class SignUpDialogBox {
    private TextBox userName = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox terms = new CheckBox();
    private Button signIn = new Button();

    public  SignUpDialogBox() {
        userName.addListener(this::checkSignInValidity);
        password.addListener(this::checkSignInValidity);
        terms.addListener(this::checkSignInValidity);
        signIn.addListener(()-> {
            if (signIn.isEnabled())
                System.out.println("Sign In button Enabled");
        });
    }

    void checkSignInValidity() {
        if (userName.getContent() != null &&
                password.getContent() != null &&
                terms.isChecked())
            signIn.setEnabled(true);
        else
            signIn.setEnabled(false);
    }
    public void setUserName(String name) {
        userName.setContent(name);
    }
    public void setPassword(String pwd) {
        password.setContent(pwd);
    }
    public void setTermsAndConditions() {
        terms.setChecked(true);
    }
}
