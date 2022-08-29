package com.example.application.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static com.vaadin.flow.component.icon.VaadinIcon.*;

@PageTitle("Uber Eats | Food delivery and Takeout")
@Route(value = "")
public class Landing extends VerticalLayout{

    public Landing() {
        Button btnLogin = new Button("Log in", USER.create());
        btnLogin.setClassName("btnBlackText btn");
        Button btnSignup = new Button("Sign up");
        btnSignup.setClassName("btnWhiteText btn");

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
        navbar.setHeight("auto");

        VerticalLayout orderFood = new VerticalLayout();

        H1 your_door = new H1("Order food to your door");
        your_door.setClassName("text-xl text");

        FormLayout findFood = new FormLayout();
        TextField address = new TextField();
        address.setPlaceholder("Enter delivery address");

        Select<String> time = new Select<>();
        time.setItems("Delivery now", "Delivery later", "Self Pick-up");
        time.setValue("Delivery now");

        Button find = new Button("Find Food");
        find.setClassName("btnWhiteText");

        findFood.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("320px", 3)
        );

        findFood.add(address, time, find);
        orderFood.add(your_door, findFood);
        orderFood.setHeight("60vh");
        orderFood.setWidth("45vw");
        orderFood.setJustifyContentMode(JustifyContentMode.CENTER);

        add(navbar, orderFood);

        setSizeFull();
        setClassName("setBackgroundImage");
        setJustifyContentMode(JustifyContentMode.START);
        setDefaultHorizontalComponentAlignment(Alignment.START);
    }

}