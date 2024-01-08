/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* filterLeft_Square_BracketpriceTierRight_Square_Bracket List filter by id(s) of related 'priceTier' (optional)
* filterLeft_Square_BracketterritoryRight_Square_Bracket List filter by id(s) of related 'territory' (optional)
* fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket List the fields to include for returned resources of type appPricePoints (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* returns AppPricePointsResponse
* */
const appPricePointsGet_collection = ({ filterLeft_Square_BracketpriceTierRight_Square_Bracket, filterLeft_Square_BracketterritoryRight_Square_Bracket, fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketpriceTierRight_Square_Bracket,
        filterLeft_Square_BracketterritoryRight_Square_Bracket,
        fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* returns AppPricePointResponse
* */
const appPricePointsGet_instance = ({ id, fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket, include, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPricePointsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* returns TerritoryResponse
* */
const appPricePointsTerritoryGet_to_one_related = ({ id, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
  appPricePointsGet_collection,
  appPricePointsGet_instance,
  appPricePointsTerritoryGet_to_one_related,
};
