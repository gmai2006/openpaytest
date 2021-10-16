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
import com.openpay.test.entity.MisthReport;
import com.openpay.test.dao.JpaDao;
import com.openpay.test.dao.StandaloneJpaDao;
import com.openpay.test.dao.DefaultMisthReportDao;
import com.openpay.test.utils.DelimiterParser;
import com.openpay.test.utils.FileUtils;
import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

import com.openpay.test.entity.MisthReportId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MisthReportHandlerTestIt {
  static final String inputFile = "MisthReport.json";
  static MisthReportHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MisthReport[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MisthReportHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MisthReport[].class);
    assertEquals("match count", count, records.length);
    final MisthReportId id =
        new MisthReportId(this.records[0].getKodxrisi(), this.records[0].getKodreport());
    MisthReport testResult = jpa.find(MisthReport.class, id);
    assertEquals(
        "expect equals descreport ", this.records[0].getDescreport(), testResult.getDescreport());
    assertEquals(
        "expect equals subtitle ", this.records[0].getSubtitle(), testResult.getSubtitle());
    org.junit.Assert.assertEquals(
        "expect equals printMarginTop ",
        this.records[0].getPrintMarginTop(),
        testResult.getPrintMarginTop());
    org.junit.Assert.assertEquals(
        "expect equals printMarginBottom ",
        this.records[0].getPrintMarginBottom(),
        testResult.getPrintMarginBottom());
    org.junit.Assert.assertEquals(
        "expect equals printMarginLeft ",
        this.records[0].getPrintMarginLeft(),
        testResult.getPrintMarginLeft());
    org.junit.Assert.assertEquals(
        "expect equals printMarginRight ",
        this.records[0].getPrintMarginRight(),
        testResult.getPrintMarginRight());
    org.junit.Assert.assertEquals(
        "expect equals printOrientation ",
        this.records[0].getPrintOrientation(),
        testResult.getPrintOrientation());
    org.junit.Assert.assertEquals(
        "expect equals printPaperSize ",
        this.records[0].getPrintPaperSize(),
        testResult.getPrintPaperSize());
    org.junit.Assert.assertEquals(
        "expect equals printScale ", this.records[0].getPrintScale(), testResult.getPrintScale());
    assertEquals(
        "expect equals prnNotes1 ", this.records[0].getPrnNotes1(), testResult.getPrnNotes1());
    assertEquals(
        "expect equals prnNotes2 ", this.records[0].getPrnNotes2(), testResult.getPrnNotes2());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }

  /**
   * Construct a delimiter file from a json file.
   *
   * @param inputFile the json file.
   * @param charset default charset.
   * @return
   */
  private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
    try {
      final File tempFile = File.createTempFile(inputFile, ".txt");
      tempFile.deleteOnExit();
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      JSONArray docs = new JSONArray(json);
      String csv = CDL.toString(docs);
      org.apache.commons.io.FileUtils.writeStringToFile(tempFile, csv, Charset.defaultCharset());
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
