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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(MisthYpalId.class)
@Table(name = "misth_ypal")
public class MisthYpal implements Serializable {
  private static final long serialVersionUID = 16790165188927032L;

  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;
  /** Description: kodypal. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodypal")
  private java.lang.Long kodypal;

  /** Description: surname. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "surname", length = 70)
  private java.lang.String surname;
  /** Description: name. */
  @Basic
  @Column(name = "name", length = 30)
  private java.lang.String name;
  /** Description: fathername. */
  @Basic
  @Column(name = "fathername", length = 30)
  private java.lang.String fathername;
  /** Description: adt. */
  @Basic
  @Column(name = "adt", length = 10)
  private java.lang.String adt;
  /** Description: mitroo. */
  @Basic
  @Column(name = "mitroo", length = 20)
  private java.lang.String mitroo;
  /** Description: afm. */
  @Basic
  @Column(name = "afm", length = 10)
  private java.lang.String afm;
  /** Description: doy. */
  @Basic
  @Column(name = "doy", length = 50)
  private java.lang.String doy;
  /** Description: kodtitlos. */
  @Basic
  @Column(name = "kodtitlos", length = 2)
  private java.lang.String kodtitlos;
  /** Description: birthdate. */
  @Basic
  @Column(name = "birthdate")
  private java.util.Date birthdate;
  /** Description: homephone. */
  @Basic
  @Column(name = "homephone", length = 50)
  private java.lang.String homephone;
  /** Description: mobilphone. */
  @Basic
  @Column(name = "mobilphone", length = 50)
  private java.lang.String mobilphone;
  /** Description: sex. */
  @Basic
  @Column(name = "sex", length = 1)
  private java.lang.String sex;
  /** Description: spouse. */
  @Basic
  @Column(name = "spouse", length = 100)
  private java.lang.String spouse;
  /** Description: childs. */
  @Basic
  @Column(name = "childs")
  private java.lang.Integer childs;
  /** Description: prostmeli. */
  @Basic
  @Column(name = "prostmeli")
  private java.lang.Integer prostmeli;
  /** Description: city. */
  @Basic
  @Column(name = "city", length = 50)
  private java.lang.String city;
  /** Description: area. */
  @Basic
  @Column(name = "area", length = 50)
  private java.lang.String area;
  /** Description: address. */
  @Basic
  @Column(name = "address", length = 100)
  private java.lang.String address;
  /** Description: tk. */
  @Basic
  @Column(name = "tk", length = 10)
  private java.lang.String tk;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 100)
  private java.lang.String email;
  /** Description: kodtmima. */
  @Basic
  @Column(name = "kodtmima", length = 2)
  private java.lang.String kodtmima;
  /** Description: kodidikot. */
  @Basic
  @Column(name = "kodidikot", length = 2)
  private java.lang.String kodidikot;
  /** Description: jobtitle. */
  @Basic
  @Column(name = "jobtitle", length = 100)
  private java.lang.String jobtitle;
  /** Description: hireddate. */
  @Basic
  @Column(name = "hireddate")
  private java.util.Date hireddate;
  /** Description: rehireddate. */
  @Basic
  @Column(name = "rehireddate")
  private java.util.Date rehireddate;
  /** Description: termdate. */
  @Basic
  @Column(name = "termdate")
  private java.util.Date termdate;
  /** Description: termreason. */
  @Basic
  @Column(name = "termreason", length = 100)
  private java.lang.String termreason;
  /** Description: jobphone. */
  @Basic
  @Column(name = "jobphone", length = 50)
  private java.lang.String jobphone;
  /** Description: intphone. */
  @Basic
  @Column(name = "intphone", length = 20)
  private java.lang.String intphone;
  /** Description: klimakio. */
  @Basic
  @Column(name = "klimakio")
  private java.lang.Integer klimakio;
  /** Description: bathmos. */
  @Basic
  @Column(name = "bathmos", length = 1)
  private java.lang.String bathmos;
  /** Description: klados. */
  @Basic
  @Column(name = "klados", length = 10)
  private java.lang.String klados;
  /** Description: bank. */
  @Basic
  @Column(name = "bank", length = 100)
  private java.lang.String bank;
  /** Description: bankno. */
  @Basic
  @Column(name = "bankno", length = 50)
  private java.lang.String bankno;
  /** Description: exeldate. */
  @Basic
  @Column(name = "exeldate")
  private java.util.Date exeldate;
  /** Description: kodthesi. */
  @Basic
  @Column(name = "kodthesi", length = 2)
  private java.lang.String kodthesi;
  /** Description: kodoikog. */
  @Basic
  @Column(name = "kodoikog", length = 2)
  private java.lang.String kodoikog;
  /** Description: kodtamio. */
  @Basic
  @Column(name = "kodtamio", length = 2)
  private java.lang.String kodtamio;
  /** Description: mothername. */
  @Basic
  @Column(name = "mothername", length = 30)
  private java.lang.String mothername;
  /** Description: newexeldate. */
  @Basic
  @Column(name = "newexeldate")
  private java.util.Date newexeldate;

  public MisthYpal() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public java.lang.Long getKodypal() {
    return this.kodypal;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public void setKodypal(java.lang.Long kodypal) {
    this.kodypal = kodypal;
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getFathername() {
    return this.fathername;
  }

  public java.lang.String getAdt() {
    return this.adt;
  }

  public java.lang.String getMitroo() {
    return this.mitroo;
  }

  public java.lang.String getAfm() {
    return this.afm;
  }

  public java.lang.String getDoy() {
    return this.doy;
  }

  public java.lang.String getKodtitlos() {
    return this.kodtitlos;
  }

  public java.util.Date getBirthdate() {
    return this.birthdate;
  }

  public java.lang.String getHomephone() {
    return this.homephone;
  }

  public java.lang.String getMobilphone() {
    return this.mobilphone;
  }

  public java.lang.String getSex() {
    return this.sex;
  }

  public java.lang.String getSpouse() {
    return this.spouse;
  }

  public java.lang.Integer getChilds() {
    return this.childs;
  }

  public java.lang.Integer getProstmeli() {
    return this.prostmeli;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getArea() {
    return this.area;
  }

  public java.lang.String getAddress() {
    return this.address;
  }

  public java.lang.String getTk() {
    return this.tk;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getKodtmima() {
    return this.kodtmima;
  }

  public java.lang.String getKodidikot() {
    return this.kodidikot;
  }

  public java.lang.String getJobtitle() {
    return this.jobtitle;
  }

  public java.util.Date getHireddate() {
    return this.hireddate;
  }

  public java.util.Date getRehireddate() {
    return this.rehireddate;
  }

  public java.util.Date getTermdate() {
    return this.termdate;
  }

  public java.lang.String getTermreason() {
    return this.termreason;
  }

  public java.lang.String getJobphone() {
    return this.jobphone;
  }

  public java.lang.String getIntphone() {
    return this.intphone;
  }

  public java.lang.Integer getKlimakio() {
    return this.klimakio;
  }

  public java.lang.String getBathmos() {
    return this.bathmos;
  }

  public java.lang.String getKlados() {
    return this.klados;
  }

  public java.lang.String getBank() {
    return this.bank;
  }

  public java.lang.String getBankno() {
    return this.bankno;
  }

  public java.util.Date getExeldate() {
    return this.exeldate;
  }

  public java.lang.String getKodthesi() {
    return this.kodthesi;
  }

  public java.lang.String getKodoikog() {
    return this.kodoikog;
  }

  public java.lang.String getKodtamio() {
    return this.kodtamio;
  }

  public java.lang.String getMothername() {
    return this.mothername;
  }

  public java.util.Date getNewexeldate() {
    return this.newexeldate;
  }

  public void setSurname(java.lang.String surname) {
    this.surname = surname;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setFathername(java.lang.String fathername) {
    this.fathername = fathername;
  }

  public void setAdt(java.lang.String adt) {
    this.adt = adt;
  }

  public void setMitroo(java.lang.String mitroo) {
    this.mitroo = mitroo;
  }

  public void setAfm(java.lang.String afm) {
    this.afm = afm;
  }

  public void setDoy(java.lang.String doy) {
    this.doy = doy;
  }

  public void setKodtitlos(java.lang.String kodtitlos) {
    this.kodtitlos = kodtitlos;
  }

  public void setBirthdate(java.util.Date birthdate) {
    this.birthdate = birthdate;
  }

  public void setHomephone(java.lang.String homephone) {
    this.homephone = homephone;
  }

  public void setMobilphone(java.lang.String mobilphone) {
    this.mobilphone = mobilphone;
  }

  public void setSex(java.lang.String sex) {
    this.sex = sex;
  }

  public void setSpouse(java.lang.String spouse) {
    this.spouse = spouse;
  }

  public void setChilds(java.lang.Integer childs) {
    this.childs = childs;
  }

  public void setProstmeli(java.lang.Integer prostmeli) {
    this.prostmeli = prostmeli;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setArea(java.lang.String area) {
    this.area = area;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

  public void setTk(java.lang.String tk) {
    this.tk = tk;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setKodtmima(java.lang.String kodtmima) {
    this.kodtmima = kodtmima;
  }

  public void setKodidikot(java.lang.String kodidikot) {
    this.kodidikot = kodidikot;
  }

  public void setJobtitle(java.lang.String jobtitle) {
    this.jobtitle = jobtitle;
  }

  public void setHireddate(java.util.Date hireddate) {
    this.hireddate = hireddate;
  }

  public void setRehireddate(java.util.Date rehireddate) {
    this.rehireddate = rehireddate;
  }

  public void setTermdate(java.util.Date termdate) {
    this.termdate = termdate;
  }

  public void setTermreason(java.lang.String termreason) {
    this.termreason = termreason;
  }

  public void setJobphone(java.lang.String jobphone) {
    this.jobphone = jobphone;
  }

  public void setIntphone(java.lang.String intphone) {
    this.intphone = intphone;
  }

  public void setKlimakio(java.lang.Integer klimakio) {
    this.klimakio = klimakio;
  }

  public void setBathmos(java.lang.String bathmos) {
    this.bathmos = bathmos;
  }

  public void setKlados(java.lang.String klados) {
    this.klados = klados;
  }

  public void setBank(java.lang.String bank) {
    this.bank = bank;
  }

  public void setBankno(java.lang.String bankno) {
    this.bankno = bankno;
  }

  public void setExeldate(java.util.Date exeldate) {
    this.exeldate = exeldate;
  }

  public void setKodthesi(java.lang.String kodthesi) {
    this.kodthesi = kodthesi;
  }

  public void setKodoikog(java.lang.String kodoikog) {
    this.kodoikog = kodoikog;
  }

  public void setKodtamio(java.lang.String kodtamio) {
    this.kodtamio = kodtamio;
  }

  public void setMothername(java.lang.String mothername) {
    this.mothername = mothername;
  }

  public void setNewexeldate(java.util.Date newexeldate) {
    this.newexeldate = newexeldate;
  }
}
