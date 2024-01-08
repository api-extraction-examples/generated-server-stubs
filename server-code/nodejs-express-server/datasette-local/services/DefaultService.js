/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Execute a SQLite SQL query against the content database
* Accepts SQLite SQL query, returns JSON. Does not allow PRAGMA statements.
*
* sql String The SQL query to be executed
* Underscoreshape String The shape of the response data. Must be \"array\"
* returns List
* */
const query = ({ sql, Underscoreshape }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sql,
        Underscoreshape,
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
  query,
};
