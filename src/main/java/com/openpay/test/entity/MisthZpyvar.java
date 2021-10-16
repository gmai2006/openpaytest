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
@IdClass(MisthZpyvarId.class)
@Table(name = "misth_zpyvar")
public class MisthZpyvar implements Serializable {
  private static final long serialVersionUID = 163436646563856950L;

  /** Description: kodyvar. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodyvar")
  private java.lang.String kodyvar;
  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  /** Description: descyvar. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "descyvar", length = 50)
  private java.lang.String descyvar;
  /** Description: expr. */
  @Basic
  @Column(name = "expr", length = 0)
  private java.lang.String expr;

  public MisthZpyvar() {}

  public java.lang.String getKodyvar() {
    return this.kodyvar;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodyvar(java.lang.String kodyvar) {
    this.kodyvar = kodyvar;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDescyvar() {
    return this.descyvar;
  }

  public java.lang.String getExpr() {
    return this.expr;
  }

  public void setDescyvar(java.lang.String descyvar) {
    this.descyvar = descyvar;
  }

  public void setExpr(java.lang.String expr) {
    this.expr = expr;
  }
}
