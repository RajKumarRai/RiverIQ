/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textclassificationml;

import java.io.Serializable;

/**
 *
 * @author RajKumar
 */

public class Document implements Serializable {
  private Long id;
  private String text;

  public Document(Long id, String text) {
    this.id = id;
    this.text = text;
  }

  public Long getId() { return this.id; }
  public void setId(Long id) { this.id = id; }

  public String getText() { return this.text; }
  public void setText(String text) { this.text = text; }
}



