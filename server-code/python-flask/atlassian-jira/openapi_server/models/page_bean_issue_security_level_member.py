from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.issue_security_level_member import IssueSecurityLevelMember
from openapi_server import util

from openapi_server.models.issue_security_level_member import IssueSecurityLevelMember  # noqa: E501

class PageBeanIssueSecurityLevelMember(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, is_last=None, max_results=None, next_page=None, _self=None, start_at=None, total=None, values=None):  # noqa: E501
        """PageBeanIssueSecurityLevelMember - a model defined in OpenAPI

        :param is_last: The is_last of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type is_last: bool
        :param max_results: The max_results of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type max_results: int
        :param next_page: The next_page of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type next_page: str
        :param _self: The _self of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type _self: str
        :param start_at: The start_at of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type start_at: int
        :param total: The total of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type total: int
        :param values: The values of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :type values: List[IssueSecurityLevelMember]
        """
        self.openapi_types = {
            'is_last': bool,
            'max_results': int,
            'next_page': str,
            '_self': str,
            'start_at': int,
            'total': int,
            'values': List[IssueSecurityLevelMember]
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
    def from_dict(cls, dikt) -> 'PageBeanIssueSecurityLevelMember':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PageBeanIssueSecurityLevelMember of this PageBeanIssueSecurityLevelMember.  # noqa: E501
        :rtype: PageBeanIssueSecurityLevelMember
        """
        return util.deserialize_model(dikt, cls)

    @property
    def is_last(self) -> bool:
        """Gets the is_last of this PageBeanIssueSecurityLevelMember.

        Whether this is the last page.  # noqa: E501

        :return: The is_last of this PageBeanIssueSecurityLevelMember.
        :rtype: bool
        """
        return self._is_last

    @is_last.setter
    def is_last(self, is_last: bool):
        """Sets the is_last of this PageBeanIssueSecurityLevelMember.

        Whether this is the last page.  # noqa: E501

        :param is_last: The is_last of this PageBeanIssueSecurityLevelMember.
        :type is_last: bool
        """

        self._is_last = is_last

    @property
    def max_results(self) -> int:
        """Gets the max_results of this PageBeanIssueSecurityLevelMember.

        The maximum number of items that could be returned.  # noqa: E501

        :return: The max_results of this PageBeanIssueSecurityLevelMember.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this PageBeanIssueSecurityLevelMember.

        The maximum number of items that could be returned.  # noqa: E501

        :param max_results: The max_results of this PageBeanIssueSecurityLevelMember.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def next_page(self) -> str:
        """Gets the next_page of this PageBeanIssueSecurityLevelMember.

        If there is another page of results, the URL of the next page.  # noqa: E501

        :return: The next_page of this PageBeanIssueSecurityLevelMember.
        :rtype: str
        """
        return self._next_page

    @next_page.setter
    def next_page(self, next_page: str):
        """Sets the next_page of this PageBeanIssueSecurityLevelMember.

        If there is another page of results, the URL of the next page.  # noqa: E501

        :param next_page: The next_page of this PageBeanIssueSecurityLevelMember.
        :type next_page: str
        """

        self._next_page = next_page

    @property
    def _self(self) -> str:
        """Gets the _self of this PageBeanIssueSecurityLevelMember.

        The URL of the page.  # noqa: E501

        :return: The _self of this PageBeanIssueSecurityLevelMember.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this PageBeanIssueSecurityLevelMember.

        The URL of the page.  # noqa: E501

        :param _self: The _self of this PageBeanIssueSecurityLevelMember.
        :type _self: str
        """

        self.__self = _self

    @property
    def start_at(self) -> int:
        """Gets the start_at of this PageBeanIssueSecurityLevelMember.

        The index of the first item returned.  # noqa: E501

        :return: The start_at of this PageBeanIssueSecurityLevelMember.
        :rtype: int
        """
        return self._start_at

    @start_at.setter
    def start_at(self, start_at: int):
        """Sets the start_at of this PageBeanIssueSecurityLevelMember.

        The index of the first item returned.  # noqa: E501

        :param start_at: The start_at of this PageBeanIssueSecurityLevelMember.
        :type start_at: int
        """

        self._start_at = start_at

    @property
    def total(self) -> int:
        """Gets the total of this PageBeanIssueSecurityLevelMember.

        The number of items returned.  # noqa: E501

        :return: The total of this PageBeanIssueSecurityLevelMember.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this PageBeanIssueSecurityLevelMember.

        The number of items returned.  # noqa: E501

        :param total: The total of this PageBeanIssueSecurityLevelMember.
        :type total: int
        """

        self._total = total

    @property
    def values(self) -> List[IssueSecurityLevelMember]:
        """Gets the values of this PageBeanIssueSecurityLevelMember.

        The list of items.  # noqa: E501

        :return: The values of this PageBeanIssueSecurityLevelMember.
        :rtype: List[IssueSecurityLevelMember]
        """
        return self._values

    @values.setter
    def values(self, values: List[IssueSecurityLevelMember]):
        """Sets the values of this PageBeanIssueSecurityLevelMember.

        The list of items.  # noqa: E501

        :param values: The values of this PageBeanIssueSecurityLevelMember.
        :type values: List[IssueSecurityLevelMember]
        """

        self._values = values
