/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This endpoint lists all of the NAICS codes that are relevant to the OASIS family of vehicles
* <p>This endpoint lists all of the NAICS codes that are relevant to the OASIS family of vehicles. It takes no parameters.</p>
*
* returns Object
* */
const list_Naics_GET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  list_Naics_GET,
};
