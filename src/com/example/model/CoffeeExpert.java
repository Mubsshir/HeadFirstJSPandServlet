package com.example.model;
import java.util.*;

public class CoffeeExpert {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public List getCoffeeSuggestion(String color){
    List coffee=new ArrayList();
    if(color.equals("amber")){
      coffee.add("Green Coffee");
      coffee.add("Black Coffee");
    }else{
      coffee.add("Filter Coffee");
      coffee.add("Cold Coffee");
    }
    return coffee;
  }
}
