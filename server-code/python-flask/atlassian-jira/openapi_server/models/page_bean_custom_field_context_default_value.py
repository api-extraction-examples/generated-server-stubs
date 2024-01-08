from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_context_default_value import CustomFieldContextDefaultValue
from openapi_server import util

from openapi_server.models.custom_field_context_default_value import CustomFieldContextDefaultValue  # noqa: E501

class PageBeanCustomFieldContextDefaultValue(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, is_last=None, max_results=None, next_page=None, _self=None, start_at=None, total=None, values=None):  # noqa: E501
        """PageBeanCustomFieldContextDefaultValue - a model defined in OpenAPI

        :param is_last: The is_last of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type is_last: bool
        :param max_results: The max_results of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type max_results: int
        :param next_page: The next_page of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type next_page: str
        :param _self: The _self of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type _self: str
        :param start_at: The start_at of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type start_at: int
        :param total: The total of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type total: int
        :param values: The values of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :type values: List[CustomFieldContextDefaultValue]
        """
        self.openapi_types = {
            'is_last': bool,
            'max_results': int,
            'next_page': str,
            '_self': str,
            'start_at': int,
            'total': int,
            'values': List[CustomFieldContextDefaultValue]
        }

        self.attribute_map = {
            'is_last': 'isLast',
            'max_results': 'maxResults',
            'next_page': 'nextPage',
            '_self': 'self',
            'start_at': 'startAt',
            'total': 'total',
            'values': 'values'
        }

        self._is_last = is_last
        self._max_results = max_results
        self._next_page = next_page
        self.__self = _self
        self._start_at = start_at
        self._total = total
        self._values = values

    @classmethod
    def from_dict(cls, dikt) -> 'PageBeanCustomFieldContextDefaultValue':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PageBeanCustomFieldContextDefaultValue of this PageBeanCustomFieldContextDefaultValue.  # noqa: E501
        :rtype: PageBeanCustomFieldContextDefaultValue
        """
        return util.deserialize_model(dikt, cls)

    @property
    def is_last(self) -> bool:
        """Gets the is_last of this PageBeanCustomFieldContextDefaultValue.

        Whether this is the last page.  # noqa: E501

        :return: The is_last of this PageBeanCustomFieldContextDefaultValue.
        :rtype: bool
        """
        return self._is_last

    @is_last.setter
    def is_last(self, is_last: bool):
        """Sets the is_last of this PageBeanCustomFieldContextDefaultValue.

        Whether this is the last page.  # noqa: E501

        :param is_last: The is_last of this PageBeanCustomFieldContextDefaultValue.
        :type is_last: bool
        """

        self._is_last = is_last

    @property
    def max_results(self) -> int:
        """Gets the max_results of this PageBeanCustomFieldContextDefaultValue.

        The maximum number of items that could be returned.  # noqa: E501

        :return: The max_results of this PageBeanCustomFieldContextDefaultValue.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this PageBeanCustomFieldContextDefaultValue.

        The maximum number of items that could be returned.  # noqa: E501

        :param max_results: The max_results of this PageBeanCustomFieldContextDefaultValue.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def next_page(self) -> str:
        """Gets the next_page of this PageBeanCustomFieldContextDefaultValue.

        If there is another page of results, the URL of the next page.  # noqa: E501

        :return: The next_page of this PageBeanCustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._next_page

    @next_page.setter
    def next_page(self, next_page: str):
        """Sets the next_page of this PageBeanCustomFieldContextDefaultValue.

        If there is another page of results, the URL of the next page.  # noqa: E501

        :param next_page: The next_page of this PageBeanCustomFieldContextDefaultValue.
        :type next_page: str
        """

        self._next_page = next_page

    @property
    def _self(self) -> str:
        """Gets the _self of this PageBeanCustomFieldContextDefaultValue.

        The URL of the page.  # noqa: E501

        :return: The _self of this PageBeanCustomFieldContextDefaultValue.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this PageBeanCustomFieldContextDefaultValue.

        The URL of the page.  # noqa: E501

        :param _self: The _self of this PageBeanCustomFieldContextDefaultValue.
        :type _self: str
        """

        self.__self = _self

    @property
    def start_at(self) -> int:
        """Gets the start_at of this PageBeanCustomFieldContextDefaultValue.

        The index of the first item returned.  # noqa: E501

        :return: The start_at of this PageBeanCustomFieldContextDefaultValue.
        :rtype: int
        """
        return self._start_at

    @start_at.setter
    def start_at(self, start_at: int):
        """Sets the start_at of this PageBeanCustomFieldContextDefaultValue.

        The index of the first item returned.  # noqa: E501

        :param start_at: The start_at of this PageBeanCustomFieldContextDefaultValue.
        :type start_at: int
        """

        self._start_at = start_at

    @property
    def total(self) -> int:
        """Gets the total of this PageBeanCustomFieldContextDefaultValue.

        The number of items returned.  # noqa: E501

        :return: The total of this PageBeanCustomFieldContextDefaultValue.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this PageBeanCustomFieldContextDefaultValue.

        The number of items returned.  # noqa: E501

        :param total: The total of this PageBeanCustomFieldContextDefaultValue.
        :type total: int
        """

        self._total = total

    @property
    def values(self) -> List[CustomFieldContextDefaultValue]:
        """Gets the values of this PageBeanCustomFieldContextDefaultValue.

        The list of items.  # noqa: E501

        :return: The values of this PageBeanCustomFieldContextDefaultValue.
        :rtype: List[CustomFieldContextDefaultValue]
        """
        return self._values

    @values.setter
    def values(self, values: List[CustomFieldContextDefaultValue]):
        """Sets the values of this PageBeanCustomFieldContextDefaultValue.

        The list of items.  # noqa: E501

        :param values: The values of this PageBeanCustomFieldContextDefaultValue.
        :type values: List[CustomFieldContextDefaultValue]
        """

        self._values = values
