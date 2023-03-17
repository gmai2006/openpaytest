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
@IdClass(MisthZpstathId.class)
@Table(name = "misth_zpstath")
public class MisthZpstath implements Serializable {
  private static final long serialVersionUID = 167901651910819026L;

  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodstath. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodstath")
  private java.lang.String kodstath;

  /** Description: descstath. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "descstath", length = 50)
  private java.lang.String descstath;
  /** Description: poso. */
  @Basic
  @Column(name = "poso")
  private java.lang.Double poso;

  public MisthZpstath() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodstath() {
    return this.kodstath;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodstath(java.lang.String kodstath) {
    this.kodstath = kodstath;
  }

  public java.lang.String getDescstath() {
    return this.descstath;
  }

  public java.lang.Double getPoso() {
    return this.poso;
  }

  public void setDescstath(java.lang.String descstath) {
    this.descstath = descstath;
  }

  public void setPoso(java.lang.Double poso) {
    this.poso = poso;
  }
}
