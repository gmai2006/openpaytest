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

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.openpay.test.entity.MisthYpal;
import com.openpay.test.dao.JpaDao;

import com.openpay.test.utils.DelimiterParser;

// @Stateless
@Named("MisthYpalHandler")
public class MisthYpalHandler extends DelimiterFileHandler<MisthYpal> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthYpalHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthYpal parseLine(List<String> headers, List<String> tokens) {
    MisthYpal record = new MisthYpal();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodypal":
          record.setKodypal(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;

        case "surname":
          record.setSurname(tokens.get(i));
          break;

        case "name":
          record.setName(tokens.get(i));
          break;

        case "fathername":
          record.setFathername(tokens.get(i));
          break;

        case "adt":
          record.setAdt(tokens.get(i));
          break;

        case "mitroo":
          record.setMitroo(tokens.get(i));
          break;

        case "afm":
          record.setAfm(tokens.get(i));
          break;

        case "doy":
          record.setDoy(tokens.get(i));
          break;

        case "kodtitlos":
          record.setKodtitlos(tokens.get(i));
          break;

        case "birthdate":
          record.setBirthdate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "homephone":
          record.setHomephone(tokens.get(i));
          break;

        case "mobilphone":
          record.setMobilphone(tokens.get(i));
          break;

        case "sex":
          record.setSex(tokens.get(i));
          break;

        case "spouse":
          record.setSpouse(tokens.get(i));
          break;

        case "childs":
          record.setChilds(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "prostmeli":
          record.setProstmeli(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "city":
          record.setCity(tokens.get(i));
          break;

        case "area":
          record.setArea(tokens.get(i));
          break;

        case "address":
          record.setAddress(tokens.get(i));
          break;

        case "tk":
          record.setTk(tokens.get(i));
          break;

        case "email":
          record.setEmail(tokens.get(i));
          break;

        case "kodtmima":
          record.setKodtmima(tokens.get(i));
          break;

        case "kodidikot":
          record.setKodidikot(tokens.get(i));
          break;

        case "jobtitle":
          record.setJobtitle(tokens.get(i));
          break;

        case "hireddate":
          record.setHireddate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "rehireddate":
          record.setRehireddate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "termdate":
          record.setTermdate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "termreason":
          record.setTermreason(tokens.get(i));
          break;

        case "jobphone":
          record.setJobphone(tokens.get(i));
          break;

        case "intphone":
          record.setIntphone(tokens.get(i));
          break;

        case "klimakio":
          record.setKlimakio(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "bathmos":
          record.setBathmos(tokens.get(i));
          break;

        case "klados":
          record.setKlados(tokens.get(i));
          break;

        case "bank":
          record.setBank(tokens.get(i));
          break;

        case "bankno":
          record.setBankno(tokens.get(i));
          break;

        case "exeldate":
          record.setExeldate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "kodthesi":
          record.setKodthesi(tokens.get(i));
          break;

        case "kodoikog":
          record.setKodoikog(tokens.get(i));
          break;

        case "kodtamio":
          record.setKodtamio(tokens.get(i));
          break;

        case "mothername":
          record.setMothername(tokens.get(i));
          break;

        case "newexeldate":
          record.setNewexeldate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
