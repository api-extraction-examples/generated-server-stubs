/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* 5. Get list of codename details for Intel products.
* Use this to get codename details for Intel products. No pagination supported.
*
* localeUnderscoregeoUnderscoreid String Locale and Geo code used to get localised data.<br/><br/>
* returns Complete_codename_lsit
* */
const getCodeName = ({ localeUnderscoregeoUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        localeUnderscoregeoUnderscoreid,
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
* 2. Get complete product info with product id.
* Use this to get complete product info. No pagination supported.
*
* localeUnderscoregeoUnderscoreid String Locale and Geo code used to get localised data.<br/><br/>
* productUnderscoreid String Product id's that needs to be filtered. Only max of 40 products are supported now. Values must be enclosed in [ square brackets ] and each value must be in \"double quotes\". Use comma to add multiple values.<br/><br/>Example: [\"223\",\"224\"]
* includeUnderscorereference String If send \"true\", this will fetch variant/compatible info into result set. Default is false. (optional)
* returns Detailed_product_information
* */
const getProductInfo = ({ localeUnderscoregeoUnderscoreid, productUnderscoreid, includeUnderscorereference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        localeUnderscoregeoUnderscoreid,
        productUnderscoreid,
        includeUnderscorereference,
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
* 1. Find products by product id or category id
* Use this to get basic details of products with pagination. Can be used to generate listing page for products.
*
* localeUnderscoregeoUnderscoreid String Locale and Geo code used to get localised data.<br/><br/>
* categoryUnderscoreid String Filter products based on one or multiple category id. Either category id or product id is mandatory for any request. Values must be enclosed in [ square brackets ] and each value must be in \"double quotes\". Use comma to add multiple values. <br/><br/>Example: [\"873\"]<br/><br/>Categories Available:<br/> Processors = 873, Server Products = 1201, Mini PC's = 98414, Wireless Networking = 59485, Ethernet Products = 36773, Fabric products = 70021, Memory and Storage = 35125, Chipsets = 53, Graphics Drivers = 80939 <br/><br/> (optional)
* productUnderscoreid String Filter products based on one or multiple product id. Either category id or product id is mandatory for any request. Values must be enclosed in [ square brackets ] and each value must be in \"double quotes\". Use comma to add multiple values. <br/><br/>Example: [\"123003\"]<br/><br/> (optional)
* highlights String Specification values which needs to be pulled from product data. Values must be enclosed in [ square brackets ] and each value must be in \"double quotes\". Use comma to add multiple values. <br/><br/>Example: [\"CoreCount\", \"StatusCodeText\"]<br/><br/> (optional)
* sort String Indicates sorting fields. Accepts array of objects in format like: [{\"field\":\"name\",\"order\":\"ASC\"}].<br/><br/>Any specification that we get from get-product-info can be used to sort result. Other generic sort field is \"name\".<br/><br/> (optional)
* filters String Allows to filter data.<br/><br/>Format of filter: [{\"type\":\"specvalue\",\"name\":\"ThreadCount\",\"gteq\":\"4\"}]<br/><br/><b>Available operators are:</b> \"eq\": equal to, \"neq\": not equal to, \"lteq\": less than or equal to, \"gteq\": greater than or equal to, \"swc\": starts with characters, \"nswc\": not starting with characters, \"cts\": contains, \"ncts\": not contains<br/><br/><b>Conditions:</b> By default all objects works on an AND condition. But inside an object we have the capability to put an \"OR\" or \"AND\" condition.<br/>Example conditions: [{\"type\":\"specvalue\",\"name\":\"ThreadCount\",\"ncts\":\"4,5\",\"cond\":\"AND\"}]<br/><br/><br/> (optional)
* perUnderscorepage Integer Filter number of products in response to desired size. (optional)
* pageUnderscoreno Integer Indicates page number for pagination of results. (optional)
* returns Product_listing_level_info
* */
const getProductList = ({ localeUnderscoregeoUnderscoreid, categoryUnderscoreid, productUnderscoreid, highlights, sort, filters, perUnderscorepage, pageUnderscoreno }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        localeUnderscoregeoUnderscoreid,
        categoryUnderscoreid,
        productUnderscoreid,
        highlights,
        sort,
        filters,
        perUnderscorepage,
        pageUnderscoreno,
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
* 3. Get ordering info for product id's requested.
* Use this to fetch ordering info details for Intel products. No pagination supported.
*
* productUnderscoreid String Filter ordering info details based on one or multiple product id's. Values must be enclosed in [ square brackets ] and each value must be in \"double quotes\". Use comma to add multiple values. <br/><br/>Example: [\"123003\"]
* localeUnderscoregeoUnderscoreid String Locale and Geo code used to get localised data.<br/><br/>
* returns Detailed_ordering_level_info
* */
const getorderinginfo = ({ productUnderscoreid, localeUnderscoregeoUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        productUnderscoreid,
        localeUnderscoregeoUnderscoreid,
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
  getCodeName,
  getProductInfo,
  getProductList,
  getorderinginfo,
};
