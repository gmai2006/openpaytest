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
import com.openpay.test.entity.MisthZpxrisi;
import com.openpay.test.dao.JpaDao;
import com.openpay.test.dao.StandaloneJpaDao;
import com.openpay.test.dao.DefaultMisthZpxrisiDao;
import com.openpay.test.utils.DelimiterParser;
import com.openpay.test.utils.FileUtils;
import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MisthZpxrisiHandlerTestIt {
  static final String inputFile = "MisthZpxrisi.json";
  static MisthZpxrisiHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MisthZpxrisi[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthZpxrisiHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/MisthZpxrisi.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthZpxrisi[].class);
    assertEquals("match count", count, records.length);
    MisthZpxrisi testResult = jpa.find(MisthZpxrisi.class, records[0].getKodxrisi());
    assertEquals(
        "expect equals descxrisi ", this.records[0].getDescxrisi(), testResult.getDescxrisi());
    assertEquals(
        "expect equals maskposo ", this.records[0].getMaskposo(), testResult.getMaskposo());
    assertEquals(
        "expect equals maskposot ", this.records[0].getMaskposot(), testResult.getMaskposot());
    assertEquals(
        "expect equals maskdate ", this.records[0].getMaskdate(), testResult.getMaskdate());
    assertEquals("expect equals eteria ", this.records[0].getEteria(), testResult.getEteria());
    assertEquals(
        "expect equals eteriadesc ", this.records[0].getEteriadesc(), testResult.getEteriadesc());
    assertEquals("expect equals address ", this.records[0].getAddress(), testResult.getAddress());
    assertEquals("expect equals tk ", this.records[0].getTk(), testResult.getTk());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals phone ", this.records[0].getPhone(), testResult.getPhone());
    assertEquals("expect equals fax ", this.records[0].getFax(), testResult.getFax());
    assertEquals(
        "expect equals maskdatee ", this.records[0].getMaskdatee(), testResult.getMaskdatee());
    assertEquals(
        "expect equals maskposoe ", this.records[0].getMaskposoe(), testResult.getMaskposoe());
    assertEquals(
        "expect equals maskposote ", this.records[0].getMaskposote(), testResult.getMaskposote());
    assertEquals("expect equals afm ", this.records[0].getAfm(), testResult.getAfm());
    assertEquals("expect equals doy ", this.records[0].getDoy(), testResult.getDoy());
    org.junit.Assert.assertEquals(
        "expect equals round ", this.records[0].getRound(), testResult.getRound());
    assertEquals(
        "expect equals prnLogo1 ", this.records[0].getPrnLogo1(), testResult.getPrnLogo1());
    assertEquals(
        "expect equals prnLogo2 ", this.records[0].getPrnLogo2(), testResult.getPrnLogo2());
    assertEquals(
        "expect equals prnLogo3 ", this.records[0].getPrnLogo3(), testResult.getPrnLogo3());
    assertEquals(
        "expect equals prnLogo4 ", this.records[0].getPrnLogo4(), testResult.getPrnLogo4());
    assertEquals(
        "expect equals prnLogo5 ", this.records[0].getPrnLogo5(), testResult.getPrnLogo5());
    assertEquals(
        "expect equals prnSign1Prosf ",
        this.records[0].getPrnSign1Prosf(),
        testResult.getPrnSign1Prosf());
    assertEquals(
        "expect equals prnSign1Name ",
        this.records[0].getPrnSign1Name(),
        testResult.getPrnSign1Name());
    assertEquals(
        "expect equals prnSign2Prosf ",
        this.records[0].getPrnSign2Prosf(),
        testResult.getPrnSign2Prosf());
    assertEquals(
        "expect equals prnSign2Name ",
        this.records[0].getPrnSign2Name(),
        testResult.getPrnSign2Name());
    assertEquals(
        "expect equals prnSign3Prosf ",
        this.records[0].getPrnSign3Prosf(),
        testResult.getPrnSign3Prosf());
    assertEquals(
        "expect equals prnSign3Name ",
        this.records[0].getPrnSign3Name(),
        testResult.getPrnSign3Name());
    assertEquals(
        "expect equals prnNotes1 ", this.records[0].getPrnNotes1(), testResult.getPrnNotes1());
    assertEquals(
        "expect equals prnNotes2 ", this.records[0].getPrnNotes2(), testResult.getPrnNotes2());
    assertEquals(
        "expect equals prnNotes3 ", this.records[0].getPrnNotes3(), testResult.getPrnNotes3());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
