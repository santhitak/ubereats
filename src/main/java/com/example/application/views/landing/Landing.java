package com.example.application.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
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
        btnLogin.setClassName("btnLogin btn");
        Button btnSignup = new Button("Sign up");
        btnSignup.setClassName("btnSignup btn");

        HorizontalLayout navbar = new HorizontalLayout();

        HorizontalLayout btn = new HorizontalLayout();
        btn.add(btnLogin, btnSignup);
        btn.setSpacing(true);

        H2 uber = new H2("Uber");
        H2 eats = new H2("Eats");
        uber.setClassName("text uber");
        eats.setClassName("text eats");
        HorizontalLayout uber_eats = new HorizontalLayout();
        uber_eats.setSpacing(false);
        uber_eats.add(uber, eats);

        HorizontalLayout rightItem = new HorizontalLayout();
        rightItem.add(MENU.create(), uber_eats);
        rightItem.setClassName("text");
        rightItem.setAlignItems(Alignment.BASELINE);

        navbar.add(rightItem, btn);
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