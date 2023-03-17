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
@IdClass(MisthZptitlosId.class)
@Table(name = "misth_zptitlos")
public class MisthZptitlos implements Serializable {
  private static final long serialVersionUID = 167901651911910120L;

  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodtitlos. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodtitlos")
  private java.lang.String kodtitlos;

  /** Description: desctitlos. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "desctitlos", length = 10)
  private java.lang.String desctitlos;

  public MisthZptitlos() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodtitlos() {
    return this.kodtitlos;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodtitlos(java.lang.String kodtitlos) {
    this.kodtitlos = kodtitlos;
  }

  public java.lang.String getDesctitlos() {
    return this.desctitlos;
  }

  public void setDesctitlos(java.lang.String desctitlos) {
    this.desctitlos = desctitlos;
  }
}
