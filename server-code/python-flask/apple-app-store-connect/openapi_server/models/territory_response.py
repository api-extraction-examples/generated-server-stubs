from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.document_links import DocumentLinks
from openapi_server.models.territory import Territory
from openapi_server import util

from openapi_server.models.document_links import DocumentLinks  # noqa: E501
from openapi_server.models.territory import Territory  # noqa: E501

class TerritoryResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """TerritoryResponse - a model defined in OpenAPI

        :param data: The data of this TerritoryResponse.  # noqa: E501
        :type data: Territory
        :param links: The links of this TerritoryResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': Territory,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'TerritoryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TerritoryResponse of this TerritoryResponse.  # noqa: E501
        :rtype: TerritoryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> Territory:
        """Gets the data of this TerritoryResponse.


        :return: The data of this TerritoryResponse.
        :rtype: Territory
        """
        return self._data

    @data.setter
    def data(self, data: Territory):
        """Sets the data of this TerritoryResponse.


        :param data: The data of this TerritoryResponse.
        :type data: Territory
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this TerritoryResponse.


        :return: The links of this TerritoryResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this TerritoryResponse.


        :param links: The links of this TerritoryResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
