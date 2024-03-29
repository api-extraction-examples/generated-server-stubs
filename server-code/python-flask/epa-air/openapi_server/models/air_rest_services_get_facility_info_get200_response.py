from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.air08 import Air08
from openapi_server import util

from openapi_server.models.air08 import Air08  # noqa: E501

class AirRestServicesGetFacilityInfoGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, results=None):  # noqa: E501
        """AirRestServicesGetFacilityInfoGet200Response - a model defined in OpenAPI

        :param results: The results of this AirRestServicesGetFacilityInfoGet200Response.  # noqa: E501
        :type results: Air08
        """
        self.openapi_types = {
            'results': Air08
        }

        self.attribute_map = {
            'results': 'Results'
        }

        self._results = results

    @classmethod
    def from_dict(cls, dikt) -> 'AirRestServicesGetFacilityInfoGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _air_rest_services_get_facility_info_get_200_response of this AirRestServicesGetFacilityInfoGet200Response.  # noqa: E501
        :rtype: AirRestServicesGetFacilityInfoGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def results(self) -> Air08:
        """Gets the results of this AirRestServicesGetFacilityInfoGet200Response.


        :return: The results of this AirRestServicesGetFacilityInfoGet200Response.
        :rtype: Air08
        """
        return self._results

    @results.setter
    def results(self, results: Air08):
        """Sets the results of this AirRestServicesGetFacilityInfoGet200Response.


        :param results: The results of this AirRestServicesGetFacilityInfoGet200Response.
        :type results: Air08
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results
