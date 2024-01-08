from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ComponentIssuesCount(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, issue_count=None, _self=None):  # noqa: E501
        """ComponentIssuesCount - a model defined in OpenAPI

        :param issue_count: The issue_count of this ComponentIssuesCount.  # noqa: E501
        :type issue_count: int
        :param _self: The _self of this ComponentIssuesCount.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'issue_count': int,
            '_self': str
        }

        self.attribute_map = {
            'issue_count': 'issueCount',
            '_self': 'self'
        }

        self._issue_count = issue_count
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'ComponentIssuesCount':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ComponentIssuesCount of this ComponentIssuesCount.  # noqa: E501
        :rtype: ComponentIssuesCount
        """
        return util.deserialize_model(dikt, cls)

    @property
    def issue_count(self) -> int:
        """Gets the issue_count of this ComponentIssuesCount.

        The count of issues assigned to a component.  # noqa: E501

        :return: The issue_count of this ComponentIssuesCount.
        :rtype: int
        """
        return self._issue_count

    @issue_count.setter
    def issue_count(self, issue_count: int):
        """Sets the issue_count of this ComponentIssuesCount.

        The count of issues assigned to a component.  # noqa: E501

        :param issue_count: The issue_count of this ComponentIssuesCount.
        :type issue_count: int
        """

        self._issue_count = issue_count

    @property
    def _self(self) -> str:
        """Gets the _self of this ComponentIssuesCount.

        The URL for this count of issues for a component.  # noqa: E501

        :return: The _self of this ComponentIssuesCount.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this ComponentIssuesCount.

        The URL for this count of issues for a component.  # noqa: E501

        :param _self: The _self of this ComponentIssuesCount.
        :type _self: str
        """

        self.__self = _self