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

/** embeddable class Id for MisthZptamio. generated on 11/07/2022 from a schema. */
public class MisthZptamioId implements Serializable {
  private static final long serialVersionUID = 166786182219482665L;

  @Column(name = "kodtamio")
  private java.lang.String kodtamio;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  /** Constructor: MisthZptamioId. */
  public MisthZptamioId() {}

  /**
   * Constructor: MisthZptamioId.
   *
   * @param kodtamio - kodtamio.
   * @param kodxrisi - kodxrisi.
   */
  public MisthZptamioId(java.lang.String kodtamio, java.lang.String kodxrisi) {
    this.kodtamio = kodtamio;
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getKodtamio() {
    return this.kodtamio;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodtamio(java.lang.String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodtamio == null) ? 0 : kodtamio.hashCode());
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthZptamioId other = (MisthZptamioId) obj;

    if (kodtamio == null) {
      if (other.kodtamio != null) return false;
    } else if (!kodtamio.equals(other.kodtamio)) return false;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    return true;
  }
}
