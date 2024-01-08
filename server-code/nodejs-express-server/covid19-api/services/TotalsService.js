/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* getDailyReportTotals
* Get daily report data for whole world.
*
* date String Date of the report. If you don't put this field all dates will be returned. (optional)
* dateFormat String Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format. (optional)
* format String Format of the response. If you don't put this field JSON will be response format. (optional)
* returns List
* */
const getDailyReportTotals = ({ date, dateFormat, format }) => new Promise(
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
* getLatestTotals
* Get latest data for whole world.
*
* format String Format of the response (optional)
* returns List
* */
const getLatestTotals = ({ format }) => new Promise(
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

module.exports = {
  getDailyReportTotals,
  getLatestTotals,
};
