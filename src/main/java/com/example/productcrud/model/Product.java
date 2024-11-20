package com.example.productcrud.model;

public class Product {
  private Long id;
  private String name;
  private String description;
  private double price;

  public Product() {
  }

  public Product(Long id, String name, String description, double price) {
    setId(id);
    setName(name);
    setDescription(description);
    setPrice(price);
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}