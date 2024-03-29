from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_response import CustomFieldResponse
from openapi_server import util

from openapi_server.models.custom_field_response import CustomFieldResponse  # noqa: E501

class GetCustomFieldsForWorkspace200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetCustomFieldsForWorkspace200Response - a model defined in OpenAPI

        :param data: The data of this GetCustomFieldsForWorkspace200Response.  # noqa: E501
        :type data: List[CustomFieldResponse]
        """
        self.openapi_types = {
            'data': List[CustomFieldResponse]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetCustomFieldsForWorkspace200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getCustomFieldsForWorkspace_200_response of this GetCustomFieldsForWorkspace200Response.  # noqa: E501
        :rtype: GetCustomFieldsForWorkspace200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[CustomFieldResponse]:
        """Gets the data of this GetCustomFieldsForWorkspace200Response.


        :return: The data of this GetCustomFieldsForWorkspace200Response.
        :rtype: List[CustomFieldResponse]
        """
        return self._data

    @data.setter
    def data(self, data: List[CustomFieldResponse]):
        """Sets the data of this GetCustomFieldsForWorkspace200Response.


        :param data: The data of this GetCustomFieldsForWorkspace200Response.
        :type data: List[CustomFieldResponse]
        """

        self._data = data
