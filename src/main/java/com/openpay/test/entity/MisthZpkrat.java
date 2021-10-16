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
@IdClass(MisthZpkratId.class)
@Table(name = "misth_zpkrat")
public class MisthZpkrat implements Serializable {
  private static final long serialVersionUID = 163436646546771556L;

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

  /** Description: desckrat. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "desckrat", length = 50)
  private java.lang.String desckrat;
  /** Description: isforos. */
  @Basic
  @Column(name = "isforos")
  private java.lang.Integer isforos;
  /** Description: isasf. */
  @Basic
  @Column(name = "isasf")
  private java.lang.Integer isasf;
  /** Description: isautoforos. */
  @Basic
  @Column(name = "isautoforos")
  private java.lang.Integer isautoforos;

  public MisthZpkrat() {}

  public java.lang.String getKodkrat() {
    return this.kodkrat;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodkrat(java.lang.String kodkrat) {
    this.kodkrat = kodkrat;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDesckrat() {
    return this.desckrat;
  }

  public java.lang.Integer getIsforos() {
    return this.isforos;
  }

  public java.lang.Integer getIsasf() {
    return this.isasf;
  }

  public java.lang.Integer getIsautoforos() {
    return this.isautoforos;
  }

  public void setDesckrat(java.lang.String desckrat) {
    this.desckrat = desckrat;
  }

  public void setIsforos(java.lang.Integer isforos) {
    this.isforos = isforos;
  }

  public void setIsasf(java.lang.Integer isasf) {
    this.isasf = isasf;
  }

  public void setIsautoforos(java.lang.Integer isautoforos) {
    this.isautoforos = isautoforos;
  }
}
