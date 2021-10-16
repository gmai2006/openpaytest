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
package com.openpay.test.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.openpay.test.entity.Afxfilter;
import com.openpay.test.entity.Afxfilterd;
import com.openpay.test.entity.Afxinfo;
import com.openpay.test.entity.Afxkeygen;
import com.openpay.test.entity.Afxoperators;
import com.openpay.test.entity.Afxptoseis;
import com.openpay.test.entity.Afxtable;
import com.openpay.test.entity.Afxtablefields;
import com.openpay.test.entity.Afxtranslate;
import com.openpay.test.entity.MisthZpxrisi;
import com.openpay.test.entity.MisthZpperiod;
import com.openpay.test.entity.MisthZpkat;
import com.openpay.test.entity.MisthFinal;
import com.openpay.test.entity.MisthZptmima;
import com.openpay.test.entity.MisthZpidikot;
import com.openpay.test.entity.MisthZpthesi;
import com.openpay.test.entity.MisthZptamio;
import com.openpay.test.entity.MisthZpoikog;
import com.openpay.test.entity.MisthYpal;
import com.openpay.test.entity.MisthFinalYpal;
import com.openpay.test.entity.MisthZpepidom;
import com.openpay.test.entity.MisthFinalYpalEpidom;
import com.openpay.test.entity.MisthZpkrat;
import com.openpay.test.entity.MisthKratapod;
import com.openpay.test.entity.MisthFinalYpalKrat;
import com.openpay.test.entity.MisthFylo;
import com.openpay.test.entity.MisthFyloEpidom;
import com.openpay.test.entity.MisthFyloKrat;
import com.openpay.test.entity.MisthFyloYpal;
import com.openpay.test.entity.MisthReport;
import com.openpay.test.entity.MisthReportCols;
import com.openpay.test.entity.MisthReportYpal;
import com.openpay.test.entity.MisthZpyvar;
import com.openpay.test.entity.MisthYpalYvar;
import com.openpay.test.entity.MisthZpstath;
import com.openpay.test.entity.MisthZptitlos;
import com.openpay.test.entity.DataLoadingStatus;
import com.openpay.test.entity.Loadingstatus;

@Stateless
@Named("DefaultDataLoadingDao")
public class DefaultDataLoadingDao implements DataLoadingDao {

  private static final Logger logger = Logger.getLogger(DefaultDataLoadingDao.class.getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultDataLoadingDao(JpaDao dao) {
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus update(DataLoadingStatus e) {
    return dao.update(e);
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus getLoadingStatus(String type) {
    DataLoadingStatus loadingStatus = dao.find(DataLoadingStatus.class, type);
    if (null == loadingStatus) {
      loadingStatus = new DataLoadingStatus(type, Loadingstatus.NEW);
      dao.create(loadingStatus);
    }
    return loadingStatus;
  }

  /** {@inheritDoc} */
  @Override
  public <E> E create(E e) {
    return dao.create(e);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    dao.delete(DataLoadingStatus.class, id);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteAll() {
    dao.deleteAll(Afxfilter.class);
    dao.deleteAll(Afxfilterd.class);
    dao.deleteAll(Afxinfo.class);
    dao.deleteAll(Afxkeygen.class);
    dao.deleteAll(Afxoperators.class);
    dao.deleteAll(Afxptoseis.class);
    dao.deleteAll(Afxtable.class);
    dao.deleteAll(Afxtablefields.class);
    dao.deleteAll(Afxtranslate.class);
    dao.deleteAll(MisthZpxrisi.class);
    dao.deleteAll(MisthZpperiod.class);
    dao.deleteAll(MisthZpkat.class);
    dao.deleteAll(MisthFinal.class);
    dao.deleteAll(MisthZptmima.class);
    dao.deleteAll(MisthZpidikot.class);
    dao.deleteAll(MisthZpthesi.class);
    dao.deleteAll(MisthZptamio.class);
    dao.deleteAll(MisthZpoikog.class);
    dao.deleteAll(MisthYpal.class);
    dao.deleteAll(MisthFinalYpal.class);
    dao.deleteAll(MisthZpepidom.class);
    dao.deleteAll(MisthFinalYpalEpidom.class);
    dao.deleteAll(MisthZpkrat.class);
    dao.deleteAll(MisthKratapod.class);
    dao.deleteAll(MisthFinalYpalKrat.class);
    dao.deleteAll(MisthFylo.class);
    dao.deleteAll(MisthFyloEpidom.class);
    dao.deleteAll(MisthFyloKrat.class);
    dao.deleteAll(MisthFyloYpal.class);
    dao.deleteAll(MisthReport.class);
    dao.deleteAll(MisthReportCols.class);
    dao.deleteAll(MisthReportYpal.class);
    dao.deleteAll(MisthZpyvar.class);
    dao.deleteAll(MisthYpalYvar.class);
    dao.deleteAll(MisthZpstath.class);
    dao.deleteAll(MisthZptitlos.class);
  }
}
