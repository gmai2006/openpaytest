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

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.openpay.test.dao.AfxfilterDao;
import com.openpay.test.entity.Afxfilter;

@Stateless
@Named("DefaultAfxfilterService")
public class DefaultAfxfilterService implements AfxfilterService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxfilterDao dao;

  @Inject
  @Named("DefaultAfxfilterDao")
  public DefaultAfxfilterService(final AfxfilterDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilter find(java.lang.Long id) {

    final Afxfilter result = dao.find(id);
    logger.info("find(Afxfilter) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxfilter> select(int maxResult) {
    final List<Afxfilter> result = dao.select(maxResult);
    logger.info("select(Afxfilter) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Afxfilter> selectAll() {
    final List<Afxfilter> results = dao.selectAll();
    logger.info("selectAll(Afxfilter) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilter create(Afxfilter bean) {
    requireNonNull(bean);
    logger.info("create(Afxfilter={}) - entered bean ");

    final Afxfilter result = dao.create(bean);

    logger.info("create(Afxfilter) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxfilter update(Afxfilter bean) {
    requireNonNull(bean);
    logger.info("update(Afxfilter={}) - entered bean ");

    final Afxfilter result = dao.update(bean);

    logger.info("update(Afxfilter) - exited - return value={} result ");
    return result;
  }
}
