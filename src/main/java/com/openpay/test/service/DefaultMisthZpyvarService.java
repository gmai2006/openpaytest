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
import com.openpay.test.dao.MisthZpyvarDao;
import com.openpay.test.entity.MisthZpyvar;
import com.openpay.test.entity.MisthZpyvarId;

@Stateless
@Named("DefaultMisthZpyvarService")
public class DefaultMisthZpyvarService implements MisthZpyvarService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpyvarDao dao;

  @Inject
  @Named("DefaultMisthZpyvarDao")
  public DefaultMisthZpyvarService(final MisthZpyvarDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar find(MisthZpyvarId id) {
    final MisthZpyvar result = dao.find(id);
    logger.info("find(MisthZpyvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpyvar> select(int maxResult) {
    final List<MisthZpyvar> result = dao.select(maxResult);
    logger.info("select(MisthZpyvar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpyvar> selectAll() {
    final List<MisthZpyvar> results = dao.selectAll();
    logger.info("selectAll(MisthZpyvar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar create(MisthZpyvar bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpyvar={}) - entered bean ");

    final MisthZpyvar result = dao.create(bean);

    logger.info("create(MisthZpyvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpyvar update(MisthZpyvar bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpyvar={}) - entered bean ");

    final MisthZpyvar result = dao.update(bean);

    logger.info("update(MisthZpyvar) - exited - return value={} result ");
    return result;
  }
}
