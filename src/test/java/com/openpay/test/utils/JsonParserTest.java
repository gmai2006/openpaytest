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
package com.openpay.test.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.openpay.test.entity.*;

public class JsonParserTest {
  @Test
  public void testParsingAfxfilter() throws IOException {
    final String inputFile = "Afxfilter.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxfilter> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxfilter(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals descfilter ",
          o.get("descfilter").getAsString(),
          result.get(i).getDescfilter());
      assertEquals(
          "expect equals tablename ",
          o.get("tablename").getAsString(),
          result.get(i).getTablename());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxfilterd() throws IOException {
    final String inputFile = "Afxfilterd.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxfilterd> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxfilterd(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals pedio ", o.get("pedio").getAsString(), result.get(i).getPedio());
      assertEquals(
          "expect equals telestis ", o.get("telestis").getAsString(), result.get(i).getTelestis());
      assertEquals("expect equals timi ", o.get("timi").getAsString(), result.get(i).getTimi());
      assertEquals("expect equals joint ", o.get("joint").getAsString(), result.get(i).getJoint());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxinfo() throws IOException {
    final String inputFile = "Afxinfo.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxinfo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxinfo(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals("expect equals dbver ", o.get("dbver").getAsString(), result.get(i).getDbver());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxkeygen() throws IOException {
    final String inputFile = "Afxkeygen.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxkeygen> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxkeygen(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals tblname ", o.get("tblname").getAsString(), result.get(i).getTblname());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxoperators() throws IOException {
    final String inputFile = "Afxoperators.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxoperators> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxoperators(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals operatorname ",
          o.get("operatorname").getAsString(),
          result.get(i).getOperatorname());
      assertEquals(
          "expect equals operator ", o.get("operator").getAsString(), result.get(i).getOperator());
      assertEquals(
          "expect equals orderno ",
          o.get("orderno").getAsInt(),
          result.get(i).getOrderno(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAfxptoseis() throws IOException {
    final String inputFile = "Afxptoseis.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxptoseis> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxptoseis(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals onom ", o.get("onom").getAsString(), result.get(i).getOnom());
      assertEquals("expect equals gen ", o.get("gen").getAsString(), result.get(i).getGen());
      assertEquals("expect equals ait ", o.get("ait").getAsString(), result.get(i).getAit());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxtable() throws IOException {
    final String inputFile = "Afxtable.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxtable> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxtable(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals tablename ",
          o.get("tablename").getAsString(),
          result.get(i).getTablename());
      assertEquals(
          "expect equals tabledesc ",
          o.get("tabledesc").getAsString(),
          result.get(i).getTabledesc());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxtablefields() throws IOException {
    final String inputFile = "Afxtablefields.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxtablefields> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxtablefields(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals fieldname ",
          o.get("fieldname").getAsString(),
          result.get(i).getFieldname());
      assertEquals(
          "expect equals tablename ",
          o.get("tablename").getAsString(),
          result.get(i).getTablename());
      assertEquals(
          "expect equals fielddesc ",
          o.get("fielddesc").getAsString(),
          result.get(i).getFielddesc());
      assertEquals(
          "expect equals sorting ",
          o.get("sorting").getAsInt(),
          result.get(i).getSorting(),
          0.0001);
      assertEquals(
          "expect equals fieldtype ",
          o.get("fieldtype").getAsString(),
          result.get(i).getFieldtype());
    }

    result.clear();
  }

