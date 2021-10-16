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

/** embeddable class Id for MisthZpstath. generated on 10/15/2021 from a schema. */
public class MisthZpstathId implements Serializable {
  private static final long serialVersionUID = 163436646566349875L;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodstath")
  private java.lang.String kodstath;

  /** Constructor: MisthZpstathId. */
  public MisthZpstathId() {}

  /**
   * Constructor: MisthZpstathId.
   *
   * @param kodxrisi - kodxrisi.
   * @param kodstath - kodstath.
   */
  public MisthZpstathId(java.lang.String kodxrisi, java.lang.String kodstath) {
    this.kodxrisi = kodxrisi;
    this.kodstath = kodstath;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodstath == null) ? 0 : kodstath.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthZpstathId other = (MisthZpstathId) obj;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodstath == null) {
      if (other.kodstath != null) return false;
    } else if (!kodstath.equals(other.kodstath)) return false;

    return true;
  }
}
