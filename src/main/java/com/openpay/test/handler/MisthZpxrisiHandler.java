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
import com.openpay.test.entity.MisthZpxrisi;
import com.openpay.test.dao.JpaDao;

import com.openpay.test.utils.DelimiterParser;

// @Stateless
@Named("MisthZpxrisiHandler")
public class MisthZpxrisiHandler extends DelimiterFileHandler<MisthZpxrisi> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthZpxrisiHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthZpxrisi parseLine(List<String> headers, List<String> tokens) {
    MisthZpxrisi record = new MisthZpxrisi();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;

        case "descxrisi":
          record.setDescxrisi(tokens.get(i));
          break;

        case "startdate":
          record.setStartdate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "enddate":
          record.setEnddate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "maskposo":
          record.setMaskposo(tokens.get(i));
          break;

        case "maskposot":
          record.setMaskposot(tokens.get(i));
          break;

        case "maskdate":
          record.setMaskdate(tokens.get(i));
          break;

        case "eteria":
          record.setEteria(tokens.get(i));
          break;

        case "eteriadesc":
          record.setEteriadesc(tokens.get(i));
          break;

        case "address":
          record.setAddress(tokens.get(i));
          break;

        case "tk":
          record.setTk(tokens.get(i));
          break;

        case "city":
          record.setCity(tokens.get(i));
          break;

        case "phone":
          record.setPhone(tokens.get(i));
          break;

        case "fax":
          record.setFax(tokens.get(i));
          break;

        case "maskdatee":
          record.setMaskdatee(tokens.get(i));
          break;

        case "maskposoe":
          record.setMaskposoe(tokens.get(i));
          break;

        case "maskposote":
          record.setMaskposote(tokens.get(i));
          break;

        case "afm":
          record.setAfm(tokens.get(i));
          break;

        case "doy":
          record.setDoy(tokens.get(i));
          break;

        case "round":
          record.setRound(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "prnLogo1":
          record.setPrnLogo1(tokens.get(i));
          break;

        case "prnLogo2":
          record.setPrnLogo2(tokens.get(i));
          break;

        case "prnLogo3":
          record.setPrnLogo3(tokens.get(i));
          break;

        case "prnLogo4":
          record.setPrnLogo4(tokens.get(i));
          break;

        case "prnLogo5":
          record.setPrnLogo5(tokens.get(i));
          break;

        case "prnSign1Prosf":
          record.setPrnSign1Prosf(tokens.get(i));
          break;

        case "prnSign1Name":
          record.setPrnSign1Name(tokens.get(i));
          break;

        case "prnSign2Prosf":
          record.setPrnSign2Prosf(tokens.get(i));
          break;

        case "prnSign2Name":
          record.setPrnSign2Name(tokens.get(i));
          break;

        case "prnSign3Prosf":
          record.setPrnSign3Prosf(tokens.get(i));
          break;

        case "prnSign3Name":
          record.setPrnSign3Name(tokens.get(i));
          break;

        case "prnNotes1":
          record.setPrnNotes1(tokens.get(i));
          break;

        case "prnNotes2":
          record.setPrnNotes2(tokens.get(i));
          break;

        case "prnNotes3":
          record.setPrnNotes3(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
