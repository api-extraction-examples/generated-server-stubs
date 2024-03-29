from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListAccountAliasesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, marker=None, max_items=None):  # noqa: E501
        """ListAccountAliasesRequest - a model defined in OpenAPI

        :param marker: The marker of this ListAccountAliasesRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListAccountAliasesRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListAccountAliasesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListAccountAliasesRequest of this ListAccountAliasesRequest.  # noqa: E501
        :rtype: ListAccountAliasesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def marker(self) -> str:
        """Gets the marker of this ListAccountAliasesRequest.


        :return: The marker of this ListAccountAliasesRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListAccountAliasesRequest.


        :param marker: The marker of this ListAccountAliasesRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListAccountAliasesRequest.


        :return: The max_items of this ListAccountAliasesRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListAccountAliasesRequest.


        :param max_items: The max_items of this ListAccountAliasesRequest.
        :type max_items: int
        """

        self._max_items = max_items
