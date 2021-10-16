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

/** embeddable class Id for MisthReportYpal. generated on 10/15/2021 from a schema. */
public class MisthReportYpalId implements Serializable {
  private static final long serialVersionUID = 163436646561354241L;

  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  @Column(name = "kodreport")
  private java.lang.String kodreport;

  @Column(name = "kodypal")
  private java.lang.Long kodypal;

  /** Constructor: MisthReportYpalId. */
  public MisthReportYpalId() {}

  /**
   * Constructor: MisthReportYpalId.
   *
   * @param kodxrisi - kodxrisi.
   * @param kodreport - kodreport.
   * @param kodypal - kodypal.
   */
  public MisthReportYpalId(
      java.lang.String kodxrisi, java.lang.String kodreport, java.lang.Long kodypal) {
    this.kodxrisi = kodxrisi;
    this.kodreport = kodreport;
    this.kodypal = kodypal;
  }

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.String getKodreport() {
    return this.kodreport;
  }

  public java.lang.Long getKodypal() {
    return this.kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodreport(java.lang.String kodreport) {
    this.kodreport = kodreport;
  }

  public void setKodypal(java.lang.Long kodypal) {
    this.kodypal = kodypal;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((kodxrisi == null) ? 0 : kodxrisi.hashCode());
    result = prime * result + ((kodreport == null) ? 0 : kodreport.hashCode());
    result = prime * result + ((kodypal == null) ? 0 : kodypal.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MisthReportYpalId other = (MisthReportYpalId) obj;

    if (kodxrisi == null) {
      if (other.kodxrisi != null) return false;
    } else if (!kodxrisi.equals(other.kodxrisi)) return false;

    if (kodreport == null) {
      if (other.kodreport != null) return false;
    } else if (!kodreport.equals(other.kodreport)) return false;

    if (kodypal == null) {
      if (other.kodypal != null) return false;
    } else if (!kodypal.equals(other.kodypal)) return false;

    return true;
  }
}
