/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* filterLeft_Square_BracketregionCodeRight_Square_Bracket List filter by attribute 'regionCode'
* filterLeft_Square_BracketreportDateRight_Square_Bracket List filter by attribute 'reportDate'
* filterLeft_Square_BracketreportTypeRight_Square_Bracket List filter by attribute 'reportType'
* filterLeft_Square_BracketvendorNumberRight_Square_Bracket List filter by attribute 'vendorNumber'
* returns File
* */
const financeReportsGet_collection = ({ filterLeft_Square_BracketregionCodeRight_Square_Bracket, filterLeft_Square_BracketreportDateRight_Square_Bracket, filterLeft_Square_BracketreportTypeRight_Square_Bracket, filterLeft_Square_BracketvendorNumberRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketregionCodeRight_Square_Bracket,
        filterLeft_Square_BracketreportDateRight_Square_Bracket,
        filterLeft_Square_BracketreportTypeRight_Square_Bracket,
        filterLeft_Square_BracketvendorNumberRight_Square_Bracket,
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
  financeReportsGet_collection,
};
