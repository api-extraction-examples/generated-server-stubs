/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This endpoint returns contract history from FPDS for a specific vendor
* <p>This endpoint returns contract history from FPDS for a specific vendor. The vendor's DUNS number is a required parameter. You can also filter contracts by their NAICS code to find contracts relevant to a particular category.</p>
*
* duns String A 9-digit DUNS number that uniquely identifies a vendor (required).
* naics String a six digit NAICS code used to filter by contracts with a certain NAICS (optional)
* sort String a field to sort on. Choices are date, status, agency, and amount (optional)
* direction String The sort direction of the results. Choices are asc or desc. (optional)
* page String the page to start on. Results are paginated in increments of 100. Begins at page=1. (optional)
* returns Object
* */
const list_Contracts_GET = ({ duns, naics, sort, direction, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        duns,
        naics,
        sort,
        direction,
        page,
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
  list_Contracts_GET,
};
