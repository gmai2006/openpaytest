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
import com.openpay.test.dao.MisthZptitlosDao;
import com.openpay.test.entity.MisthZptitlos;
import com.openpay.test.entity.MisthZptitlosId;

@Stateless
@Named("DefaultMisthZptitlosService")
public class DefaultMisthZptitlosService implements MisthZptitlosService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZptitlosDao dao;

  @Inject
  @Named("DefaultMisthZptitlosDao")
  public DefaultMisthZptitlosService(final MisthZptitlosDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptitlos find(MisthZptitlosId id) {
    final MisthZptitlos result = dao.find(id);
    logger.info("find(MisthZptitlos) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZptitlos> select(int maxResult) {
    final List<MisthZptitlos> result = dao.select(maxResult);
    logger.info("select(MisthZptitlos) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZptitlos> selectAll() {
    final List<MisthZptitlos> results = dao.selectAll();
    logger.info("selectAll(MisthZptitlos) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptitlos create(MisthZptitlos bean) {
    requireNonNull(bean);
    logger.info("create(MisthZptitlos={}) - entered bean ");

    final MisthZptitlos result = dao.create(bean);

    logger.info("create(MisthZptitlos) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZptitlos update(MisthZptitlos bean) {
    requireNonNull(bean);
    logger.info("update(MisthZptitlos={}) - entered bean ");

    final MisthZptitlos result = dao.update(bean);

    logger.info("update(MisthZptitlos) - exited - return value={} result ");
    return result;
  }
}
