/**
 * The CountryController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CountryService');
const getDailyReportAllCountries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDailyReportAllCountries);
};

const getDailyReportByCountryCode = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDailyReportByCountryCode);
};

const getDailyReportByCountryName = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDailyReportByCountryName);
};

const getLatestAllCountries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestAllCountries);
};

const getLatestCountryDataByCode = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestCountryDataByCode);
};

const getLatestCountryDataByName = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestCountryDataByName);
};


module.exports = {
  getDailyReportAllCountries,
  getDailyReportByCountryCode,
  getDailyReportByCountryName,
  getLatestAllCountries,
  getLatestCountryDataByCode,
  getLatestCountryDataByName,
};
