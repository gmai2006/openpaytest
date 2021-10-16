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
package com.openpay.test.service;

import com.openpay.test.entity.MisthYpal;
import com.openpay.test.entity.MisthYpalId;

import com.openpay.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

public class MisthYpalServiceTest {
  private static DefaultMisthYpalService serviceMock;
  private static MisthYpal[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthYpalService.class);
    String inputFile = "MisthYpal.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthYpal[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final MisthYpalId id = new MisthYpalId(records[0].getKodxrisi(), records[0].getKodypal());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final MisthYpalId id = new MisthYpalId(records[0].getKodxrisi(), records[0].getKodypal());
    MisthYpal testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals surname ", records[0].getSurname(), testResult.getSurname());
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals fathername ", records[0].getFathername(), testResult.getFathername());
    org.junit.Assert.assertEquals("expect equals adt ", records[0].getAdt(), testResult.getAdt());
    org.junit.Assert.assertEquals(
        "expect equals mitroo ", records[0].getMitroo(), testResult.getMitroo());
    org.junit.Assert.assertEquals("expect equals afm ", records[0].getAfm(), testResult.getAfm());
    org.junit.Assert.assertEquals("expect equals doy ", records[0].getDoy(), testResult.getDoy());
    org.junit.Assert.assertEquals(
        "expect equals kodtitlos ", records[0].getKodtitlos(), testResult.getKodtitlos());
    org.junit.Assert.assertEquals(
        "expect equals homephone ", records[0].getHomephone(), testResult.getHomephone());
    org.junit.Assert.assertEquals(
        "expect equals mobilphone ", records[0].getMobilphone(), testResult.getMobilphone());
    org.junit.Assert.assertEquals("expect equals sex ", records[0].getSex(), testResult.getSex());
    org.junit.Assert.assertEquals(
        "expect equals spouse ", records[0].getSpouse(), testResult.getSpouse());
    org.junit.Assert.assertTrue(
        "expect equals childs ", records[0].getChilds() == testResult.getChilds());
    org.junit.Assert.assertTrue(
        "expect equals prostmeli ", records[0].getProstmeli() == testResult.getProstmeli());
    org.junit.Assert.assertEquals(
        "expect equals city ", records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals area ", records[0].getArea(), testResult.getArea());
    org.junit.Assert.assertEquals(
        "expect equals address ", records[0].getAddress(), testResult.getAddress());
    org.junit.Assert.assertEquals("expect equals tk ", records[0].getTk(), testResult.getTk());
    org.junit.Assert.assertEquals(
        "expect equals email ", records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals kodtmima ", records[0].getKodtmima(), testResult.getKodtmima());
    org.junit.Assert.assertEquals(
        "expect equals kodidikot ", records[0].getKodidikot(), testResult.getKodidikot());
    org.junit.Assert.assertEquals(
        "expect equals jobtitle ", records[0].getJobtitle(), testResult.getJobtitle());
    org.junit.Assert.assertEquals(
        "expect equals termreason ", records[0].getTermreason(), testResult.getTermreason());
    org.junit.Assert.assertEquals(
        "expect equals jobphone ", records[0].getJobphone(), testResult.getJobphone());
    org.junit.Assert.assertEquals(
        "expect equals intphone ", records[0].getIntphone(), testResult.getIntphone());
    org.junit.Assert.assertTrue(
        "expect equals klimakio ", records[0].getKlimakio() == testResult.getKlimakio());
    org.junit.Assert.assertEquals(
        "expect equals bathmos ", records[0].getBathmos(), testResult.getBathmos());
    org.junit.Assert.assertEquals(
        "expect equals klados ", records[0].getKlados(), testResult.getKlados());
    org.junit.Assert.assertEquals(
        "expect equals bank ", records[0].getBank(), testResult.getBank());
    org.junit.Assert.assertEquals(
        "expect equals bankno ", records[0].getBankno(), testResult.getBankno());
    org.junit.Assert.assertEquals(
        "expect equals kodthesi ", records[0].getKodthesi(), testResult.getKodthesi());
    org.junit.Assert.assertEquals(
        "expect equals kodoikog ", records[0].getKodoikog(), testResult.getKodoikog());
    org.junit.Assert.assertEquals(
        "expect equals kodtamio ", records[0].getKodtamio(), testResult.getKodtamio());
    org.junit.Assert.assertEquals(
        "expect equals mothername ", records[0].getMothername(), testResult.getMothername());
  }
}
