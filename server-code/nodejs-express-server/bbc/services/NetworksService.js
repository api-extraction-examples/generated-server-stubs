/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Networks
* All iPlayer Radio networks - contains business logic for masterbrand and service relationships 
*
* xAPIKey String API_KEY
* preset Boolean Returns all networks needed for iPlayer Radio responsive web navigation (optional)
* international Boolean Returns all networks available internationally (optional)
* returns NetworksResponse
* */
const getRadioNetworks = ({ xAPIKey, preset, international }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        preset,
        international,
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
  getRadioNetworks,
};
