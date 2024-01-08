from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.application_role import ApplicationRole
from openapi_server import util

from openapi_server.models.application_role import ApplicationRole  # noqa: E501

class UserApplicationRoles(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, callback=None, items=None, max_results=None, paging_callback=None, size=None):  # noqa: E501
        """UserApplicationRoles - a model defined in OpenAPI

        :param callback: The callback of this UserApplicationRoles.  # noqa: E501
        :type callback: object
        :param items: The items of this UserApplicationRoles.  # noqa: E501
        :type items: List[ApplicationRole]
        :param max_results: The max_results of this UserApplicationRoles.  # noqa: E501
        :type max_results: int
        :param paging_callback: The paging_callback of this UserApplicationRoles.  # noqa: E501
        :type paging_callback: object
        :param size: The size of this UserApplicationRoles.  # noqa: E501
        :type size: int
        """
        self.openapi_types = {
            'callback': object,
            'items': List[ApplicationRole],
            'max_results': int,
            'paging_callback': object,
            'size': int
        }

        self.attribute_map = {
            'callback': 'callback',
            'items': 'items',
            'max_results': 'max-results',
            'paging_callback': 'pagingCallback',
            'size': 'size'
        }

        self._callback = callback
        self._items = items
        self._max_results = max_results
        self._paging_callback = paging_callback
        self._size = size

    @classmethod
    def from_dict(cls, dikt) -> 'UserApplicationRoles':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The User_applicationRoles of this UserApplicationRoles.  # noqa: E501
        :rtype: UserApplicationRoles
        """
        return util.deserialize_model(dikt, cls)

    @property
    def callback(self) -> object:
        """Gets the callback of this UserApplicationRoles.


        :return: The callback of this UserApplicationRoles.
        :rtype: object
        """
        return self._callback

    @callback.setter
    def callback(self, callback: object):
        """Sets the callback of this UserApplicationRoles.


        :param callback: The callback of this UserApplicationRoles.
        :type callback: object
        """

        self._callback = callback

    @property
    def items(self) -> List[ApplicationRole]:
        """Gets the items of this UserApplicationRoles.


        :return: The items of this UserApplicationRoles.
        :rtype: List[ApplicationRole]
        """
        return self._items

    @items.setter
    def items(self, items: List[ApplicationRole]):
        """Sets the items of this UserApplicationRoles.


        :param items: The items of this UserApplicationRoles.
        :type items: List[ApplicationRole]
        """

        self._items = items

    @property
    def max_results(self) -> int:
        """Gets the max_results of this UserApplicationRoles.


        :return: The max_results of this UserApplicationRoles.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this UserApplicationRoles.


        :param max_results: The max_results of this UserApplicationRoles.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def paging_callback(self) -> object:
        """Gets the paging_callback of this UserApplicationRoles.


        :return: The paging_callback of this UserApplicationRoles.
        :rtype: object
        """
        return self._paging_callback

    @paging_callback.setter
    def paging_callback(self, paging_callback: object):
        """Sets the paging_callback of this UserApplicationRoles.


        :param paging_callback: The paging_callback of this UserApplicationRoles.
        :type paging_callback: object
        """

        self._paging_callback = paging_callback

    @property
    def size(self) -> int:
        """Gets the size of this UserApplicationRoles.


        :return: The size of this UserApplicationRoles.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this UserApplicationRoles.


        :param size: The size of this UserApplicationRoles.
        :type size: int
        """

        self._size = size
