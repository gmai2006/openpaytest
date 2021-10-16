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
import com.openpay.test.dao.AfxtablefieldsDao;
import com.openpay.test.entity.Afxtablefields;
import com.openpay.test.entity.AfxtablefieldsId;

@Stateless
@Named("DefaultAfxtablefieldsService")
public class DefaultAfxtablefieldsService implements AfxtablefieldsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxtablefieldsDao dao;

  @Inject
  @Named("DefaultAfxtablefieldsDao")
  public DefaultAfxtablefieldsService(final AfxtablefieldsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxtablefields find(AfxtablefieldsId id) {
    final Afxtablefields result = dao.find(id);
    logger.info("find(Afxtablefields) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxtablefields> select(int maxResult) {
    final List<Afxtablefields> result = dao.select(maxResult);
    logger.info("select(Afxtablefields) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Afxtablefields> selectAll() {
    final List<Afxtablefields> results = dao.selectAll();
    logger.info("selectAll(Afxtablefields) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxtablefields create(Afxtablefields bean) {
    requireNonNull(bean);
    logger.info("create(Afxtablefields={}) - entered bean ");

    final Afxtablefields result = dao.create(bean);

    logger.info("create(Afxtablefields) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxtablefields update(Afxtablefields bean) {
    requireNonNull(bean);
    logger.info("update(Afxtablefields={}) - entered bean ");

    final Afxtablefields result = dao.update(bean);

    logger.info("update(Afxtablefields) - exited - return value={} result ");
    return result;
  }
}
