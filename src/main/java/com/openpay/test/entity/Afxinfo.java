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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "afxinfo")
public class Afxinfo implements Serializable {
  private static final long serialVersionUID = 167901651872562636L;

  /** Description: default_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "default_id")
  private java.lang.String defaultId;

  /** Description: dbver. */
  @Basic
  @Column(name = "dbver", length = 10)
  private java.lang.String dbver;

  public Afxinfo() {}

  public java.lang.String getDefaultId() {
    return this.defaultId;
  }

  public void setDefaultId(java.lang.String defaultId) {
    this.defaultId = defaultId;
  }

  public java.lang.String getDbver() {
    return this.dbver;
  }

  public void setDbver(java.lang.String dbver) {
    this.dbver = dbver;
  }
}
