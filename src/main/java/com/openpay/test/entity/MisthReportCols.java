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
@IdClass(MisthReportColsId.class)
@Table(name = "misth_report_cols")
public class MisthReportCols implements Serializable {
  private static final long serialVersionUID = 16678618224096909L;

  /** Description: kodcol. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodcol")
  private java.lang.Integer kodcol;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodreport. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodreport")
  private java.lang.String kodreport;

  /** Description: expr. */
  @Basic
  @Column(name = "expr", length = 0)
  private java.lang.String expr;
  /** Description: header_text. */
  @Basic
  @Column(name = "header_text", length = 50)
  private java.lang.String headerText;
  /** Description: width. */
  @Basic
  @Column(name = "width")
  private java.lang.Integer width;
  /** Description: aa. */
  @Basic
  @Column(name = "aa")
  private java.lang.Integer aa;

  public MisthReportCols() {}

  public java.lang.Integer getKodcol() {
    return this.kodcol;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public void setKodcol(java.lang.Integer kodcol) {
    this.kodcol = kodcol;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public java.lang.String getHeaderText() {
    return this.headerText;
  }

  public java.lang.Integer getWidth() {
    return this.width;
  }

  public java.lang.Integer getAa() {
    return this.aa;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }

  public void setHeaderText(java.lang.String headerText) {
    this.headerText = headerText;
  }

  public void setWidth(java.lang.Integer width) {
    this.width = width;
  }

  public void setAa(java.lang.Integer aa) {
    this.aa = aa;
  }
}
