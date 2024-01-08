from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.authentication_info import AuthenticationInfo
from openapi_server import util

from openapi_server.models.authentication_info import AuthenticationInfo  # noqa: E501

class AuthenticationInfoQueryResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None, start_index=None, total_record_count=None):  # noqa: E501
        """AuthenticationInfoQueryResult - a model defined in OpenAPI

        :param items: The items of this AuthenticationInfoQueryResult.  # noqa: E501
        :type items: List[AuthenticationInfo]
        :param start_index: The start_index of this AuthenticationInfoQueryResult.  # noqa: E501
        :type start_index: int
        :param total_record_count: The total_record_count of this AuthenticationInfoQueryResult.  # noqa: E501
        :type total_record_count: int
        """
        self.openapi_types = {
            'items': List[AuthenticationInfo],
            'start_index': int,
            'total_record_count': int
        }

        self.attribute_map = {
            'items': 'Items',
            'start_index': 'StartIndex',
            'total_record_count': 'TotalRecordCount'
        }

        self._items = items
        self._start_index = start_index
        self._total_record_count = total_record_count

    @classmethod
    def from_dict(cls, dikt) -> 'AuthenticationInfoQueryResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AuthenticationInfoQueryResult of this AuthenticationInfoQueryResult.  # noqa: E501
        :rtype: AuthenticationInfoQueryResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[AuthenticationInfo]:
        """Gets the items of this AuthenticationInfoQueryResult.

        Gets or sets the items.  # noqa: E501

        :return: The items of this AuthenticationInfoQueryResult.
        :rtype: List[AuthenticationInfo]
        """
        return self._items

    @items.setter
    def items(self, items: List[AuthenticationInfo]):
        """Sets the items of this AuthenticationInfoQueryResult.

        Gets or sets the items.  # noqa: E501

        :param items: The items of this AuthenticationInfoQueryResult.
        :type items: List[AuthenticationInfo]
        """

        self._items = items

    @property
    def start_index(self) -> int:
        """Gets the start_index of this AuthenticationInfoQueryResult.

        The index of the first record in Items.  # noqa: E501

        :return: The start_index of this AuthenticationInfoQueryResult.
        :rtype: int
        """
        return self._start_index

    @start_index.setter
    def start_index(self, start_index: int):
        """Sets the start_index of this AuthenticationInfoQueryResult.

        The index of the first record in Items.  # noqa: E501

        :param start_index: The start_index of this AuthenticationInfoQueryResult.
        :type start_index: int
        """

        self._start_index = start_index

    @property
    def total_record_count(self) -> int:
        """Gets the total_record_count of this AuthenticationInfoQueryResult.

        The total number of records available.  # noqa: E501

        :return: The total_record_count of this AuthenticationInfoQueryResult.
        :rtype: int
        """
        return self._total_record_count

    @total_record_count.setter
    def total_record_count(self, total_record_count: int):
        """Sets the total_record_count of this AuthenticationInfoQueryResult.

        The total number of records available.  # noqa: E501

        :param total_record_count: The total_record_count of this AuthenticationInfoQueryResult.
        :type total_record_count: int
        """

        self._total_record_count = total_record_count