from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.meta1 import Meta1
from openapi_server import util

from openapi_server.models.meta1 import Meta1  # noqa: E501

class AirRestServicesMetadataGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, results=None):  # noqa: E501
        """AirRestServicesMetadataGet200Response - a model defined in OpenAPI

        :param results: The results of this AirRestServicesMetadataGet200Response.  # noqa: E501
        :type results: Meta1
        """
        self.openapi_types = {
            'results': Meta1
        }

        self.attribute_map = {
            'results': 'Results'
        }

        self._results = results

    @classmethod
    def from_dict(cls, dikt) -> 'AirRestServicesMetadataGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _air_rest_services_metadata_get_200_response of this AirRestServicesMetadataGet200Response.  # noqa: E501
        :rtype: AirRestServicesMetadataGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def results(self) -> Meta1:
        """Gets the results of this AirRestServicesMetadataGet200Response.


        :return: The results of this AirRestServicesMetadataGet200Response.
        :rtype: Meta1
        """
        return self._results

    @results.setter
    def results(self, results: Meta1):
        """Sets the results of this AirRestServicesMetadataGet200Response.


        :param results: The results of this AirRestServicesMetadataGet200Response.
        :type results: Meta1
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results
