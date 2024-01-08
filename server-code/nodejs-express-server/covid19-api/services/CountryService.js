/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* getDailyReportAllCountries
* Get daily report for all countries. Date is mandatory parametar. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter.
*
* date String Date of the report.
* dateFormat String Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format. (optional)
* format String Format of the response (optional)
* returns List
* */
const getDailyReportAllCountries = ({ date, dateFormat, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        date,
        dateFormat,
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* getDailyReportByCountryCode
* Get daily report for specific country. Country code and date are mandatory in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter
*
* code String Country code. Country code is by ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type.
* date String Date of the report.
* dateFormat String Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format. (optional)
* format String Format of the response (optional)
* returns List
* */
const getDailyReportByCountryCode = ({ code, date, dateFormat, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        code,
        date,
        dateFormat,
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* getDailyReportByCountryName
* Get daily report for specific country. Country name and date are mandatory in parametars. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter
*
* name String Country name.
* date String Date of the report.
* dateFormat String Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format. (optional)
* format String Format of the response (optional)
* returns List
* */
const getDailyReportByCountryName = ({ name, date, dateFormat, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        date,
        dateFormat,
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* getLatestAllCountries
* Get latest data from all countries.
*
* format String Format of the response (optional)
* returns List
* */
const getLatestAllCountries = ({ format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* getLatestCountryDataByCode
* Get latest data for specific country. Country code and format are in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type.
*
* code String Country code
* format String Format of the response (optional)
* returns List
* */
const getLatestCountryDataByCode = ({ code, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        code,
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* getLatestCountryDataByName
* Get latest data for specific country. Country name and format are in parametars.
*
* name String Name of the country
* format String Format of the response (optional)
* returns List
* */
const getLatestCountryDataByName = ({ name, format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        format,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getDailyReportAllCountries,
  getDailyReportByCountryCode,
  getDailyReportByCountryName,
  getLatestAllCountries,
  getLatestCountryDataByCode,
  getLatestCountryDataByName,
};
