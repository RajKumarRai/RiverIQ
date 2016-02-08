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
public class LabeledDocument extends Document implements Serializable {
  private Double label;

  public LabeledDocument(Long id, String text, Double label) {
    super(id, text);
    this.label = label;
  }

  public Double getLabel() { return this.label; }
  public void setLabel(Double label) { this.label = label; }
}
