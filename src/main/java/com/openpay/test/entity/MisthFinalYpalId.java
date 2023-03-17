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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for MisthFinalYpal. generated on 03/16/2023 from a schema. */
public class MisthFinalYpalId implements Serializable {
  private static final long serialVersionUID = 167901651891370137L;

  @Column(name = "kodfinal")
  private java.lang.Long kodfinal;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodypal")
  private java.lang.Long kodypal;

  /** Constructor: MisthFinalYpalId. */
  public MisthFinalYpalId() {}

  /**
   * Constructor: MisthFinalYpalId.
   *
   * @param kodfinal - kodfinal.
   * @param kodxrisi - kodxrisi.
   * @param kodypal - kodypal.
   */
  public MisthFinalYpalId(
      java.lang.Long kodfinal, java.lang.String kodxrisi, java.lang.Long kodypal) {
    this.kodfinal = kodfinal;
    this.kodxrisi = kodxrisi;
    this.kodypal = kodypal;
  }

  public java.lang.Long getKodfinal() {
    return this.kodfinal;
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

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodypal(java.lang.Long kodypal) {
    this.kodypal = kodypal;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodfinal == null) ? 0 : kodfinal.hashCode());
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodypal == null) ? 0 : kodypal.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthFinalYpalId other = (MisthFinalYpalId) obj;

    if (kodfinal == null) {
      if (other.kodfinal != null) return false;
    } else if (!kodfinal.equals(other.kodfinal)) return false;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodypal == null) {
      if (other.kodypal != null) return false;
    } else if (!kodypal.equals(other.kodypal)) return false;

    return true;
  }
}
