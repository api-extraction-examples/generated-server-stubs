/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List of categories
* Retrieve Categories 
*
* xAPIKey String API_KEY
* kind String Filter by provided query. E.g. 'promoted' returns promoted categories (optional)
* returns CategoriesResponse
* */
const categoriesGET = ({ xAPIKey, kind }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        kind,
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
* Category by ID
* Retrieve Categories by ID 
*
* xAPIKey String API_KEY
* id String Retrieve information about the category. E.g. 'sport-football-europeanchampionship'
* returns CategoriesResponse
* */
const categoriesIdGET = ({ xAPIKey, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        id,
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
  categoriesGET,
  categoriesIdGET,
};
