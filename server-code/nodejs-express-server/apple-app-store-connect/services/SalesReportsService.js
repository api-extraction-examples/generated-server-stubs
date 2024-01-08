/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* filterLeft_Square_BracketfrequencyRight_Square_Bracket List filter by attribute 'frequency'
* filterLeft_Square_BracketreportSubTypeRight_Square_Bracket List filter by attribute 'reportSubType'
* filterLeft_Square_BracketreportTypeRight_Square_Bracket List filter by attribute 'reportType'
* filterLeft_Square_BracketvendorNumberRight_Square_Bracket List filter by attribute 'vendorNumber'
* filterLeft_Square_BracketreportDateRight_Square_Bracket List filter by attribute 'reportDate' (optional)
* filterLeft_Square_BracketversionRight_Square_Bracket List filter by attribute 'version' (optional)
* returns File
* */
const salesReportsGet_collection = ({ filterLeft_Square_BracketfrequencyRight_Square_Bracket, filterLeft_Square_BracketreportSubTypeRight_Square_Bracket, filterLeft_Square_BracketreportTypeRight_Square_Bracket, filterLeft_Square_BracketvendorNumberRight_Square_Bracket, filterLeft_Square_BracketreportDateRight_Square_Bracket, filterLeft_Square_BracketversionRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketfrequencyRight_Square_Bracket,
        filterLeft_Square_BracketreportSubTypeRight_Square_Bracket,
        filterLeft_Square_BracketreportTypeRight_Square_Bracket,
        filterLeft_Square_BracketvendorNumberRight_Square_Bracket,
        filterLeft_Square_BracketreportDateRight_Square_Bracket,
        filterLeft_Square_BracketversionRight_Square_Bracket,
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
  salesReportsGet_collection,
};
