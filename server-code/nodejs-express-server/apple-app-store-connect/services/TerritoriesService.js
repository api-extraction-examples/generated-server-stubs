/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* limit Integer maximum resources per page (optional)
* returns TerritoriesResponse
* */
const territoriesGet_collection = ({ fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
  territoriesGet_collection,
};
