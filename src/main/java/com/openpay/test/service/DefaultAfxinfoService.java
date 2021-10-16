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
import com.openpay.test.dao.AfxinfoDao;
import com.openpay.test.entity.Afxinfo;

@Stateless
@Named("DefaultAfxinfoService")
public class DefaultAfxinfoService implements AfxinfoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxinfoDao dao;

  @Inject
  @Named("DefaultAfxinfoDao")
  public DefaultAfxinfoService(final AfxinfoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxinfo find(java.lang.String id) {

    final Afxinfo result = dao.find(id);
    logger.info("find(Afxinfo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxinfo> select(int maxResult) {
    final List<Afxinfo> result = dao.select(maxResult);
    logger.info("select(Afxinfo) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Afxinfo> selectAll() {
    final List<Afxinfo> results = dao.selectAll();
    logger.info("selectAll(Afxinfo) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxinfo create(Afxinfo bean) {
    requireNonNull(bean);
    logger.info("create(Afxinfo={}) - entered bean ");

    final Afxinfo result = dao.create(bean);

    logger.info("create(Afxinfo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxinfo update(Afxinfo bean) {
    requireNonNull(bean);
    logger.info("update(Afxinfo={}) - entered bean ");

    final Afxinfo result = dao.update(bean);

    logger.info("update(Afxinfo) - exited - return value={} result ");
    return result;
  }
}
