/********************************************************************************
# * Licensed Materials - Property of IBM
# * (C) Copyright IBM Corporation 2021. All Rights Reserved
# *
# * This program and the accompanying materials are made available under the
# * terms of the Eclipse Public License 2.0 which is available at
# * http://www.eclipse.org/legal/epl-2.0.
# *
# * US Government Users Restricted Rights - Use, duplication or
# * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
# *
# ********************************************************************************/

package com.i2group.demo.rest.transport.request.seeded;

import java.util.List;
import java.util.Map;

/**
 * An object containing the list of selected entities and links as well as their corresponding items
 * types as they are selected on the Analyst's Notebook Premium chart.
 */
public class DaodSeeds {
  public List<DaodSeedEntityData> entities;
  public List<DaodSeedLinkData> links;
  public List<?> allItemTypes;
}
