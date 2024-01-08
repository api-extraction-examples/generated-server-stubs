/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a list of loaded plugins
* Get a list of loaded plugins.  *New in version 2.1.0* 
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* returns PluginCollection
* */
const get_plugins = ({ limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
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
  get_plugins,
};
