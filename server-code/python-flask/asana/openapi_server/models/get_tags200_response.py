from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.tag_compact import TagCompact
from openapi_server import util

from openapi_server.models.tag_compact import TagCompact  # noqa: E501

class GetTags200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetTags200Response - a model defined in OpenAPI

        :param data: The data of this GetTags200Response.  # noqa: E501
        :type data: List[TagCompact]
        """
        self.openapi_types = {
            'data': List[TagCompact]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetTags200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getTags_200_response of this GetTags200Response.  # noqa: E501
        :rtype: GetTags200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[TagCompact]:
        """Gets the data of this GetTags200Response.


        :return: The data of this GetTags200Response.
        :rtype: List[TagCompact]
        """
        return self._data

    @data.setter
    def data(self, data: List[TagCompact]):
        """Sets the data of this GetTags200Response.


        :param data: The data of this GetTags200Response.
        :type data: List[TagCompact]
        """

        self._data = data
