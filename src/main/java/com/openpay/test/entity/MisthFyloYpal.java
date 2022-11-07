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
@IdClass(MisthFyloYpalId.class)
@Table(name = "misth_fylo_ypal")
public class MisthFyloYpal implements Serializable {
  private static final long serialVersionUID = 1667861822382619L;

  /** Description: kodfylo. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodfylo")
  private java.lang.String kodfylo;
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

  public MisthFyloYpal() {}

  public java.lang.String getKodfylo() {
    return this.kodfylo;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Long getKodypal() {
    return this.kodypal;
  }

  public void setKodfylo(java.lang.String kodfylo) {
    this.kodfylo = kodfylo;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodypal(java.lang.Long kodypal) {
    this.kodypal = kodypal;
  }
}
