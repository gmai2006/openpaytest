/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.openpay.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(MisthFinalYpalKratId.class)
@Table(name = "misth_final_ypal_krat")
public class MisthFinalYpalKrat implements Serializable {
  private static final long serialVersionUID = 163436646549415244L;

  /** Description: kodfinal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodfinal")
  private java.lang.Long kodfinal;
  /** Description: kodkrat. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodkrat")
  private java.lang.String kodkrat;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodypal")
  private java.lang.Long kodypal;

  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private java.lang.Double poso;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Integer aa;
  /** Description: notes. */
  @Basic
  @Column(name = "notes", length = 0)
  private java.lang.String notes;
  /** Description: kodkratapod. */
  @Basic
  @Column(name = "kodkratapod")
  private java.lang.Long kodkratapod;

  public MisthFinalYpalKrat() {}

  public java.lang.Long getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Long getKodypal() {
    return this.kodypal;
  }

  public void setKodfinal(java.lang.Long kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodypal(java.lang.Long kodypal) {
    this.kodypal = kodypal;
  }

  public java.lang.Double getPoso() {
    return this.poso;
  }

  public java.lang.Integer getAa() {
    return this.aa;
  }

  public java.lang.String getNotes() {
    return this.notes;
  }

  public java.lang.Long getKodkratapod() {
    return this.kodkratapod;
  }

  public void setPoso(java.lang.Double poso) {
    this.poso = poso;
  }

  public void setAa(java.lang.Integer aa) {
    this.aa = aa;
  }

  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }

  public void setKodkratapod(java.lang.Long kodkratapod) {
    this.kodkratapod = kodkratapod;
  }
}
