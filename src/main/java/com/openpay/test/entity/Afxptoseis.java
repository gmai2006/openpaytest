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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "afxptoseis")
public class Afxptoseis implements Serializable {
  private static final long serialVersionUID = 167901651873970810L;

  /** Description: onom. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "onom")
  private java.lang.String onom;

  /** Description: gen. */
  @Basic
  @Column(name = "gen", length = 50)
  private java.lang.String gen;
  /** Description: ait. */
  @Basic
  @Column(name = "ait", length = 50)
  private java.lang.String ait;

  public Afxptoseis() {}

  public java.lang.String getOnom() {
    return this.onom;
  }

  public void setOnom(java.lang.String onom) {
    this.onom = onom;
  }

  public java.lang.String getGen() {
    return this.gen;
  }

  public java.lang.String getAit() {
    return this.ait;
  }

  public void setGen(java.lang.String gen) {
    this.gen = gen;
  }

  public void setAit(java.lang.String ait) {
    this.ait = ait;
  }
}
