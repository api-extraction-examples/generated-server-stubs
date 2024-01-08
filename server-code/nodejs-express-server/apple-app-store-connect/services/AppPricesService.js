/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappPricesRight_Square_Bracket List the fields to include for returned resources of type appPrices (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPriceResponse
* */
const appPricesGet_instance = ({ id, fieldsLeft_Square_BracketappPricesRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPricesRight_Square_Bracket,
        include,
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
  appPricesGet_instance,
};
