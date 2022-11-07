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
@IdClass(MisthFinalId.class)
@Table(name = "misth_final")
public class MisthFinal implements Serializable {
  private static final long serialVersionUID = 166786182215341651L;

  /** Description: kodfinal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodfinal")
  private java.lang.Long kodfinal;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  /** Description: descfinal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "descfinal", length = 100)
  private java.lang.String descfinal;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 0)
  private java.lang.String title;
  /** Description: datefinal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "datefinal")
  private java.util.Date datefinal;
  /** Description: kodkat. */
  @Basic
  @Column(name = "kodkat", length = 2)
  private java.lang.String kodkat;
  /** Description: kodperiod. */
  @Basic
  @Column(name = "kodperiod", length = 2)
  private java.lang.String kodperiod;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Long aa;

  public MisthFinal() {}

  public java.lang.Long getKodfinal() {
    return this.kodfinal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodfinal(java.lang.Long kodfinal) {
    this.kodfinal = kodfinal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDescfinal() {
    return this.descfinal;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.util.Date getDatefinal() {
    return this.datefinal;
  }

  public java.lang.String getKodkat() {
    return this.kodkat;
  }

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public java.lang.Long getAa() {
    return this.aa;
  }

  public void setDescfinal(java.lang.String descfinal) {
    this.descfinal = descfinal;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setDatefinal(java.util.Date datefinal) {
    this.datefinal = datefinal;
  }

  public void setKodkat(java.lang.String kodkat) {
    this.kodkat = kodkat;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  public void setAa(java.lang.Long aa) {
    this.aa = aa;
  }
}
