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
@Table(name = "afxtable")
public class Afxtable implements Serializable {
  private static final long serialVersionUID = 167901651874476556L;

  /** Description: tablename. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tablename")
  private java.lang.String tablename;

  /** Description: tabledesc. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tabledesc", length = 50)
  private java.lang.String tabledesc;

  public Afxtable() {}

  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setTablename(java.lang.String tablename) {
    this.tablename = tablename;
  }

  public java.lang.String getTabledesc() {
    return this.tabledesc;
  }

  public void setTabledesc(java.lang.String tabledesc) {
    this.tabledesc = tabledesc;
  }
}
