from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class IssueFilterForBulkPropertySet(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, current_value=None, entity_ids=None, has_property=None):  # noqa: E501
        """IssueFilterForBulkPropertySet - a model defined in OpenAPI

        :param current_value: The current_value of this IssueFilterForBulkPropertySet.  # noqa: E501
        :type current_value: object
        :param entity_ids: The entity_ids of this IssueFilterForBulkPropertySet.  # noqa: E501
        :type entity_ids: list[int]
        :param has_property: The has_property of this IssueFilterForBulkPropertySet.  # noqa: E501
        :type has_property: bool
        """
        self.openapi_types = {
            'current_value': object,
            'entity_ids': list[int],
            'has_property': bool
        }

        self.attribute_map = {
            'current_value': 'currentValue',
            'entity_ids': 'entityIds',
            'has_property': 'hasProperty'
        }

        self._current_value = current_value
        self._entity_ids = entity_ids
        self._has_property = has_property

    @classmethod
    def from_dict(cls, dikt) -> 'IssueFilterForBulkPropertySet':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IssueFilterForBulkPropertySet of this IssueFilterForBulkPropertySet.  # noqa: E501
        :rtype: IssueFilterForBulkPropertySet
        """
        return util.deserialize_model(dikt, cls)

    @property
    def current_value(self) -> object:
        """Gets the current_value of this IssueFilterForBulkPropertySet.

        The value of properties to perform the bulk operation on.  # noqa: E501

        :return: The current_value of this IssueFilterForBulkPropertySet.
        :rtype: object
        """
        return self._current_value

    @current_value.setter
    def current_value(self, current_value: object):
        """Sets the current_value of this IssueFilterForBulkPropertySet.

        The value of properties to perform the bulk operation on.  # noqa: E501

        :param current_value: The current_value of this IssueFilterForBulkPropertySet.
        :type current_value: object
        """

        self._current_value = current_value

    @property
    def entity_ids(self) -> list[int]:
        """Gets the entity_ids of this IssueFilterForBulkPropertySet.

        List of issues to perform the bulk operation on.  # noqa: E501

        :return: The entity_ids of this IssueFilterForBulkPropertySet.
        :rtype: list[int]
        """
        return self._entity_ids

    @entity_ids.setter
    def entity_ids(self, entity_ids: list[int]):
        """Sets the entity_ids of this IssueFilterForBulkPropertySet.

        List of issues to perform the bulk operation on.  # noqa: E501

        :param entity_ids: The entity_ids of this IssueFilterForBulkPropertySet.
        :type entity_ids: list[int]
        """

        self._entity_ids = entity_ids

    @property
    def has_property(self) -> bool:
        """Gets the has_property of this IssueFilterForBulkPropertySet.

        Whether the bulk operation occurs only when the property is present on or absent from an issue.  # noqa: E501

        :return: The has_property of this IssueFilterForBulkPropertySet.
        :rtype: bool
        """
        return self._has_property

    @has_property.setter
    def has_property(self, has_property: bool):
        """Sets the has_property of this IssueFilterForBulkPropertySet.

        Whether the bulk operation occurs only when the property is present on or absent from an issue.  # noqa: E501

        :param has_property: The has_property of this IssueFilterForBulkPropertySet.
        :type has_property: bool
        """

        self._has_property = has_property
