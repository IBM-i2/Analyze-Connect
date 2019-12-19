/********************************************************************************
# * Licensed Materials - Property of IBM
# * (C) Copyright IBM Corporation 2019. All Rights Reserved
# *
# * This program and the accompanying materials are made available under the
# * terms of the Eclipse Public License 2.0 which is available at
# * http://www.eclipse.org/legal/epl-2.0.
# *
# * US Government Users Restricted Rights - Use, duplication or
# * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
# *
# ********************************************************************************/

package com.example.demo.rest.transport.request.seeded;

import lombok.ToString;

/**
 * Seed link request data containing the variables needed to define the seed link data
 */
@ToString(callSuper = true)
public class DaodSeedLinkData extends SeedDataBase {
    public Object fromEndId;
    public String fromEndTypeId;
    public Object toEndId;
    public String toEndTypeId;
    public String linkDirection;
}
