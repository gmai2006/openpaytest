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
package com.openpay.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.openpay.test.entity.MisthYpal;
import com.openpay.test.dao.JpaDao;
import com.openpay.test.dao.StandaloneJpaDao;
import com.openpay.test.dao.DefaultMisthYpalDao;
import com.openpay.test.utils.DelimiterParser;
import com.openpay.test.utils.FileUtils;
import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

import com.openpay.test.entity.MisthYpalId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MisthYpalHandlerTestIt {
  static final String inputFile = "MisthYpal.json";
  static MisthYpalHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MisthYpal[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthYpalHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/MisthYpal.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthYpal[].class);
    assertEquals("match count", count, records.length);
    final MisthYpalId id =
        new MisthYpalId(this.records[0].getKodxrisi(), this.records[0].getKodypal());
    MisthYpal testResult = jpa.find(MisthYpal.class, id);
    assertEquals("expect equals surname ", this.records[0].getSurname(), testResult.getSurname());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals(
        "expect equals fathername ", this.records[0].getFathername(), testResult.getFathername());
    assertEquals("expect equals adt ", this.records[0].getAdt(), testResult.getAdt());
    assertEquals("expect equals mitroo ", this.records[0].getMitroo(), testResult.getMitroo());
    assertEquals("expect equals afm ", this.records[0].getAfm(), testResult.getAfm());
    assertEquals("expect equals doy ", this.records[0].getDoy(), testResult.getDoy());
    assertEquals(
        "expect equals kodtitlos ", this.records[0].getKodtitlos(), testResult.getKodtitlos());
    assertEquals(
        "expect equals homephone ", this.records[0].getHomephone(), testResult.getHomephone());
    assertEquals(
        "expect equals mobilphone ", this.records[0].getMobilphone(), testResult.getMobilphone());
    assertEquals("expect equals sex ", this.records[0].getSex(), testResult.getSex());
    assertEquals("expect equals spouse ", this.records[0].getSpouse(), testResult.getSpouse());
    org.junit.Assert.assertEquals(
        "expect equals childs ", this.records[0].getChilds(), testResult.getChilds());
    org.junit.Assert.assertEquals(
        "expect equals prostmeli ", this.records[0].getProstmeli(), testResult.getProstmeli());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals area ", this.records[0].getArea(), testResult.getArea());
    assertEquals("expect equals address ", this.records[0].getAddress(), testResult.getAddress());
    assertEquals("expect equals tk ", this.records[0].getTk(), testResult.getTk());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    assertEquals(
        "expect equals kodtmima ", this.records[0].getKodtmima(), testResult.getKodtmima());
    assertEquals(
        "expect equals kodidikot ", this.records[0].getKodidikot(), testResult.getKodidikot());
    assertEquals(
        "expect equals jobtitle ", this.records[0].getJobtitle(), testResult.getJobtitle());
    assertEquals(
        "expect equals termreason ", this.records[0].getTermreason(), testResult.getTermreason());
    assertEquals(
        "expect equals jobphone ", this.records[0].getJobphone(), testResult.getJobphone());
    assertEquals(
        "expect equals intphone ", this.records[0].getIntphone(), testResult.getIntphone());
    org.junit.Assert.assertEquals(
        "expect equals klimakio ", this.records[0].getKlimakio(), testResult.getKlimakio());
    assertEquals("expect equals bathmos ", this.records[0].getBathmos(), testResult.getBathmos());
    assertEquals("expect equals klados ", this.records[0].getKlados(), testResult.getKlados());
    assertEquals("expect equals bank ", this.records[0].getBank(), testResult.getBank());
    assertEquals("expect equals bankno ", this.records[0].getBankno(), testResult.getBankno());
    assertEquals(
        "expect equals kodthesi ", this.records[0].getKodthesi(), testResult.getKodthesi());
    assertEquals(
        "expect equals kodoikog ", this.records[0].getKodoikog(), testResult.getKodoikog());
    assertEquals(
        "expect equals kodtamio ", this.records[0].getKodtamio(), testResult.getKodtamio());
    assertEquals(
        "expect equals mothername ", this.records[0].getMothername(), testResult.getMothername());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
