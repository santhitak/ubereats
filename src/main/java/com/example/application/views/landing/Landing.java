package com.example.application.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static com.vaadin.flow.component.icon.VaadinIcon.*;

@PageTitle("Uber Eats | Food delivery and Takeout")
@Route(value = "")
public class Landing extends VerticalLayout{

    public Landing() {
        Button btnLogin = new Button("Log in", USER.create());
        btnLogin.setClassName("btnLogin");
        Button btnSignup = new Button("Sign up");
        HorizontalLayout navbar = new HorizontalLayout();
        HorizontalLayout btn = new HorizontalLayout();
        btn.add(btnLogin, btnSignup);
        btn.setSpacing(true);

        navbar.add(new H2("UberEats"), btn);
        navbar.setSizeFull();
        navbar.setAlignItems(Alignment.BASELINE);
        navbar.setJustifyContentMode(JustifyContentMode.BETWEEN);

        add(navbar);

        setSizeFull();
        setClassName("setBackgroundImage");
        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
    }
}