  @Test
  public void testParsingAfxtranslate() throws IOException {
    final String inputFile = "Afxtranslate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Afxtranslate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Afxtranslate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals el ", o.get("el").getAsString(), result.get(i).getEl());
      assertEquals("expect equals uk ", o.get("uk").getAsString(), result.get(i).getUk());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpxrisi() throws IOException {
    final String inputFile = "MisthZpxrisi.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpxrisi> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpxrisi(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals descxrisi ",
          o.get("descxrisi").getAsString(),
          result.get(i).getDescxrisi());
      assertEquals(
          "expect equals maskposo ", o.get("maskposo").getAsString(), result.get(i).getMaskposo());
      assertEquals(
          "expect equals maskposot ",
          o.get("maskposot").getAsString(),
          result.get(i).getMaskposot());
      assertEquals(
          "expect equals maskdate ", o.get("maskdate").getAsString(), result.get(i).getMaskdate());
      assertEquals(
          "expect equals eteria ", o.get("eteria").getAsString(), result.get(i).getEteria());
      assertEquals(
          "expect equals eteriadesc ",
          o.get("eteriadesc").getAsString(),
          result.get(i).getEteriadesc());
      assertEquals(
          "expect equals address ", o.get("address").getAsString(), result.get(i).getAddress());
      assertEquals("expect equals tk ", o.get("tk").getAsString(), result.get(i).getTk());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals("expect equals phone ", o.get("phone").getAsString(), result.get(i).getPhone());
      assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
      assertEquals(
          "expect equals maskdatee ",
          o.get("maskdatee").getAsString(),
          result.get(i).getMaskdatee());
      assertEquals(
          "expect equals maskposoe ",
          o.get("maskposoe").getAsString(),
          result.get(i).getMaskposoe());
      assertEquals(
          "expect equals maskposote ",
          o.get("maskposote").getAsString(),
          result.get(i).getMaskposote());
      assertEquals("expect equals afm ", o.get("afm").getAsString(), result.get(i).getAfm());
      assertEquals("expect equals doy ", o.get("doy").getAsString(), result.get(i).getDoy());
      assertEquals(
          "expect equals round ", o.get("round").getAsInt(), result.get(i).getRound(), 0.0001);
      assertEquals(
          "expect equals prnLogo1 ", o.get("prnLogo1").getAsString(), result.get(i).getPrnLogo1());
      assertEquals(
          "expect equals prnLogo2 ", o.get("prnLogo2").getAsString(), result.get(i).getPrnLogo2());
      assertEquals(
          "expect equals prnLogo3 ", o.get("prnLogo3").getAsString(), result.get(i).getPrnLogo3());
      assertEquals(
          "expect equals prnLogo4 ", o.get("prnLogo4").getAsString(), result.get(i).getPrnLogo4());
      assertEquals(
          "expect equals prnLogo5 ", o.get("prnLogo5").getAsString(), result.get(i).getPrnLogo5());
      assertEquals(
          "expect equals prnSign1Prosf ",
          o.get("prnSign1Prosf").getAsString(),
          result.get(i).getPrnSign1Prosf());
      assertEquals(
          "expect equals prnSign1Name ",
          o.get("prnSign1Name").getAsString(),
          result.get(i).getPrnSign1Name());
      assertEquals(
          "expect equals prnSign2Prosf ",
          o.get("prnSign2Prosf").getAsString(),
          result.get(i).getPrnSign2Prosf());
      assertEquals(
          "expect equals prnSign2Name ",
          o.get("prnSign2Name").getAsString(),
          result.get(i).getPrnSign2Name());
      assertEquals(
          "expect equals prnSign3Prosf ",
          o.get("prnSign3Prosf").getAsString(),
          result.get(i).getPrnSign3Prosf());
      assertEquals(
          "expect equals prnSign3Name ",
          o.get("prnSign3Name").getAsString(),
          result.get(i).getPrnSign3Name());
      assertEquals(
          "expect equals prnNotes1 ",
          o.get("prnNotes1").getAsString(),
          result.get(i).getPrnNotes1());
      assertEquals(
          "expect equals prnNotes2 ",
          o.get("prnNotes2").getAsString(),
          result.get(i).getPrnNotes2());
      assertEquals(
          "expect equals prnNotes3 ",
          o.get("prnNotes3").getAsString(),
          result.get(i).getPrnNotes3());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpperiod() throws IOException {
    final String inputFile = "MisthZpperiod.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpperiod> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpperiod(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodperiod ",
          o.get("kodperiod").getAsString(),
          result.get(i).getKodperiod());
      assertEquals(
          "expect equals descperiod ",
          o.get("descperiod").getAsString(),
          result.get(i).getDescperiod());
      assertEquals(
          "expect equals orderno ",
          o.get("orderno").getAsInt(),
          result.get(i).getOrderno(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpkat() throws IOException {
    final String inputFile = "MisthZpkat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpkat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpkat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodkat ", o.get("kodkat").getAsString(), result.get(i).getKodkat());
      assertEquals(
          "expect equals desckat ", o.get("desckat").getAsString(), result.get(i).getDesckat());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFinal() throws IOException {
    final String inputFile = "MisthFinal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFinal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals descfinal ",
          o.get("descfinal").getAsString(),
          result.get(i).getDescfinal());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals kodkat ", o.get("kodkat").getAsString(), result.get(i).getKodkat());
      assertEquals(
          "expect equals kodperiod ",
          o.get("kodperiod").getAsString(),
          result.get(i).getKodperiod());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZptmima() throws IOException {
    final String inputFile = "MisthZptmima.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZptmima> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptmima(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodtmima ", o.get("kodtmima").getAsString(), result.get(i).getKodtmima());
      assertEquals(
          "expect equals desctmima ",
          o.get("desctmima").getAsString(),
          result.get(i).getDesctmima());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpidikot() throws IOException {
    final String inputFile = "MisthZpidikot.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpidikot> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpidikot(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodidikot ",
          o.get("kodidikot").getAsString(),
          result.get(i).getKodidikot());
      assertEquals(
          "expect equals descidikot ",
          o.get("descidikot").getAsString(),
          result.get(i).getDescidikot());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpthesi() throws IOException {
    final String inputFile = "MisthZpthesi.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpthesi> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpthesi(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodthesi ", o.get("kodthesi").getAsString(), result.get(i).getKodthesi());
      assertEquals(
          "expect equals descthesi ",
          o.get("descthesi").getAsString(),
          result.get(i).getDescthesi());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZptamio() throws IOException {
    final String inputFile = "MisthZptamio.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZptamio> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptamio(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodtamio ", o.get("kodtamio").getAsString(), result.get(i).getKodtamio());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals desctamio ",
          o.get("desctamio").getAsString(),
          result.get(i).getDesctamio());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpoikog() throws IOException {
    final String inputFile = "MisthZpoikog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpoikog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpoikog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodoikog ", o.get("kodoikog").getAsString(), result.get(i).getKodoikog());
      assertEquals(
          "expect equals descoikog ",
          o.get("descoikog").getAsString(),
          result.get(i).getDescoikog());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthYpal() throws IOException {
    final String inputFile = "MisthYpal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthYpal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals surname ", o.get("surname").getAsString(), result.get(i).getSurname());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals fathername ",
          o.get("fathername").getAsString(),
          result.get(i).getFathername());
      assertEquals("expect equals adt ", o.get("adt").getAsString(), result.get(i).getAdt());
      assertEquals(
          "expect equals mitroo ", o.get("mitroo").getAsString(), result.get(i).getMitroo());
      assertEquals("expect equals afm ", o.get("afm").getAsString(), result.get(i).getAfm());
      assertEquals("expect equals doy ", o.get("doy").getAsString(), result.get(i).getDoy());
      assertEquals(
          "expect equals kodtitlos ",
          o.get("kodtitlos").getAsString(),
          result.get(i).getKodtitlos());
      assertEquals(
          "expect equals homephone ",
          o.get("homephone").getAsString(),
          result.get(i).getHomephone());
      assertEquals(
          "expect equals mobilphone ",
          o.get("mobilphone").getAsString(),
          result.get(i).getMobilphone());
      assertEquals("expect equals sex ", o.get("sex").getAsString(), result.get(i).getSex());
      assertEquals(
          "expect equals spouse ", o.get("spouse").getAsString(), result.get(i).getSpouse());
      assertEquals(
          "expect equals childs ", o.get("childs").getAsInt(), result.get(i).getChilds(), 0.0001);
      assertEquals(
          "expect equals prostmeli ",
          o.get("prostmeli").getAsInt(),
          result.get(i).getProstmeli(),
          0.0001);
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals("expect equals area ", o.get("area").getAsString(), result.get(i).getArea());
      assertEquals(
          "expect equals address ", o.get("address").getAsString(), result.get(i).getAddress());
      assertEquals("expect equals tk ", o.get("tk").getAsString(), result.get(i).getTk());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals kodtmima ", o.get("kodtmima").getAsString(), result.get(i).getKodtmima());
      assertEquals(
          "expect equals kodidikot ",
          o.get("kodidikot").getAsString(),
          result.get(i).getKodidikot());
      assertEquals(
          "expect equals jobtitle ", o.get("jobtitle").getAsString(), result.get(i).getJobtitle());
      assertEquals(
          "expect equals termreason ",
          o.get("termreason").getAsString(),
          result.get(i).getTermreason());
      assertEquals(
          "expect equals jobphone ", o.get("jobphone").getAsString(), result.get(i).getJobphone());
      assertEquals(
          "expect equals intphone ", o.get("intphone").getAsString(), result.get(i).getIntphone());
      assertEquals(
          "expect equals klimakio ",
          o.get("klimakio").getAsInt(),
          result.get(i).getKlimakio(),
          0.0001);
      assertEquals(
          "expect equals bathmos ", o.get("bathmos").getAsString(), result.get(i).getBathmos());
      assertEquals(
          "expect equals klados ", o.get("klados").getAsString(), result.get(i).getKlados());
      assertEquals("expect equals bank ", o.get("bank").getAsString(), result.get(i).getBank());
      assertEquals(
          "expect equals bankno ", o.get("bankno").getAsString(), result.get(i).getBankno());
      assertEquals(
          "expect equals kodthesi ", o.get("kodthesi").getAsString(), result.get(i).getKodthesi());
      assertEquals(
          "expect equals kodoikog ", o.get("kodoikog").getAsString(), result.get(i).getKodoikog());
      assertEquals(
          "expect equals kodtamio ", o.get("kodtamio").getAsString(), result.get(i).getKodtamio());
      assertEquals(
          "expect equals mothername ",
          o.get("mothername").getAsString(),
          result.get(i).getMothername());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFinalYpal() throws IOException {
    final String inputFile = "MisthFinalYpal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFinalYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpepidom() throws IOException {
    final String inputFile = "MisthZpepidom.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpepidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpepidom(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals(
          "expect equals descepidom ",
          o.get("descepidom").getAsString(),
          result.get(i).getDescepidom());
      assertEquals(
          "expect equals hasforo ",
          o.get("hasforo").getAsInt(),
          result.get(i).getHasforo(),
          0.0001);
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
      assertEquals(
          "expect equals isasf ", o.get("isasf").getAsInt(), result.get(i).getIsasf(), 0.0001);
      assertEquals(
          "expect equals autoforos ",
          o.get("autoforos").getAsInt(),
          result.get(i).getAutoforos(),
          0.0001);
      assertEquals(
          "expect equals hasasf ", o.get("hasasf").getAsInt(), result.get(i).getHasasf(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFinalYpalEpidom() throws IOException {
    final String inputFile = "MisthFinalYpalEpidom.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFinalYpalEpidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpalEpidom(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals(
          "expect equals poso ", o.get("poso").getAsDouble(), result.get(i).getPoso(), 0.001);
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpkrat() throws IOException {
    final String inputFile = "MisthZpkrat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpkrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpkrat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals desckrat ", o.get("desckrat").getAsString(), result.get(i).getDesckrat());
      assertEquals(
          "expect equals isforos ",
          o.get("isforos").getAsInt(),
          result.get(i).getIsforos(),
          0.0001);
      assertEquals(
          "expect equals isasf ", o.get("isasf").getAsInt(), result.get(i).getIsasf(), 0.0001);
      assertEquals(
          "expect equals isautoforos ",
          o.get("isautoforos").getAsInt(),
          result.get(i).getIsautoforos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthKratapod() throws IOException {
    final String inputFile = "MisthKratapod.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthKratapod> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthKratapod(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals desckratapod ",
          o.get("desckratapod").getAsString(),
          result.get(i).getDesckratapod());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFinalYpalKrat() throws IOException {
    final String inputFile = "MisthFinalYpalKrat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFinalYpalKrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFinalYpalKrat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals poso ", o.get("poso").getAsDouble(), result.get(i).getPoso(), 0.001);
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFylo() throws IOException {
    final String inputFile = "MisthFylo.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFylo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFylo(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals descfylo ", o.get("descfylo").getAsString(), result.get(i).getDescfylo());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFyloEpidom() throws IOException {
    final String inputFile = "MisthFyloEpidom.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFyloEpidom> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloEpidom(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodepidom ",
          o.get("kodepidom").getAsString(),
          result.get(i).getKodepidom());
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFyloKrat() throws IOException {
    final String inputFile = "MisthFyloKrat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFyloKrat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloKrat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());
      assertEquals(
          "expect equals kodkrat ", o.get("kodkrat").getAsString(), result.get(i).getKodkrat());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
      assertEquals("expect equals notes ", o.get("notes").getAsString(), result.get(i).getNotes());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthFyloYpal() throws IOException {
    final String inputFile = "MisthFyloYpal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthFyloYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthFyloYpal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodfylo ", o.get("kodfylo").getAsString(), result.get(i).getKodfylo());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthReport() throws IOException {
    final String inputFile = "MisthReport.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthReport> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReport(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsString(),
          result.get(i).getKodreport());
      assertEquals(
          "expect equals descreport ",
          o.get("descreport").getAsString(),
          result.get(i).getDescreport());
      assertEquals(
          "expect equals subtitle ", o.get("subtitle").getAsString(), result.get(i).getSubtitle());
      assertEquals(
          "expect equals printMarginTop ",
          o.get("printMarginTop").getAsInt(),
          result.get(i).getPrintMarginTop(),
          0.0001);
      assertEquals(
          "expect equals printMarginBottom ",
          o.get("printMarginBottom").getAsInt(),
          result.get(i).getPrintMarginBottom(),
          0.0001);
      assertEquals(
          "expect equals printMarginLeft ",
          o.get("printMarginLeft").getAsInt(),
          result.get(i).getPrintMarginLeft(),
          0.0001);
      assertEquals(
          "expect equals printMarginRight ",
          o.get("printMarginRight").getAsInt(),
          result.get(i).getPrintMarginRight(),
          0.0001);
      assertEquals(
          "expect equals printOrientation ",
          o.get("printOrientation").getAsInt(),
          result.get(i).getPrintOrientation(),
          0.0001);
      assertEquals(
          "expect equals printPaperSize ",
          o.get("printPaperSize").getAsInt(),
          result.get(i).getPrintPaperSize(),
          0.0001);
      assertEquals(
          "expect equals printScale ",
          o.get("printScale").getAsInt(),
          result.get(i).getPrintScale(),
          0.0001);
      assertEquals(
          "expect equals prnNotes1 ",
          o.get("prnNotes1").getAsString(),
          result.get(i).getPrnNotes1());
      assertEquals(
          "expect equals prnNotes2 ",
          o.get("prnNotes2").getAsString(),
          result.get(i).getPrnNotes2());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthReportCols() throws IOException {
    final String inputFile = "MisthReportCols.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthReportCols> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReportCols(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodcol ", o.get("kodcol").getAsInt(), result.get(i).getKodcol(), 0.0001);
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsString(),
          result.get(i).getKodreport());
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
      assertEquals(
          "expect equals headerText ",
          o.get("headerText").getAsString(),
          result.get(i).getHeaderText());
      assertEquals(
          "expect equals width ", o.get("width").getAsInt(), result.get(i).getWidth(), 0.0001);
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthReportYpal() throws IOException {
    final String inputFile = "MisthReportYpal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthReportYpal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthReportYpal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodreport ",
          o.get("kodreport").getAsString(),
          result.get(i).getKodreport());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpyvar() throws IOException {
    final String inputFile = "MisthZpyvar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpyvar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpyvar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodyvar ", o.get("kodyvar").getAsString(), result.get(i).getKodyvar());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals descyvar ", o.get("descyvar").getAsString(), result.get(i).getDescyvar());
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
    }

    result.clear();
  }

  @Test
  public void testParsingMisthYpalYvar() throws IOException {
    final String inputFile = "MisthYpalYvar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthYpalYvar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthYpalYvar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodyvar ", o.get("kodyvar").getAsString(), result.get(i).getKodyvar());
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals("expect equals expr ", o.get("expr").getAsString(), result.get(i).getExpr());
      assertEquals("expect equals aa ", o.get("aa").getAsInt(), result.get(i).getAa(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZpstath() throws IOException {
    final String inputFile = "MisthZpstath.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZpstath> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZpstath(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodstath ", o.get("kodstath").getAsString(), result.get(i).getKodstath());
      assertEquals(
          "expect equals descstath ",
          o.get("descstath").getAsString(),
          result.get(i).getDescstath());
      assertEquals(
          "expect equals poso ", o.get("poso").getAsDouble(), result.get(i).getPoso(), 0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingMisthZptitlos() throws IOException {
    final String inputFile = "MisthZptitlos.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MisthZptitlos> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MisthZptitlos(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals kodxrisi ", o.get("kodxrisi").getAsString(), result.get(i).getKodxrisi());
      assertEquals(
          "expect equals kodtitlos ",
          o.get("kodtitlos").getAsString(),
          result.get(i).getKodtitlos());
      assertEquals(
          "expect equals desctitlos ",
          o.get("desctitlos").getAsString(),
          result.get(i).getDesctitlos());
    }

    result.clear();
  }
}
