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

/** embeddable class Id for Afxtablefields. generated on 03/16/2023 from a schema. */
public class AfxtablefieldsId implements Serializable {
  private static final long serialVersionUID = 167901651874954530L;

  @Column(name = "fieldname")
  private java.lang.String fieldname;

  @Column(name = "tablename")
  private java.lang.String tablename;

  /** Constructor: AfxtablefieldsId. */
  public AfxtablefieldsId() {}

  /**
   * Constructor: AfxtablefieldsId.
   *
   * @param fieldname - fieldname.
   * @param tablename - tablename.
   */
  public AfxtablefieldsId(java.lang.String fieldname, java.lang.String tablename) {
    this.fieldname = fieldname;
    this.tablename = tablename;
  }

  public java.lang.String getFieldname() {
    return this.fieldname;
  }

  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setFieldname(java.lang.String fieldname) {
    this.fieldname = fieldname;
  }

  public void setTablename(java.lang.String tablename) {
    this.tablename = tablename;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fieldname == null) ? 0 : fieldname.hashCode());
    result = prime * result + ((tablename == null) ? 0 : tablename.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AfxtablefieldsId other = (AfxtablefieldsId) obj;

    if (fieldname == null) {
      if (other.fieldname != null) return false;
    } else if (!fieldname.equals(other.fieldname)) return false;

    if (tablename == null) {
      if (other.tablename != null) return false;
    } else if (!tablename.equals(other.tablename)) return false;

    return true;
  }
}
