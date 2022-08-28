package com.example.application.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Uber Eats | Food delivery and Takeout")
@Route(value = "")
public class Landing extends VerticalLayout {

    public Landing() {
        Button btnLogin = new Button("Log in");
        Button btnSignup = new Button("Sign up");
        FormLayout menu = new FormLayout();

        menu.setResponsiveSteps(new FormLayout.ResponsiveStep("200px", 3));
        menu.setSizeFull();
        menu.add(new H2("UberEats"), btnLogin, btnSignup);


        add(menu);

        setSizeFull();
        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}