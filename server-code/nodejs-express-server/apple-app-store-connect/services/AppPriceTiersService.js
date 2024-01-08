/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket List the fields to include for returned resources of type appPriceTiers (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket List the fields to include for returned resources of type appPricePoints (optional)
* limitLeft_Square_BracketpricePointsRight_Square_Bracket Integer maximum number of related pricePoints returned (when they are included) (optional)
* returns AppPriceTiersResponse
* */
const appPriceTiersGet_collection = ({ filterLeft_Square_BracketidRight_Square_Bracket, fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket, limitLeft_Square_BracketpricePointsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketidRight_Square_Bracket,
        fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket,
        limitLeft_Square_BracketpricePointsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket List the fields to include for returned resources of type appPriceTiers (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket List the fields to include for returned resources of type appPricePoints (optional)
* limitLeft_Square_BracketpricePointsRight_Square_Bracket Integer maximum number of related pricePoints returned (when they are included) (optional)
* returns AppPriceTierResponse
* */
const appPriceTiersGet_instance = ({ id, fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket, include, fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket, limitLeft_Square_BracketpricePointsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket,
        limitLeft_Square_BracketpricePointsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket List the fields to include for returned resources of type appPricePoints (optional)
* limit Integer maximum resources per page (optional)
* returns AppPricePointsResponse
* */
const appPriceTiersPricePointsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket,
        limit,
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
  appPriceTiersGet_collection,
  appPriceTiersGet_instance,
  appPriceTiersPricePointsGet_to_many_related,
};
