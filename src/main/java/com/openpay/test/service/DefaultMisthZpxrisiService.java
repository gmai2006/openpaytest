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
import com.openpay.test.dao.MisthZpxrisiDao;
import com.openpay.test.entity.MisthZpxrisi;

@Stateless
@Named("DefaultMisthZpxrisiService")
public class DefaultMisthZpxrisiService implements MisthZpxrisiService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpxrisiDao dao;

  @Inject
  @Named("DefaultMisthZpxrisiDao")
  public DefaultMisthZpxrisiService(final MisthZpxrisiDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpxrisi find(java.lang.String id) {

    final MisthZpxrisi result = dao.find(id);
    logger.info("find(MisthZpxrisi) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpxrisi> select(int maxResult) {
    final List<MisthZpxrisi> result = dao.select(maxResult);
    logger.info("select(MisthZpxrisi) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpxrisi> selectAll() {
    final List<MisthZpxrisi> results = dao.selectAll();
    logger.info("selectAll(MisthZpxrisi) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpxrisi create(MisthZpxrisi bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpxrisi={}) - entered bean ");

    final MisthZpxrisi result = dao.create(bean);

    logger.info("create(MisthZpxrisi) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpxrisi update(MisthZpxrisi bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpxrisi={}) - entered bean ");

    final MisthZpxrisi result = dao.update(bean);

    logger.info("update(MisthZpxrisi) - exited - return value={} result ");
    return result;
  }
}
