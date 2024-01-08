from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class IssueTypeScreenSchemeUpdateDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, name=None):  # noqa: E501
        """IssueTypeScreenSchemeUpdateDetails - a model defined in OpenAPI

        :param description: The description of this IssueTypeScreenSchemeUpdateDetails.  # noqa: E501
        :type description: str
        :param name: The name of this IssueTypeScreenSchemeUpdateDetails.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'description': str,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name'
        }

        self._description = description
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'IssueTypeScreenSchemeUpdateDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IssueTypeScreenSchemeUpdateDetails of this IssueTypeScreenSchemeUpdateDetails.  # noqa: E501
        :rtype: IssueTypeScreenSchemeUpdateDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this IssueTypeScreenSchemeUpdateDetails.

        The description of the issue type screen scheme. The maximum length is 255 characters.  # noqa: E501

        :return: The description of this IssueTypeScreenSchemeUpdateDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this IssueTypeScreenSchemeUpdateDetails.

        The description of the issue type screen scheme. The maximum length is 255 characters.  # noqa: E501

        :param description: The description of this IssueTypeScreenSchemeUpdateDetails.
        :type description: str
        """

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this IssueTypeScreenSchemeUpdateDetails.

        The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.  # noqa: E501

        :return: The name of this IssueTypeScreenSchemeUpdateDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this IssueTypeScreenSchemeUpdateDetails.

        The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.  # noqa: E501

        :param name: The name of this IssueTypeScreenSchemeUpdateDetails.
        :type name: str
        """

        self._name = name
