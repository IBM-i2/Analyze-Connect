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

const express = require("express");
const logger = require("morgan");
const cookieParser = require("cookie-parser");
const bodyParser = require("body-parser");

const socrata = require("./socrata-config.js");

const schema = require("./routes/schema");
const chartingSchemes = require("./routes/charting-schemes");
const config = require("./routes/config");
const validate = require("./routes/validate");
const acquire = require("./routes/acquire");

const app = express();

const env = process.env.NODE_ENV || "development";
app.locals.ENV = env;
app.locals.ENV_DEVELOPMENT = env == "development";

app.use(logger("dev"));
app.use(bodyParser.json());
app.use(
  bodyParser.urlencoded({
    extended: true
  })
);
app.use(cookieParser());

if (socrata.token == "SET YOUR TOKEN") {
  console.log(
    "You need to set Socrata token before starting the connector...\n"
  );
  process.exit(1);
}

app.use("", config);
app.use("", schema);
app.use("", chartingSchemes)
app.use("", validate);
app.use("", acquire);

app.disable("etag");

/// catch 404 and forward to error handler
app.use((req, res, next) => {
  const err = new Error("Not Found");
  err.status = 404;
  next(err);
});

module.exports = app;
