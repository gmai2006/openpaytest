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

/** embeddable class Id for MisthZpperiod. generated on 10/15/2021 from a schema. */
public class MisthZpperiodId implements Serializable {
  private static final long serialVersionUID = 163436646522481981L;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodperiod")
  private java.lang.String kodperiod;

  /** Constructor: MisthZpperiodId. */
  public MisthZpperiodId() {}

  /**
   * Constructor: MisthZpperiodId.
   *
   * @param kodxrisi - kodxrisi.
   * @param kodperiod - kodperiod.
   */
  public MisthZpperiodId(java.lang.String kodxrisi, java.lang.String kodperiod) {
    this.kodxrisi = kodxrisi;
    this.kodperiod = kodperiod;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodperiod() {
    return this.kodperiod;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodperiod(java.lang.String kodperiod) {
    this.kodperiod = kodperiod;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodperiod == null) ? 0 : kodperiod.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthZpperiodId other = (MisthZpperiodId) obj;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodperiod == null) {
      if (other.kodperiod != null) return false;
    } else if (!kodperiod.equals(other.kodperiod)) return false;

    return true;
  }
}
