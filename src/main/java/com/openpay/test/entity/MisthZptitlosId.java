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

/** embeddable class Id for MisthZptitlos. generated on 03/16/2023 from a schema. */
public class MisthZptitlosId implements Serializable {
  private static final long serialVersionUID = 167901651911495762L;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodtitlos")
  private java.lang.String kodtitlos;

  /** Constructor: MisthZptitlosId. */
  public MisthZptitlosId() {}

  /**
   * Constructor: MisthZptitlosId.
   *
   * @param kodxrisi - kodxrisi.
   * @param kodtitlos - kodtitlos.
   */
  public MisthZptitlosId(java.lang.String kodxrisi, java.lang.String kodtitlos) {
    this.kodxrisi = kodxrisi;
    this.kodtitlos = kodtitlos;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodtitlos == null) ? 0 : kodtitlos.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthZptitlosId other = (MisthZptitlosId) obj;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodtitlos == null) {
      if (other.kodtitlos != null) return false;
    } else if (!kodtitlos.equals(other.kodtitlos)) return false;

    return true;
  }
}
