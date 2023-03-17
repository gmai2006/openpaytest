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

/** embeddable class Id for MisthZpoikog. generated on 03/16/2023 from a schema. */
public class MisthZpoikogId implements Serializable {
  private static final long serialVersionUID = 167901651887566962L;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodoikog")
  private java.lang.String kodoikog;

  /** Constructor: MisthZpoikogId. */
  public MisthZpoikogId() {}

  /**
   * Constructor: MisthZpoikogId.
   *
   * @param kodxrisi - kodxrisi.
   * @param kodoikog - kodoikog.
   */
  public MisthZpoikogId(java.lang.String kodxrisi, java.lang.String kodoikog) {
    this.kodxrisi = kodxrisi;
    this.kodoikog = kodoikog;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodoikog() {
    return this.kodoikog;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodoikog(java.lang.String kodoikog) {
    this.kodoikog = kodoikog;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodoikog == null) ? 0 : kodoikog.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthZpoikogId other = (MisthZpoikogId) obj;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodoikog == null) {
      if (other.kodoikog != null) return false;
    } else if (!kodoikog.equals(other.kodoikog)) return false;

    return true;
  }
}
